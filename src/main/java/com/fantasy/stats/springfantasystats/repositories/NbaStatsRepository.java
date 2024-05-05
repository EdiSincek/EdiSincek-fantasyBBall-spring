package com.fantasy.stats.springfantasystats.repositories;

import com.fantasy.stats.springfantasystats.models.NbaPlayersStatsSeason2023;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NbaStatsRepository extends JpaRepository<NbaPlayersStatsSeason2023, Integer> {
    public List<NbaPlayersStatsSeason2023> findAll();
}
