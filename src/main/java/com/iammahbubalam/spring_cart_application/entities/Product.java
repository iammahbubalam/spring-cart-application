package com.iammahbubalam.spring_cart_application.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Product {
    @Id
    private Long id;
    private String productName;
    private String productDescription;
    private Double productPrice;
    private Integer productQuantity;
    private String productImageUrl;
    private String productCategory;
    private String productBrand;
    private String productStatus;
    private String productType;
    private String productUnit;


}
