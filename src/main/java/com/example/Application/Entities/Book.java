package com.example.Application.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book")
public class Book {
    @Id
    private String id;

    private String name;

    private String author;

    private Integer price;

    @Column(name = "copies_available")
    private Integer copiesAvailable;

    @Column(name = "copies_sold")
    private Integer copiesSold;

}
