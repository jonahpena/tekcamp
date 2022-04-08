package com.teksystems.bootcmap.springboot.movierental.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "film")

public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id", columnDefinition = "SMALLINT(3) UNSIGNED  default '40'", nullable = false)
    @Getter
    @Setter
    private short filmId;
}
