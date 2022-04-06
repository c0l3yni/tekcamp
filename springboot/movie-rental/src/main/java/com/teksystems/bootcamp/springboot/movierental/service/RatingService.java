package com.teksystems.bootcamp.springboot.movierental.service;

import com.teksystems.bootcamp.springboot.movierental.model.Ratings;

import java.util.List;

public interface RatingService {
  Ratings saveRating(Ratings ratings);

  List<Ratings> getAllRatings();

  Ratings getRatingById(long id);

  Ratings updateRating(Ratings ratings, long id);

  void deleteRating(long id);
}
