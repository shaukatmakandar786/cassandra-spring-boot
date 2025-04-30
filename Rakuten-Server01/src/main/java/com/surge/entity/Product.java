package com.surge.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;


@Table(value = "product")
@Schema(
        name = "Products",
        description = "Schema to hold Products information"
)
@Getter
@Setter
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
}
