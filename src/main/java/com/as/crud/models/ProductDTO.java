package com.as.crud.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "products")
@Getter
@Setter
public class ProductDTO {

    @Id
    private String _id;

    private String name;

    private Double price;

    private LocalDate expiry_date;


}
