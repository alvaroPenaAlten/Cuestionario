package com.CursoSprintBoot.Controllers;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "API CUSTOMERS",
                description = "Our application displays, registers, modifies and removes users from the database",
                termsOfService = "http://localhost:8080/sistema/api/v1/terminos-servicios",
                version = "1.0.0",
                contact = @Contact(
                        name = "Álvaro Peña",
                        url = "http://localhost:8080/sistema/api/v1/contact",
                        email = "alvaro.pena@alten.es"
                ),
                license = @License(
                        name = "Standar Software Use Licence for Alvaro-Alten",
                        url = "http://localhost:8080/sistema/api/v1/licence"
                )
        ),
        servers = {
                @Server(
                        description = "DEV SERVER",
                        url = "http://localhost:8080/sistema/api/v1"
                )
        }
)

public class SwaggerConfig {}
