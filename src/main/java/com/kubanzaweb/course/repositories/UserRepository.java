package com.kubanzaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kubanzaweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
