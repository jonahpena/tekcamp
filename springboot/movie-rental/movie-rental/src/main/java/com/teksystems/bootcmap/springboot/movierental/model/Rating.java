package com.teksystems.bootcmap.springboot.movierental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "rating")
@NoArgsConstructor
@AllArgsConstructor
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "rating_id")
    @Getter @Setter
    private int id;

    @Column(name = "numberOfStars")
    @Getter @Setter
    private int numberOfStars;

    @Column(name = "starDescription")
    @Getter @Setter
    private String starDescription;

}
