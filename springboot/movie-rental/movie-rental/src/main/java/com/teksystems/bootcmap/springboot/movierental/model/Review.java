package com.teksystems.bootcmap.springboot.movierental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "review")
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Review
    @Column(name = "review_id")
    @Getter @Setter
    private int id;

    @Column(name = "Customer_Review")
    @Getter @Setter
    private String reviewOfFilm;


    //Customer
    @Column(name = "customer_id")
    @Getter @Setter
    private int customerId;

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


    //Actor
    @Column(name = "actor_id")
    @Getter @Setter
    private int actorId;

    @Column(name = "Actor_Name")
    @Getter @Setter
    private String nameOfActor;

}