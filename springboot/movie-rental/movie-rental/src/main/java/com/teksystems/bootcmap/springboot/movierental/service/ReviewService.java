package com.teksystems.bootcmap.springboot.movierental.service;

import com.teksystems.bootcmap.springboot.movierental.model.Review;
import com.teksystems.bootcmap.springboot.movierental.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Review getReviewById(short reviewId) {
        return reviewRepository.findById(reviewId).get();
    }

    public List<Review> getAllReviews(Integer pageNum, Integer pageSize, String sortBy) {
        Pageable page = PageRequest.of(pageNum, pageSize, Sort.by(sortBy));
        Page<Review> pagedReview = reviewRepository.findAll(page);
        if (pagedReview.hasContent()) {
            return pagedReview.getContent();
        } else {
            return new ArrayList<Review>();
        }
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review updateReview(Short reviewId, Review reviewDetails) {
        Review review = reviewRepository.findById(reviewId).get();


        return reviewRepository.save(review);
    }

    public void deleteReview(Short reviewId) {
        reviewRepository.deleteById(reviewId);
    }
}
