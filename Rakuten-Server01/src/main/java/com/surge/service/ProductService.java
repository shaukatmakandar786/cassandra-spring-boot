package com.surge.service;

import com.surge.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(UUID id);
    Product updateProduct(UUID id, Product updatedProduct);
    void deleteProduct(UUID id);
}
