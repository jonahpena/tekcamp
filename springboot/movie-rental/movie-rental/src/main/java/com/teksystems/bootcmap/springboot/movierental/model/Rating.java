package com.teksystems.bootcmap.springboot.movierental.model;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "rating")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "rating_id", columnDefinition="SMALLINT() UNSIGNED ")
    @Column(name = "rating_id")
    @Getter @Setter
    private short ratingId;


    @Column(name = "number_of_stars")
    @Getter @Setter
    private int numberOfStars;

    @Column(name = "star_description")
    @Getter @Setter
    private String starDescription;

}
