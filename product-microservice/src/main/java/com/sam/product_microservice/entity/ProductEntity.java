package com.sam.product_microservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "product")
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {
  @Id
  private String id;
  private String productName;
  private String productDescription;
  private Double unitPrice;

 public void setId(String id) { this.id = id; }
  public String getProductName() { return productName; }
  public void setProductName(String productName) { this.productName = productName; }
  public String getProductDescription() { return productDescription; }
  public void setProductDescription(String productDescription) { this.productDescription = productDescription; }
  public Double getUnitPrice() { return unitPrice; }
  public void setUnitPrice(Double unitPrice) { this.unitPrice = unitPrice; }
}
