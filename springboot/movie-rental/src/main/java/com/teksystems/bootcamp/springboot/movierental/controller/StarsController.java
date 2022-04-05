package com.teksystems.bootcamp.springboot.movierental.controller;

import com.teksystems.bootcamp.springboot.movierental.model.Stars;
import com.teksystems.bootcamp.springboot.movierental.service.StarsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/createStars", method = RequestMethod.POST)
public class StarsController {

    private StarsService starsService;

    public StarsController(StarsService starsService) {
      super();
      this.starsService = starsService;
    }

    @PostMapping("/saveStars")
    public ResponseEntity<Stars> saveStars(@RequestBody Stars stars) {
      return new ResponseEntity<>(starsService.saveStarsRating(stars), HttpStatus.CREATED);
    }

  @GetMapping("/allStars")
  public List<Stars> getAllStarsRatings() {

      return starsService.getAllStarsRatings();
    }

  @GetMapping("/StarsById/{id}")
    public ResponseEntity<Stars> getStarsById(@PathVariable("id") long starId) {
      return new ResponseEntity<>(starsService.getStarsRatingById(starId), HttpStatus.OK);
    }

  @PutMapping("/UpdateStars/{id}")
    public ResponseEntity<Stars> UpdateStars(@PathVariable("id") long id, @RequestBody Stars stars) {
      return new ResponseEntity<>(starsService.updateStarsRating(stars, id), HttpStatus.OK);
    }

  @DeleteMapping("/DeleteStars/{id}")
    public ResponseEntity<String> deleteStars(@PathVariable("id") long id) {
      starsService.deleteStarsRating(id);

      return new ResponseEntity<>("Star deleted successfully", HttpStatus.OK);
    }
  }
