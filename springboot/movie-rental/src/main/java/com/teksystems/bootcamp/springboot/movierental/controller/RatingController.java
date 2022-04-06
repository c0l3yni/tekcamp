package com.teksystems.bootcamp.springboot.movierental.controller;

import com.teksystems.bootcamp.springboot.movierental.model.Ratings;
import com.teksystems.bootcamp.springboot.movierental.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/StarRatings")
public class RatingController {
  private final RatingService ratingService;

  @Autowired
  public RatingController(RatingService ratingService) {
    super();
    this.ratingService = ratingService;
  }

  @PostMapping("/saveNewRating")
  public ResponseEntity<Ratings> saveRatings(@RequestBody Ratings ratings) {
    return new ResponseEntity<>(ratingService.saveRating(ratings), HttpStatus.CREATED);
  }

  @GetMapping("/GetAllRatings")
  public List<Ratings> getAllRatings() {
    Pageable pageable = PageRequest.of(0, 5, Sort.by(
        Sort.Order.asc("name"),
        Sort.Order.desc("id")));
    return ratingService.getAllRatings();
  }

  @GetMapping("/GetRatingsById/{id}")
  public ResponseEntity<Ratings> getRatingsById(@PathVariable("id") long starId) {
    return new ResponseEntity<>(ratingService.getRatingById(starId), HttpStatus.OK);
  }

  @PutMapping("/UpdateRating/{id}")
  public ResponseEntity<Ratings> UpdateRating(@PathVariable("id") long id, @RequestBody Ratings ratings) {
    return new ResponseEntity<>(ratingService.updateRating(ratings, id), HttpStatus.OK);
  }

  @DeleteMapping("/DeleteRatings/{id}")
  public ResponseEntity<String> deleteRating(@PathVariable("id") long id) {
    ratingService.deleteRating(id);

    return new ResponseEntity<>("Rating star deleted successfully", HttpStatus.OK);
  }
}
