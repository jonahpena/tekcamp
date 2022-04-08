package com.teksystems.bootcmap.springboot.movierental.controller;


import com.teksystems.bootcmap.springboot.movierental.model.Review;
import com.teksystems.bootcmap.springboot.movierental.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/get/{review_id}")
    private Review getReviewById(@PathVariable("review_id") short reviewId) {
        return reviewService.getReviewById(reviewId);
    }

    @GetMapping("/getAllReviews")
    public ResponseEntity<List<Review>> getAllReviews(
            @RequestParam(defaultValue = "0") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "reviewId") String sortBy) {
        List<Review> reviews = reviewService.getAllReviews(pageNum, pageSize, sortBy);
        return new ResponseEntity<List<Review>>(reviews, HttpStatus.OK);
    }

    @PostMapping("/createReview")
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }

    @DeleteMapping("/delete/{review_id}")
    public void deleteReview(@PathVariable(value = "review_id") Short reviewId) {
        reviewService.deleteReview(reviewId);
    }
}
