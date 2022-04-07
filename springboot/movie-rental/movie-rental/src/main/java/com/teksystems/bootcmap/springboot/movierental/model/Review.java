package com.teksystems.bootcmap.springboot.movierental.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id", nullable = false)
    @Getter @Setter
    private short id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer = new Customer();

    public short getCustomer() {
        return customer.getCustomerId();
    }
    public void setCustomer(Short customerId) {
        this.customer.setCustomerId(customerId);
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id", nullable = false)
    private Film film = new Film();

    public short getFilm() {
        return film.getFilmId();
    }
    public void setFilm(Short filmId) {
        this.film.setFilmId(filmId);
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rating_id", nullable = false)
    private Rating rating = new Rating();

    public short getRating() {
        return rating.getRatingId();
    }
    public void setRating(Short ratingId) {
        this.rating.setRatingId(ratingId);

    }
}