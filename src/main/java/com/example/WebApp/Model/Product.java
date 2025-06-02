package com.example.WebApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;



}
