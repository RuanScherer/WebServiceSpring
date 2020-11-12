package com.ruanscherer.course.services;

import com.ruanscherer.course.entities.User;
import com.ruanscherer.course.exceptions.DatabaseException;
import com.ruanscherer.course.exceptions.ResourceNotFoundException;
import com.ruanscherer.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(final Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(final User user) {
        return userRepository.save(user);
    }

    public void delete(final Long id) {
        try {
            userRepository.deleteById(id);
        } catch (EmptyResultDataAccessException exception) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException exception) {
            throw new DatabaseException(exception.getMessage());
        }
    }

    public User update(final Long id, final User user) {
        User entity = userRepository.getOne(id);
        updateData(entity, user);
        return userRepository.save(entity);
    }

    public void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}
