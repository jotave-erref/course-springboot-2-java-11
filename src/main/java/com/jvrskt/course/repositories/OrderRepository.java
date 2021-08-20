package com.jvrskt.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvrskt.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
