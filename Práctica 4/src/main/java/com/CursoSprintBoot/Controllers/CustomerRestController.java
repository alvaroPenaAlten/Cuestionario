package com.CursoSprintBoot.Controllers;

import com.CursoSprintBoot.domain.Customer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/clientes")
@Tag(name = "Customers", description = "Controller for Customers")
public class CustomerRestController {

    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(123,"Alvaro","AlvaPena","alva123"),
            new Customer(456,"Pepe","pepitoperez","pep568"),
            new Customer(153,"Victor","victorManuel","manuel568"),
            new Customer(586,"Jose","JoseAntio","joseantonio563")
    ));

    @GetMapping
    @Operation(
            summary = "Get Users",
            description = "Get all users for de database",
            tags = {"List<Customer>"},
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Sucessful getUsers",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema()
                            )
                    )
            }
    )
    public ResponseEntity<List<Customer>> getCustomers(){
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/{username}")
    @Operation(
            summary = "Get Users by username",
            description = "Get user by username",
            tags = {"username"},
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Sucessful and view User",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema()
                            )
                    )
            }
    )
    public ResponseEntity<?> getCliente(@PathVariable String username){
        for (Customer c : customers){
            if(c.getUsername().equalsIgnoreCase(username)){
                return ResponseEntity.ok(c);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario NO encontrado con username: "+ username);
    }

    @PostMapping
    @Operation(
            summary = "Create User",
            description = "Create user by id, name, username, password",
            tags = {"Create"},
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Create User for database",
                    required = true,
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Customer.class)
                    )
            ),
            responses = {
                    @ApiResponse(
                            responseCode = "201",
                            description = "A new resource was created successfully.",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ResponseEntity.class)
                            )
                    )
            }
    )
    public ResponseEntity<?> postCliente(@RequestBody Customer customer){
        customers.add(customer);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{username}")
                .buildAndExpand(customer.getUsername())
                .toUri();
        return ResponseEntity.created(location).body(customer);

    }

    @PutMapping
    @Operation(
            summary = "Total User Modification",
            description = "Total user modification by id",
            tags = {"modification"},
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Update total User for database",
                    required = true,
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Customer.class)
                    )
            ),
            responses = {
                    @ApiResponse(
                            responseCode = "204",
                            description = "No content",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ResponseEntity.class)
                            )
                    )
            }
    )
    public ResponseEntity<?> putCliente(@RequestBody Customer customer){
        for(Customer c : customers){
            if(c.getId() == customer.getId()){
                c.setName(customer.getName());
                c.setUsername(customer.getUsername());
                c.setPassword(customer.getPassword());

                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente NO encontrado con username: "+customer.getId());
    }


    @DeleteMapping("/{id}")
    @Operation(
            summary = "Delete user",
            description = "Delete user for database for with id",
            tags = {"id"},
            responses = {
                    @ApiResponse(
                            responseCode = "204",
                            description = "No content",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ResponseEntity.class)
                            )
                    )
            }
    )
    public ResponseEntity<?> deleteCliente(@PathVariable int id){
        for(Customer c : customers){
            if(c.getId() == id){
                customers.remove(c);

                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.notFound().build();
    }

    // @RequestMapping(method = RequestMethod.PATCH)
    @PatchMapping
    @Operation(
            summary = "Update Parcial User",
            description = "Update Parcial user for database",
            tags = {"parcial"},
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Update Parcial User for database",
                    required = true,
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Customer.class)
                    )
            ),
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Cliente modificado correctamente con id: id",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ResponseEntity.class)
                            )
                    )
            }
    )
    public ResponseEntity<?> patchCliente(@RequestBody Customer customer){
        for(Customer c : customers){
            if(c.getId() == customer.getId()){

                if(customer.getName() != null){
                    c.setName(customer.getName());
                }
                if(customer.getUsername() != null){
                    c.setUsername(customer.getUsername());
                }
                if(customer.getPassword() != null){
                    c.setPassword(customer.getPassword());
                }

                return ResponseEntity.ok("Cliente modificado correctamente con id: "+customer.getId());
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente NO encontrado con el id: "+customer.getId());
    }
}
