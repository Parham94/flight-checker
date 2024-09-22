package com.example.flightchecker.model;

import jakarta.persistence.*;
import lombok.*;

//// Lombok Annotations
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder // read on this
//// JPA Annotation
@Entity
@Table
public class FlightModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true, nullable = false)
    private String flightNo;
}
