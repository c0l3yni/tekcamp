package com.teksystems.bootcamp.springboot.movierental.repository;

import com.teksystems.bootcamp.springboot.movierental.model.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews, Long> {
}
