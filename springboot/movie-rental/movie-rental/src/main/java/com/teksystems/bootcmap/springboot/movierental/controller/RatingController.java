package com.teksystems.bootcmap.springboot.movierental.controller;


import com.teksystems.bootcmap.springboot.movierental.model.Rating;
import com.teksystems.bootcmap.springboot.movierental.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping("/")
    public List<Rating> getRating() {
        return ratingService.getRating();
    }

    @PostMapping("/")
    public Rating createRating(@RequestBody Rating rating) {
        return ratingService.createRating(rating);
    }

    @PutMapping("/{id}")
    public Rating updateRating(@PathVariable(value = "id") Integer ratingId,
                           @RequestBody Rating ratingDetails) {
        return ratingService.updateRating(ratingId, ratingDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteRating(@PathVariable(value = "id") Integer ratingId) {
        ratingService.deleteRating(ratingId);
    }
}
