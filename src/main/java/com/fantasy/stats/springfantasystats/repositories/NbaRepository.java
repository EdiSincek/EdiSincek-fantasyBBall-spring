package com.fantasy.stats.springfantasystats.repositories;

import com.fantasy.stats.springfantasystats.models.NbaPlayer.NbaPlayer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NbaRepository extends JpaRepository<NbaPlayer,Integer> {
    List<NbaPlayer> findAll();
}