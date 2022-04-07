package com.teksystems.bootcamp.springboot.movierental.service.impl;

import com.teksystems.bootcamp.springboot.movierental.exception.ResourceNotFoundException;
import com.teksystems.bootcamp.springboot.movierental.model.Reviews;
import com.teksystems.bootcamp.springboot.movierental.repository.ReviewRepository;
import com.teksystems.bootcamp.springboot.movierental.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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
  public Page<Reviews> getAllReviews() {
  Pageable firstPageReturnFiveElements = PageRequest.of(0, 5);
  Page<Reviews> fiveElements = reviewRepository.findAll(firstPageReturnFiveElements);
  return fiveElements;
  }

  @Override
  public Reviews getReviewsById(long id) {

    return reviewRepository.findById(id).get();
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
