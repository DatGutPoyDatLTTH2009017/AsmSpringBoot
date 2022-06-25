package com.example.asmspringboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "streets")
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="district_id", nullable = false)
    private Districts district;
    @Column(updatable = false, insertable = false)
    private int district_id;
    private String description;
    private LocalDate roadEstablishmentDate;
    @Enumerated(EnumType.ORDINAL)
    private RoadStatus status;
}