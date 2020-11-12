package com.ruanscherer.course.services;

import com.ruanscherer.course.entities.User;
import com.ruanscherer.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
        return user.get();
    }

    public User insert(final User user) {
        return userRepository.save(user);
    }

    public void delete(final Long id) {
        userRepository.deleteById(id);
    }
}
