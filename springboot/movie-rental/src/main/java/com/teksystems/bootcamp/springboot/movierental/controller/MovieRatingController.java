package com.teksystems.bootcamp.springboot.movierental.controller;

import com.teksystems.bootcamp.springboot.movierental.model.Stars;
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
    public ResponseEntity<Stars> saveMovieRating(@RequestBody Stars stars) {
      return new ResponseEntity<>(movieRatingService.saveMovieRating(stars), HttpStatus.CREATED);
    }

    // build get all employees for REST API
    @GetMapping
    public List<Stars> getAllMovieRatings() {

      return movieRatingService.getAllMovieRatings();
    }

    //build get employee by id
    //https://localhost:8080/api/employees/1
    @GetMapping("{id}")
    public ResponseEntity<Stars> getEmployeeById(@PathVariable("id") long employeeId) {
      return new ResponseEntity<>(movieRatingService.getMovieRatingById(employeeId), HttpStatus.OK);
    }

    //build update employee by id
    //https://localhost:8080/api/employees/1
    @PutMapping("{id}")
    public ResponseEntity<Stars> UpdateEmployee(@PathVariable("id") long id, @RequestBody Stars stars) {
      return new ResponseEntity<>(movieRatingService.updateMovieRating(stars, id), HttpStatus.OK);
    }

    //build delete employee by id
    //https://localhost:8080/api/employees/1
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id) {
      movieRatingService.deleteMovieRating(id);

      return new ResponseEntity<>("Employee deleted successfully", HttpStatus.OK);
    }
  }


