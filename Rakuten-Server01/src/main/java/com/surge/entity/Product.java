package com.surge.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;


@Table(value = "product")
@Schema(
        name = "Products",
        description = "Schema to hold Products information"
)
public class Product {

    @PrimaryKey
    @Schema(
            description = "product id", example = "3454433243"
    )
    private UUID id;
    @Schema(
            description = "product name", example = "iphone"
    )
    private String name;
    @Schema(
            description = "product description", example = "iphone 15 pro max"
    )
    private String description;
    @Schema(
            description = "product price", example = "85000.00"
    )
    private Double price;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
