package com.teksystems.bootcamp.springboot.movierental.service.impl;

import com.teksystems.bootcamp.springboot.movierental.exception.ResourceNotFoundException;
import com.teksystems.bootcamp.springboot.movierental.model.Stars;
import com.teksystems.bootcamp.springboot.movierental.repository.StarsRepository;
import com.teksystems.bootcamp.springboot.movierental.service.StarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarsServiceImpl implements StarsService {

  @Autowired
  public StarsRepository starsRepository;

  public StarsServiceImpl(StarsRepository starsRepository) {
    super();
    this.starsRepository = starsRepository;
  }

  @Override
  public Stars saveStarsRating(Stars stars) {

    return starsRepository.save(stars);
  }

  @Override
  public List<Stars> getAllStarsRatings() {

    return starsRepository.findAll();
  }

  @Override
  public Stars getStarsRatingById(long id) {

    return starsRepository.findById(id).orElseThrow(()
    -> new ResourceNotFoundException("Star", "Star", id));
  }

  @Override
  public Stars updateStarsRating(Stars stars, long id) {
    Stars existingStar = starsRepository.findById(id).orElseThrow(()
        -> new ResourceNotFoundException("Star", "Star", id));

    existingStar.setStars(stars.getStars());

    starsRepository.save(existingStar);
    return existingStar;
  }

  @Override
  public void deleteStarsRating(long id) {
    starsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Star", "Star", id));
    starsRepository.deleteById(id);
  }
}
