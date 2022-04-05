package com.teksystems.bootcmap.springboot.movierental.model;


import lombok.Getter;

import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "film")

public class Film {

    @Id
    private int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @ManyToMany(mappedBy = "film")
    private List<Review> reviews;


    @Column(name = "title")
    @Getter @Setter
    private String filmTitle;


}
