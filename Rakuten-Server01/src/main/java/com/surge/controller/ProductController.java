package com.surge.controller;

import com.surge.entity.Product;
import com.surge.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
@Tag(
        name = "CRUD REST APIs for Product",
        description = "CRUD REST APIs in Rakuten Camunda to CREATE, UPDATE, FETCH AND DELETE account details"
)
public class ProductController {

    @Autowired
    private ProductService productService;

    // CREATE
    @PostMapping("/product/save")
    @Operation(
            summary = "Create Product REST API",
            description = "REST API to create new Product"
    )
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product created = productService.saveProduct(product);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    // READ ALL
    @GetMapping("/product/getAll")
    @Operation(
            summary = "Fetch All Product Details REST API",
            description = "REST API To fetch All Product"
    )
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    // READ BY ID
    @GetMapping("/product/id/{id}")
    @Operation(
            summary = "Fetch Product Details REST API",
            description = "REST API to fetch Product based on a product id"
    )
    public ResponseEntity<Product> getProductById(@PathVariable UUID id) {
        Product product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }

    // UPDATE
    @PutMapping("/product/id/{id}")
    @Operation(
            summary = "Update Product Details REST API",
            description = "REST API to update Product based on a product id"
    )
    public ResponseEntity<Product> updateProduct(@PathVariable UUID id, @RequestBody Product updatedProduct) {
        Product updated = productService.updateProduct(id, updatedProduct);
        return ResponseEntity.ok(updated);
    }

    // DELETE
    @DeleteMapping("/product/id/{id}")
    @Operation(
            summary = "Delete Product Details REST API",
            description = "REST API to delete Product based on a product id"
    )
    public ResponseEntity<Void> deleteProduct(@PathVariable UUID id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}
