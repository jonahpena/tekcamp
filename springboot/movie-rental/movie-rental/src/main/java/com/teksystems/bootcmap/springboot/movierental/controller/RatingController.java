package com.teksystems.bootcmap.springboot.movierental.controller;


import com.teksystems.bootcmap.springboot.movierental.model.Rating;
import com.teksystems.bootcmap.springboot.movierental.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping("/get/{rating_id}")
    private Rating getRatingById (@PathVariable("rating_id") short ratingId) {

        return ratingService.getRatingById(ratingId);
    }

    @GetMapping("/getAllRatings")
    public ResponseEntity<List<Rating>> getAllRatings(
            @RequestParam(defaultValue = "0")Integer pageNum,
            @RequestParam(defaultValue = "10")Integer pageSize,
            @RequestParam(defaultValue = "ratingId")String sortBy){
        List<Rating> ratings = ratingService.getAllRatings(pageNum, pageSize, sortBy);
        return new ResponseEntity<List<Rating>>(ratings, HttpStatus.OK);
    }

    @PostMapping("/createRating")
    public Rating createRating(@RequestBody Rating rating) {
        return ratingService.createRating(rating);
    }

    @PutMapping("/update/{rating_id}")
    public Rating updateRating(@PathVariable(value = "id") Short ratingId,
                           @RequestBody Rating ratingDetails) {
        return ratingService.updateRating(ratingId, ratingDetails);
    }

    @DeleteMapping("/delete/{rating_id}")
    public void deleteRating(@PathVariable(value = "rating_id") Short ratingId) {
        ratingService.deleteRating(ratingId);
    }
}
