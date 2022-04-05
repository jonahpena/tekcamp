package com.teksystems.bootcmap.springboot.movierental.repository;

import com.teksystems.bootcmap.springboot.movierental.model.Rating;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Integer> {

}
