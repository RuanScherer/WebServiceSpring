package com.ruanscherer.course.repositories;

import com.ruanscherer.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
