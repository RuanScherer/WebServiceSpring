package com.ruanscherer.course.repositories;

import com.ruanscherer.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
