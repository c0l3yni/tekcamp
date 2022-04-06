package com.teksystems.bootcamp.springboot.movierental.model;

import javax.persistence.*;

@Entity
@Table(name="movie_reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id", columnDefinition="SMALLINT(3) UNSIGNED")
    private long reviewId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rating_id")
    private Ratings ratings;

    public Reviews() {
    }

    public Reviews(Customer customer, Film film, Ratings ratings) {
        this.customer = customer;
        this.film = film;
        this.ratings = ratings;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Ratings getStars() {
        return ratings;
    }

    public void setStars(Ratings ratings) {
        this.ratings = ratings;
    }
}
