package com.teksystems.bootcmap.springboot.movierental.repository;

import com.teksystems.bootcmap.springboot.movierental.model.Review;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}
