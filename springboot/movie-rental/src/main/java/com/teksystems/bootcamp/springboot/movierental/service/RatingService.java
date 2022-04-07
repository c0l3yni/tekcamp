package com.teksystems.bootcamp.springboot.movierental.service;

import com.teksystems.bootcamp.springboot.movierental.model.Ratings;
import org.springframework.data.domain.Page;

public interface RatingService {
  Ratings saveRating(Ratings ratings);

  Page<Ratings> getAllRatings();

  Ratings getRatingById(long id);

  Ratings updateRating(Ratings ratings, long id);

  void deleteRating(long id);
}
