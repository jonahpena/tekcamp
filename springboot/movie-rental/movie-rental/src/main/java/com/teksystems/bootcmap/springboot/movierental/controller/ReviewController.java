package com.teksystems.bootcmap.springboot.movierental.controller;



import com.teksystems.bootcmap.springboot.movierental.model.Review;
import com.teksystems.bootcmap.springboot.movierental.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/")
    public List<Review> getReview() {
        return reviewService.getReview();
    }

    @PostMapping("/")
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }

    @PutMapping("/{id}")
    public Review updateReview(@PathVariable(value = "id") Integer reviewId,
                               @RequestBody Review reviewDetails) {
        return reviewService.updateReview(reviewId, reviewDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable(value = "id") Integer reviewId) {
        reviewService.deleteReview(reviewId);
    }
}
