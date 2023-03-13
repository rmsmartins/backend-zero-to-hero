package com.rmsmartins.productms.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ProductDTO {

    private String name;
    private String description;
    private double price;
    private boolean available;
}
