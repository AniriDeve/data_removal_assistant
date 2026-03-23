package com.example.dataremoval.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RemovalRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String company;
    private String dataLink;

    @Column(length = 2000)
    private String message;

    private LocalDateTime createdAt;

    // getters/setters
}
