package com.ruanscherer.course.repositories;

import com.ruanscherer.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
