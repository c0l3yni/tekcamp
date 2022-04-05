package com.teksystems.bootcamp.springboot.movierental.model;

import javax.persistence.*;

@Entity
@Table(name="number_of_stars")
public class Stars {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long starId;

  @Column(name = "star_rating", nullable = false)
  private String star;

  @Column(name = "rating_description", nullable = false)
  private String starDescription;

  public void setStarDescription(String starDescription) {
    this.starDescription = starDescription;
  }

  public Stars() {
  }

  public String getStars() {
    return star;
  }

  public void setStars(String star) {
    this.star = star;
  }

  public String getStarsDescription() {
    return starDescription;
  }
}
