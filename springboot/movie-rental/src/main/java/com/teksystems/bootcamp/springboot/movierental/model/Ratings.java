package com.teksystems.bootcamp.springboot.movierental.model;

import javax.persistence.*;

@Entity
@Table(name="ratings")
public class Ratings {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "rating_id", columnDefinition="SMALLINT(3) UNSIGNED", nullable = false)
  private long ratingId;

  @Column(name = "star_rating", nullable = false)
  private String rating;

  @Column(name = "rating_description", nullable = false)
  private String ratingDescription;

  public Ratings() {
  }

  public long getRatingId() {
    return ratingId;
  }

  public void setRatingId(short ratingId) {
    this.ratingId = ratingId;
  }

  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public String getRatingDescription() {
    return ratingDescription;
  }

  public void setRatingDescription(String ratingDescription) {
    this.ratingDescription = ratingDescription;
  }
}
