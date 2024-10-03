package com.example.flightchecker.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Objects;

//// Lombok Annotations
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
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

    @Column(unique = true, nullable = false)
    private String source;

    @Column(unique = true, nullable = false)
    private String destination;

    @Column(unique = true, nullable = false)
    private Date departureTime;

    @Column(unique = true, nullable = false)
    private Date arrivalTime;

    @Column(unique = true, nullable = false)
    private String airline;

    @Column(unique = true, nullable = false)
    private int numSeats;

}
