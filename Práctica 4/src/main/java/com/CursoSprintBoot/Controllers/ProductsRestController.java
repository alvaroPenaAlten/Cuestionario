package com.CursoSprintBoot.Controllers;

import com.CursoSprintBoot.domain.Product;
import com.CursoSprintBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductsRestController {

  //Inyección de dependencia
  @Autowired
  private ProductService productsService;

  @GetMapping
  public ResponseEntity<?> getProducts() {

    List<Product> products = productsService.getProducts();

    return ResponseEntity.ok(products);
  }
}
