package com.teksystems.bootcamp.springboot.movierental.service.impl;

import com.teksystems.bootcamp.springboot.movierental.exception.ResourceNotFoundException;
import com.teksystems.bootcamp.springboot.movierental.model.MovieRating;
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
  public MovieRating saveMovieRating(MovieRating movieRating) {
    return movieRatingRepository.save(movieRating);
  }

  @Override
  public List<MovieRating> getAllMovieRatings() {
    return movieRatingRepository.findAll();
  }

  @Override
  public MovieRating getMovieRatingById(long id) {
    return movieRatingRepository.findById(id).orElseThrow(()
    -> new ResourceNotFoundException("MovieRating", "MovieRatingDescription", id));
  }

  @Override
  public MovieRating updateMovieRating(MovieRating movieRating, long id) {
    MovieRating existingMovie = movieRatingRepository.findById(id).orElseThrow(()
        -> new ResourceNotFoundException("MovieRating", "MovieRatingDescription", id));

    existingMovie.setMovieRating(movieRating.getMovieRating());
    existingMovie.setMovieRating(movieRating.getMovieRatingDescription());

    movieRatingRepository.save(existingMovie);
    return existingMovie;
  }

  @Override
  public void deleteMovieRating(long id) {
    movieRatingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("MovieRating", "MovieRatingDescription", id));

    movieRatingRepository.deleteById(id);
  }
}
