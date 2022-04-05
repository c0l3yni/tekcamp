package com.teksystems.bootcamp.springboot.movierental.service.impl;

import com.teksystems.bootcamp.springboot.movierental.exception.ResourceNotFoundException;
import com.teksystems.bootcamp.springboot.movierental.model.Stars;
import com.teksystems.bootcamp.springboot.movierental.repository.MovieRatingRepository;
import com.teksystems.bootcamp.springboot.movierental.service.MovieRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieRatingRatingServiceImpl implements MovieRatingService {

  @Autowired
  public MovieRatingRepository movieRatingRepository;

  public MovieRatingRatingServiceImpl(MovieRatingRepository movieRatingRepository) {
    super();
    this.movieRatingRepository = movieRatingRepository;
  }

  @Override
  public Stars saveMovieRating(Stars stars) {
    return movieRatingRepository.save(stars);
  }

  @Override
  public List<Stars> getAllMovieRatings() {
    return movieRatingRepository.findAll();
  }

  @Override
  public Stars getMovieRatingById(long id) {
    return movieRatingRepository.findById(id).orElseThrow(()
    -> new ResourceNotFoundException("Stars", "MovieRatingDescription", id));
  }

  @Override
  public Stars updateMovieRating(Stars stars, long id) {
    Stars existingMovie = movieRatingRepository.findById(id).orElseThrow(()
        -> new ResourceNotFoundException("Stars", "MovieRatingDescription", id));

    existingMovie.setMovieRating(stars.getMovieRating());
    existingMovie.setMovieRating(stars.getMovieRatingDescription());

    movieRatingRepository.save(existingMovie);
    return existingMovie;
  }

  @Override
  public void deleteMovieRating(long id) {
    movieRatingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Stars", "MovieRatingDescription", id));

    movieRatingRepository.deleteById(id);
  }
}
