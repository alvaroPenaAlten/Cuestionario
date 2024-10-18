package com.example.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = {"com.example.core", "com.example.rest"})
@EnableJpaRepositories(basePackages = "com.example.core.repository")
@EntityScan(basePackages = "com.example.core.domain")
@SpringBootApplication
public class Practica1Application {

  public static void main(String[] args) {
    SpringApplication.run(Practica1Application.class, args);
  }
}
