package com.teksystems.bootcmap.springboot.movierental.service;

import com.teksystems.bootcmap.springboot.movierental.model.Review;
import com.teksystems.bootcmap.springboot.movierental.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getReview() {
        return reviewRepository.findAll();
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review updateReview(Integer reviewId, Review reviewDetails) {
        Review review = reviewRepository.findById(reviewId).get();
        review.setReviewOfFilm(reviewDetails.getReviewOfFilm());

        review.setNameOfCustomer(reviewDetails.getNameOfCustomer());

        review.setNameOfActor(reviewDetails.getNameOfActor());

        review.setNameOfFilm(reviewDetails.getNameOfFilm());

        return reviewRepository.save(review);
    }

    public void deleteReview(Integer reviewId) {
        reviewRepository.deleteById(reviewId);
    }
}
