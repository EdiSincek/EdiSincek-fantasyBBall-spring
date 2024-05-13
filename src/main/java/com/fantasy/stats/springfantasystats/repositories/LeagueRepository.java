package com.fantasy.stats.springfantasystats.repositories;

import com.fantasy.stats.springfantasystats.models.LeaguesYahoo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueRepository extends JpaRepository<LeaguesYahoo, Integer> {
}