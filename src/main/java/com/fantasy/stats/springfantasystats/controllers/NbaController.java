package com.fantasy.stats.springfantasystats.controllers;

import com.fantasy.stats.springfantasystats.models.NbaPlayer.NbaPlayer;
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
    public NbaController(NbaService nbaService){
        this.nbaService = nbaService;
    }

    @GetMapping("/allPlayers")
    public List<NbaPlayer> allPlayers() {
        return nbaService.getAllNbaPlayers();
    }
}