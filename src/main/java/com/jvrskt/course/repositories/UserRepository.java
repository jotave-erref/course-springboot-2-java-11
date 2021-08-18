package com.jvrskt.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvrskt.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
