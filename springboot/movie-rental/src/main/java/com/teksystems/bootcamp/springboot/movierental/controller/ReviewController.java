package com.teksystems.bootcamp.springboot.movierental.controller;

import com.teksystems.bootcamp.springboot.movierental.model.Reviews;
import com.teksystems.bootcamp.springboot.movierental.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Review")
public class ReviewController {
  private final ReviewService reviewService;

  @Autowired
  public ReviewController(ReviewService reviewService) {
    super();
    this.reviewService = reviewService;
  }

  @PostMapping("/saveReview")
  public ResponseEntity<Reviews> saveReview(@RequestBody Reviews reviews) {
    return new ResponseEntity<>(reviewService.saveReview(reviews), HttpStatus.CREATED);
  }

  @GetMapping("/GetAllReviews")
  public List<Reviews> getAllReviews() {
    Pageable pageable = PageRequest.of(0, 5, Sort.by(
        Sort.Order.asc("name"),
        Sort.Order.desc("id")));
    return reviewService.getAllReviews();
  }

  @GetMapping("/GetReviewById/{id}")
  public ResponseEntity<Reviews> getReviewsById(@PathVariable("id") long ratingId) {
    return new ResponseEntity<>(reviewService.getReviewsById(ratingId), HttpStatus.OK);
  }

  @PutMapping("/UpdateReview/{id}")
  public ResponseEntity<Reviews> UpdateReview(@PathVariable("id") long id, @RequestBody Reviews reviews) {
    return new ResponseEntity<>(reviewService.updateReview(reviews, id), HttpStatus.OK);
  }

  @DeleteMapping("/DeleteReview/{id}")
  public ResponseEntity<String> deleteReview(@PathVariable("id") long id) {
    reviewService.deleteReview(id);

    return new ResponseEntity<>("Review deleted successfully", HttpStatus.OK);
  }
}


