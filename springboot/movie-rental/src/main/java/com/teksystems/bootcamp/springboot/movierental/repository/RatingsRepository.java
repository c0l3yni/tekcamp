package com.teksystems.bootcamp.springboot.movierental.repository;

import com.teksystems.bootcamp.springboot.movierental.model.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingsRepository extends JpaRepository<Ratings, Long> {
}
