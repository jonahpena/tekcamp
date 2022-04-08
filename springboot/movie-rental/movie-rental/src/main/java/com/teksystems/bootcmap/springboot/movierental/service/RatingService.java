package com.teksystems.bootcmap.springboot.movierental.service;

import com.teksystems.bootcmap.springboot.movierental.model.Rating;
import com.teksystems.bootcmap.springboot.movierental.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public Rating getRatingById(short ratingId) {
        return ratingRepository.findById(ratingId).get();
    }

    public List<Rating> getAllRatings(int pageNum, int pageSize, String sortBy) {
        Pageable page = PageRequest.of(pageNum, pageSize, Sort.by(sortBy));
        Page<Rating> pagedRating = ratingRepository.findAll(page);
        if (pagedRating.hasContent()){
            return pagedRating.getContent();
        }else{
            return new ArrayList<Rating>();
        }
    }

    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    public Rating updateRating(Short ratingId, Rating ratingDetails) {
        Rating rating = ratingRepository.findById(ratingId).get();
        return ratingRepository.save(rating);
    }

    public void deleteRating(Short ratingId) {
        ratingRepository.deleteById(ratingId);
    }
}
