package com.teksystems.bootcamp.springboot.movierental.model;

import javax.persistence.*;

@Entity
@Table(name = "film")
public class Film {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "film_id", columnDefinition="SMALLINT(3) UNSIGNED", nullable = false)
  private long filmId;

  @Column(name = "title", nullable = false)
  private String title;

  public Film() {
  }

  public Film(String title) {
    this.title = title;
  }

  public long getFilmId() {
    return filmId;
  }

  public void setFilmId(long filmId) {
    this.filmId = filmId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
