package com.teksystems.bootcamp.springboot.movierental.model;

import javax.persistence.*;

public class Review {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "customer_id", nullable = false)
    private long customerId;

    @Column(name = "film_id", nullable = false)
    private long filmId;

    @ManyToOne
    @JoinColumn(name = "rating_id")
    private Stars stars;
}
