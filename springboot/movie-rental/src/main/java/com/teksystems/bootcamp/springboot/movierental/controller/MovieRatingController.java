package com.teksystems.bootcamp.springboot.movierental.controller;

import com.teksystems.bootcamp.springboot.movierental.model.MovieRating;
import com.teksystems.bootcamp.springboot.movierental.service.MovieRatingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ratings")
public class MovieRatingController {

    private final MovieRatingService movieRatingService;

    public MovieRatingController(MovieRatingService movieRatingService) {
      super();
      this.movieRatingService = movieRatingService;
    }

    //build create employee rest api
    @PostMapping()
    public ResponseEntity<MovieRating> saveMovieRating(@RequestBody MovieRating movieRating) {
      return new ResponseEntity<>(movieRatingService.saveMovieRating(movieRating), HttpStatus.CREATED);
    }

    // build get all employees for REST API
    @GetMapping
    public List<MovieRating> getAllMovieRatings() {

      return movieRatingService.getAllMovieRatings();
    }

    //build get employee by id
    //https://localhost:8080/api/employees/1
    @GetMapping("{id}")
    public ResponseEntity<MovieRating> getEmployeeById(@PathVariable("id") long employeeId) {
      return new ResponseEntity<>(movieRatingService.getMovieRatingById(employeeId), HttpStatus.OK);
    }

    //build update employee by id
    //https://localhost:8080/api/employees/1
    @PutMapping("{id}")
    public ResponseEntity<MovieRating> UpdateEmployee(@PathVariable("id") long id, @RequestBody MovieRating movieRating) {
      return new ResponseEntity<>(movieRatingService.updateMovieRating(movieRating, id), HttpStatus.OK);
    }

    //build delete employee by id
    //https://localhost:8080/api/employees/1
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id) {
      movieRatingService.deleteMovieRating(id);

      return new ResponseEntity<>("Employee deleted successfully", HttpStatus.OK);
    }
  }


