/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dentistapp.dentistapp.web;

import com.dentistapp.dentistapp.document.User;
import com.dentistapp.dentistapp.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ricardo
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/findUserById/{id}")
    public Optional<User> getUser(@PathVariable("id") Long id) {
        return userRepository.findById(id);
    }

    @GetMapping("/findAllUsers")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @DeleteMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userRepository.deleteById(id);
        return "Ok";
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        User u = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        return u;
    }
}
