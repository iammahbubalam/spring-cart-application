package com.iammahbubalam.spring_cart_application.service.product;

import com.iammahbubalam.spring_cart_application.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface IProductService {
    Product addProduct(Product product);
    Product getProductById(UUID id);
    Product getProductByName(String name);
    Product updateProduct(UUID id, Product product);
    void deleteProduct(UUID id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(UUID categoryId);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByBrandAndCategory(String brand, UUID categoryId);
    List<Product> getProductsByPriceRange(BigDecimal min, BigDecimal max);
    Long countProducts();
    List<Product> getProductsByPage(int page, int size);
    Long countProductsByCategory(UUID categoryId);
    Long countProductsByBrand(String brand);
    Long countProductsByBrandAndCategory(String brand, UUID categoryId);
}
