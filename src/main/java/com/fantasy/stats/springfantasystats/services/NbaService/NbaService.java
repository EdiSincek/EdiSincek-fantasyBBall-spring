package com.fantasy.stats.springfantasystats.services.NbaService;


import com.fantasy.stats.springfantasystats.DTOs.NbaPlayerWithStatsDto;
import com.fantasy.stats.springfantasystats.models.NbaPlayer;
import com.fantasy.stats.springfantasystats.models.NbaPlayersStatsSeason2023;

import java.util.List;

public interface NbaService {
    List<NbaPlayer> getAllNbaPlayers();

    List<NbaPlayersStatsSeason2023> getAllNbaPlayerStats();

    List<NbaPlayerWithStatsDto> getAllPlayersWithStats();

}