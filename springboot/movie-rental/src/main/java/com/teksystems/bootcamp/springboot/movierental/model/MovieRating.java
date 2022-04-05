package com.teksystems.bootcamp.springboot.movierental.model;

import javax.persistence.*;

@Entity
@Table(name="movie_ratings")
public class MovieRating {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "movie_rating", nullable = false)
  private String movieRating;

  @Column(name = "rating_description", nullable = false)
  private String movieRatingDescription;

  public String getMovieRating() {
    return movieRating;
  }

  public void setMovieRating(String movieRating) {
    this.movieRating = movieRating;
  }

  public String getMovieRatingDescription() {
    return movieRatingDescription;
  }

  public void setMovieRatingDescription(String movieRatingDescription) {
    this.movieRatingDescription = movieRatingDescription;
  }

  public MovieRating() {
  }
}
