package com.teksystems.bootcamp.springboot.movierental.service;

import com.teksystems.bootcamp.springboot.movierental.model.Stars;

import java.util.List;

public interface StarsService {
  Stars saveStarsRating(Stars stars);

  List<Stars> getAllStarsRatings();

  Stars getStarsRatingById(long id);

  Stars updateStarsRating(Stars stars, long id);

  void deleteStarsRating(long id);
}
