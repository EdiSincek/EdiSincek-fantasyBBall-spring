package com.fantasy.stats.springfantasystats.services.UserService;

import com.fantasy.stats.springfantasystats.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User createUser(User user);
}