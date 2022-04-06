package com.teksystems.bootcamp.springboot.movierental.service.impl;

import com.teksystems.bootcamp.springboot.movierental.exception.ResourceNotFoundException;
import com.teksystems.bootcamp.springboot.movierental.model.Ratings;
import com.teksystems.bootcamp.springboot.movierental.repository.RatingsRepository;
import com.teksystems.bootcamp.springboot.movierental.service.RatingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

  public RatingsRepository ratingsRepository;

  public RatingServiceImpl(RatingsRepository ratingsRepository) {
    super();
    this.ratingsRepository = ratingsRepository;
  }

  @Override
  public Ratings saveRating(Ratings ratings) {

    return ratingsRepository.save(ratings);
  }

  @Override
  public List<Ratings> getAllRatings() {

    return ratingsRepository.findAll();
  }

  @Override
  public Ratings getRatingById(long id) {

    return ratingsRepository.findById(id).orElseThrow(()
    -> new ResourceNotFoundException("Star", "Star", id));
  }

  @Override
  public Ratings updateRating(Ratings ratings, long id) {
    Ratings existingStar = ratingsRepository.findById(id).orElseThrow(()
        -> new ResourceNotFoundException("Rating", "Rating desc", id));

    existingStar.setRating(ratings.getRating());

    ratingsRepository.save(existingStar);
    return existingStar;
  }

  @Override
  public void deleteRating(long id) {
    ratingsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Rating", "rating desc", id));
    ratingsRepository.deleteById(id);
  }
}
