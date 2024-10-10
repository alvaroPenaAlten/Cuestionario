package com.CursoSprintBoot.service;

import com.CursoSprintBoot.domain.Product;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@ConditionalOnProperty(name = "service.products", havingValue = "list")
public class ProductsServiceImpl implements ProductService {

  List<Product> products =
      new ArrayList<>(
          Arrays.asList(
              new Product(001, "Laptop", 856.98, 20),
              new Product(002, "Smartphone", 650.20, 50),
              new Product(003, "Tablet", 360.99, 76),
              new Product(004, "Smartwatch", 99.99, 86)));

  @Override
  public List<Product> getProducts() {
    return products;
  }
}
