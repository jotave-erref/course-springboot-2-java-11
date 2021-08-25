package com.jvrskt.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvrskt.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
