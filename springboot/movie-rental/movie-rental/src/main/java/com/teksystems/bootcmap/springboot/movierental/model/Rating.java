package com.teksystems.bootcmap.springboot.movierental.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rating")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "rating_id", columnDefinition="SMALLINT() UNSIGNED ")
    @Column(name = "rating_id")
    private short id;


    @Column(name = "numberOfStars")
    @Getter @Setter
    private int numberOfStars;

    @Column(name = "starDescription")
    @Getter @Setter
    private String starDescription;

}
