package com.teksystems.bootcmap.springboot.movierental.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
//@NoArgsConstructor
//@AllArgsConstructor
public class Customer {

    @Id
    private int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @ManyToMany(mappedBy = "customers")
    private List<Review> reviews;


    @Column(name = "first_name")
    @Getter @Setter
    private String firstName;

    @Column(name = "last_name")
    @Getter @Setter
    private String lastName;


}
