package com.jvrskt.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvrskt.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
