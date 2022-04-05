package com.teksystems.bootcamp.springboot.movierental.controller;

import com.teksystems.bootcamp.springboot.movierental.model.MovieRating;
import com.teksystems.bootcamp.springboot.movierental.service.MovieRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/createReview", method = RequestMethod.POST)
public class RatingController {
    private final MovieRatingService movieRatingService;

    @Autowired
    public RatingController(MovieRatingService movieRatingService) {
      super();
      this.movieRatingService = movieRatingService;
    }

    @PostMapping("/saveMovieRating")
    public ResponseEntity<MovieRating> saveMovieRating(@RequestBody MovieRating movieRating) {
      return new ResponseEntity<>(movieRatingService.saveMovieRating(movieRating), HttpStatus.CREATED);
    }

    @GetMapping("/allRatings")
    public List<MovieRating> getAllMovieRatings() {

      return movieRatingService.getAllMovieRatings();
    }

    @GetMapping("/RatingById/{id}")
    public ResponseEntity<MovieRating> getMovieRatingById(@PathVariable("id") long ratingId) {
      return new ResponseEntity<>(movieRatingService.getMovieRatingById(ratingId), HttpStatus.OK);
    }

    @PutMapping("/UpdateRating/{id}")
    public ResponseEntity<MovieRating> UpdateMovieRating(@PathVariable("id") long id, @RequestBody MovieRating movieRating) {
      return new ResponseEntity<>(movieRatingService.updateMovieRating(movieRating, id), HttpStatus.OK);
    }

    @DeleteMapping("/DeleteRating/{id}")
    public ResponseEntity<String> deleteMovieRating(@PathVariable("id") long id) {
      movieRatingService.deleteMovieRating(id);

      return new ResponseEntity<>("Rating deleted successfully", HttpStatus.OK);
    }
  }


