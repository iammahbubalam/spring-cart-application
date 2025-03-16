package com.iammahbubalam.spring_cart_application.repository.product;

import com.iammahbubalam.spring_cart_application.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    List<Product> findAllByCategoryId(UUID categoryId);

    List<Product> findAllByBrand(String brand);

    List<Product> findAllByBrandAndCategoryId(String brand, UUID categoryId);

    List<Product> findByPriceBetween(BigDecimal price, BigDecimal price2);
}

