package com.sam.product_microservice.controller;

import com.sam.product_microservice.entity.ProductEntity;
import com.sam.product_microservice.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<ProductEntity> getAllProducts() {
    return productRepository.findAll();
  }

  /* EJEMPLO DE USO DEL ResponseEntity PARA NO USAR @ResponseStatus.
  @GetMapping
  public ResponseEntity<List<ProductEntity>> getAllProduct2() {
    List<ProductEntity> productEntities = productRepository.findAll();
    ResponseEntity<List<ProductEntity>> responseEntity = new ResponseEntity<>(productEntities, HttpStatus.OK);
    return responseEntity;
  } */

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public void createProduct(@RequestBody ProductEntity productEntity) {
    /* System.out.println("Received product: " + productEntity);
    System.out.println("Product Name: " + productEntity.getProductName());
    System.out.println("Product Description: " + productEntity.getProductDescription());
    System.out.println("Unit Price: " + productEntity.getUnitPrice()); */
    productRepository.save(productEntity);
  }

}
