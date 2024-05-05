package com.fantasy.stats.springfantasystats.controllers;

import com.fantasy.stats.springfantasystats.DTOs.NbaPlayerWithStatsDto;
import com.fantasy.stats.springfantasystats.models.NbaPlayer;
import com.fantasy.stats.springfantasystats.models.NbaPlayersStatsSeason2023;
import com.fantasy.stats.springfantasystats.services.NbaService.NbaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nba")
public class NbaController {

    private final NbaService nbaService;

    @Autowired
    public NbaController(NbaService nbaService) {
        this.nbaService = nbaService;
    }

    @GetMapping("/allPlayers")
    public List<NbaPlayer> allPlayers() {
        return nbaService.getAllNbaPlayers();
    }

    @GetMapping("/allPlayerStats")
    public List<NbaPlayersStatsSeason2023> allPlayerStats() {
        return nbaService.getAllNbaPlayerStats();
    }

    @GetMapping("/allPlayersWithStats")
    public List<NbaPlayerWithStatsDto> getAllPlayersWithStats() {
        return nbaService.getAllPlayersWithStats();
    }

}