package com.teksystems.bootcamp.springboot.movierental.service;

import com.teksystems.bootcamp.springboot.movierental.model.Reviews;

import java.util.List;

public interface ReviewService {
  Reviews saveReview(Reviews reviews);

  List<Reviews> getAllReviews();

  Reviews getReviewsById(long id);

  Reviews updateReview(Reviews reviews, long id);

  void deleteReview(long id);
}
