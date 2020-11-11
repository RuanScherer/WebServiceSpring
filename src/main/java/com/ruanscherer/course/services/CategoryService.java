package com.ruanscherer.course.services;

import com.ruanscherer.course.entities.Category;
import com.ruanscherer.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(final Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }
}
