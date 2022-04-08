package com.teksystems.bootcmap.springboot.movierental.repository;

import com.teksystems.bootcmap.springboot.movierental.model.Review;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends PagingAndSortingRepository<Review, Short> {

}
