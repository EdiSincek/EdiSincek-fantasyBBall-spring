package com.fantasy.stats.springfantasystats.repositories;

import com.fantasy.stats.springfantasystats.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}