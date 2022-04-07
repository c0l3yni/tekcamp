package com.teksystems.bootcamp.springboot.movierental.service;

import com.teksystems.bootcamp.springboot.movierental.model.Reviews;
import org.springframework.data.domain.Page;

public interface ReviewService {
  Reviews saveReview(Reviews reviews);

  Page<Reviews> getAllReviews();

  Reviews getReviewsById(long id);

  Reviews updateReview(Reviews reviews, long id);

  void deleteReview(long id);
}
