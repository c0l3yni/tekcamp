package com.teksystems.bootcamp.springboot.movierental.service;

import com.teksystems.bootcamp.springboot.movierental.model.MovieRating;

import java.util.List;

public interface MovieRatingService {
  MovieRating saveMovieRating(MovieRating movieRating);

  List<MovieRating> getAllMovieRatings();

  MovieRating getMovieRatingById(long id);

  MovieRating updateMovieRating(MovieRating movieRating, long id);

  void deleteMovieRating(long id);
}
