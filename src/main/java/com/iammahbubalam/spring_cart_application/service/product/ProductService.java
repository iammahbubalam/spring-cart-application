package com.iammahbubalam.spring_cart_application.service.product;

import com.iammahbubalam.spring_cart_application.entities.Product;
import com.iammahbubalam.spring_cart_application.exception.ProductNotFoundException;
import com.iammahbubalam.spring_cart_application.repository.product.ProductRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.function.LongPredicate;

public class ProductService implements IProductService{
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(UUID id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    @Override
    public Product getProductByName(String name) {
        return null;
    }

    @Override
    public Product updateProduct(UUID id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(UUID id) {
        productRepository.findById(id)
                .ifPresentOrElse(productRepository::delete,
                        () -> {throw new ProductNotFoundException("Product not found");});


    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByCategory(UUID categoryId) {
        return productRepository.findAllByCategoryId(categoryId);
    }



    @Override
    public List<Product> getProductsByBrand(String brand) {
        return productRepository.findAllByBrand(brand);
    }

    @Override
    public List<Product> getProductsByBrandAndCategory(String brand, UUID categoryId) {
        return productRepository.findAllByBrandAndCategoryId(brand, categoryId);
    }

    @Override
    public List<Product> getProductsByPriceRange(BigDecimal min, BigDecimal max) {
        return productRepository.findByPriceBetween(min, max);
    }

    @Override
    public Long countProducts() {
        return 0L;
    }

    @Override
    public List<Product> getProductsByPage(int page, int size) {
        return List.of();
    }

    @Override
    public Long countProductsByCategory(UUID categoryId) {
        return 0L;
    }

    @Override
    public Long countProductsByBrand(String brand) {
        return 0L;
    }

    @Override
    public Long countProductsByBrandAndCategory(String brand, UUID categoryId) {
        return 0L;
    }
}
