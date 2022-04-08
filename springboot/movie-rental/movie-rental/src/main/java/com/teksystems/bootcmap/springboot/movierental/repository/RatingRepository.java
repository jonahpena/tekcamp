package com.teksystems.bootcmap.springboot.movierental.repository;

import com.teksystems.bootcmap.springboot.movierental.model.Rating;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends PagingAndSortingRepository<Rating, Short> {

}
