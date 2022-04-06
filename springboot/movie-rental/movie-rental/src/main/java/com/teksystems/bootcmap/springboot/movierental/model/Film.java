package com.teksystems.bootcmap.springboot.movierental.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "film_id", columnDefinition="SMALLINT(3) UNSIGNED  default '40'")
    private short id;

}
