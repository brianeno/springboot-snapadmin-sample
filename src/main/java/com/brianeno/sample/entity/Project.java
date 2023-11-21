package com.brianeno.sample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tech.ailef.snapadmin.external.annotations.Filterable;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "projects")
public class Project extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false)
  private String name;
  @Column(nullable = false)
  private String description;

  @Filterable
  @Column(nullable = false)
  private LocalDateTime startDate;

  @Filterable
  @Column(nullable = false)
  private LocalDateTime endDate;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  @ManyToOne(optional=false)
  @JoinColumn(name="manager_id", nullable=false)
  private User manager;
}
