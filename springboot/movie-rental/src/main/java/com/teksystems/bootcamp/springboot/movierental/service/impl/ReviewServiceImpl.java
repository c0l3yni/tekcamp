package com.teksystems.bootcamp.springboot.movierental.service.impl;

import com.teksystems.bootcamp.springboot.movierental.exception.ResourceNotFoundException;
import com.teksystems.bootcamp.springboot.movierental.model.Reviews;
import com.teksystems.bootcamp.springboot.movierental.repository.ReviewRepository;
import com.teksystems.bootcamp.springboot.movierental.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

  @Autowired
  public ReviewRepository reviewRepository;

  public ReviewServiceImpl(ReviewRepository reviewRepository) {
    super();
    this.reviewRepository = reviewRepository;
  }

  @Override
  public Reviews saveReview(Reviews reviews) {

    return reviewRepository.save(reviews);
  }

  @Override
  public List<Reviews> getAllReviews() {
    return reviewRepository.findAll();
  }

  @Override
  public Reviews getReviewsById(long id) {
    return reviewRepository.findById(id).orElseThrow(()
    -> new ResourceNotFoundException("Movie Review", "MovieReviewDescription", id));
  }

  @Override
  public Reviews updateReview(Reviews reviews, long id) {
    Reviews existingReview = reviewRepository.findById(id).orElseThrow(()
        -> new ResourceNotFoundException("Movie review", "MovieReviewDescription", id));

    existingReview.setStars(reviews.getStars());
    existingReview.setCustomer(reviews.getCustomer());
    existingReview.setFilm(reviews.getFilm());

    reviewRepository.save(existingReview);
    return existingReview;
  }

  @Override
  public void deleteReview(long id) {
    reviewRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Movie review", "MovieReviewDescription", id));

    reviewRepository.deleteById(id);
  }
}
