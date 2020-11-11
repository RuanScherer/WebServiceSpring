package com.ruanscherer.course.repositories;

import com.ruanscherer.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
