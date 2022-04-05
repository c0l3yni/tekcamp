package com.teksystems.bootcamp.springboot.movierental.service;

import com.teksystems.bootcamp.springboot.movierental.model.Stars;

import java.util.List;

public interface MovieRatingService {
  Stars saveMovieRating(Stars stars);

  List<Stars> getAllMovieRatings();

  Stars getMovieRatingById(long id);

  Stars updateMovieRating(Stars stars, long id);

  void deleteMovieRating(long id);
}
