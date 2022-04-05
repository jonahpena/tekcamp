package com.teksystems.bootcmap.springboot.movierental.service;
import com.teksystems.bootcmap.springboot.movierental.model.Rating;
import com.teksystems.bootcmap.springboot.movierental.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public List<Rating> getRating() {
        return ratingRepository.findAll();
    }

    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    public Rating updateRating(Integer ratingId, Rating ratingDetails) {
        Rating rating = ratingRepository.findById(ratingId).get();
        rating.setNumberOfStars(ratingDetails.getNumberOfStars());
        rating.setStarDescription(ratingDetails.getStarDescription());

        return ratingRepository.save(rating);
    }

    public void deleteRating(Integer ratingId) {
        ratingRepository.deleteById(ratingId);
    }
}
