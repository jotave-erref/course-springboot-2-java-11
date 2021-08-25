package com.jvrskt.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvrskt.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
