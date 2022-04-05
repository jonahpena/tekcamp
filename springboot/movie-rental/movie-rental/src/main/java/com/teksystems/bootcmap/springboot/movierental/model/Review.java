package com.teksystems.bootcmap.springboot.movierental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "review")
//@NoArgsConstructor
//@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

//    //Review
//    @Column(name = "review_id")
//    @Getter @Setter
    private int id;

    @Column(name = "Customer_Review")
    @Getter @Setter
    private String reviewOfFilm;


    //Customer
    @ManyToMany
    @JoinTable(
            name = "customer_name",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "customers")
    )
    private List<Customer> customers;

    @ManyToMany
    @JoinTable(
            name = "film_name",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id")
    )
    private List<Customer> film;


    @Column(name = "Customer_Name")
    @Getter @Setter
    private String nameOfCustomer;


    //Film
    @Column(name = "film_id")
    @Getter @Setter
    private int filmId;

    @Column(name = "Movie_Title")
    @Getter @Setter
    private String nameOfFilm;


    //Rating
    @Column(name = "rating_id")
    @Getter @Setter
    private int ratingId;

    @Column(name = "numberOfStars")
    @Getter @Setter
    private int numberOfStars;

}