package com.iammahbubalam.spring_cart_application.entities;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Blob;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String fileName;
    private String fileType;
    @Lob
    private Blob image;
    private String url;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
