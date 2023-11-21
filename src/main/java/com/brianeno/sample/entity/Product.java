package com.brianeno.sample.entity;

import com.brianeno.sample.enums.ProductCategory;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import tech.ailef.snapadmin.external.annotations.DisplayFormat;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@Table(name = "product")
public class Product extends BaseEntity {

    public Product() {
    }

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    @NotNull(message = "Category must be specified.")
    private ProductCategory category;

    @Column(name = "description")
    private String description;

    @DisplayFormat(format = "$%.2f")
    @Min(0)
    @Column(name = "price", columnDefinition = "decimal (10,2)")
    private BigDecimal price;
}
