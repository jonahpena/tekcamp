package com.teksystems.bootcmap.springboot.movierental.repository;

import com.teksystems.bootcmap.springboot.movierental.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}


