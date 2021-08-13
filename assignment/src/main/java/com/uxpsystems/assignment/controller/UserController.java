package com.uxpsystems.assignment.controller;

import com.uxpsystems.assignment.entity.User;
import com.uxpsystems.assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    Iterable<User> get(){
         return userService.findAll();
    }

    @GetMapping("/getUserById/{id}")
    Optional<User> findByID(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping("/postUser")
    User create(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("/updateUser")
    User update(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("/deleteUserById/{id}")
    void delete(@PathVariable Long id){
        userService.deleteById(id);

    }
}
