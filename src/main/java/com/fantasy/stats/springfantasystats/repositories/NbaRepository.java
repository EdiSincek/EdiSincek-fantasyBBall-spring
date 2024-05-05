package com.fantasy.stats.springfantasystats.repositories;

import com.fantasy.stats.springfantasystats.DTOs.NbaPlayerWithStatsDto;
import com.fantasy.stats.springfantasystats.models.NbaPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NbaRepository extends JpaRepository<NbaPlayer, Integer> {
    List<NbaPlayer> findAll();

    @Query("SELECT new com.fantasy.stats.springfantasystats.DTOs.NbaPlayerWithStatsDto(p.id, p.name, s) FROM NbaPlayer p JOIN NbaPlayersStatsSeason2023 s ON p.id = s.id")
    List<NbaPlayerWithStatsDto> findAllWithStats();

}