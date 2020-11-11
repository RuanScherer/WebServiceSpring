package com.ruanscherer.course.resources;

import com.ruanscherer.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Ruan", "ruan.vscherer@gmail.com", "3333-3333", "123");
        return ResponseEntity.ok().body(user);
    }
}
