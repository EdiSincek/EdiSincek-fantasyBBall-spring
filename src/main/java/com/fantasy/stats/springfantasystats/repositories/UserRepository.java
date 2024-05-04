package com.fantasy.stats.springfantasystats.repositories;

import com.fantasy.stats.springfantasystats.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findAll();
}