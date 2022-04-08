package com.teksystems.bootcmap.springboot.movierental.model;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "customer")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", columnDefinition="SMALLINT(3) UNSIGNED", nullable = false)
    @Getter @Setter
    private short customerId;
}
