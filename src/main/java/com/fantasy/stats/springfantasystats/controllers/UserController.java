package com.fantasy.stats.springfantasystats.controllers;

import com.fantasy.stats.springfantasystats.models.User.User;
import com.fantasy.stats.springfantasystats.services.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/allUsers")
    public List<User> hello() {
        return userService.getAllUsers();
    }
}