package com.fantasy.stats.springfantasystats.controllers;

import com.fantasy.stats.springfantasystats.models.LeaguesYahoo;
import com.fantasy.stats.springfantasystats.services.LeagueService.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/league")
public class LeagueController {

    private final LeagueService leagueService;

    @Autowired
    public LeagueController(LeagueService leagueService) {
        this.leagueService = leagueService;
    }

    @GetMapping("/{leagueId}")
    public ResponseEntity<LeaguesYahoo> getLeague(@PathVariable Integer leagueId) {
        LeaguesYahoo league = leagueService.getLeagueBasicInfoById(leagueId);
        return new ResponseEntity<>(league, HttpStatus.OK);
    }

    @PostMapping("/addLeague")
    public ResponseEntity<LeaguesYahoo> addLeague(@RequestBody LeaguesYahoo league) {
        LeaguesYahoo addedLeague = leagueService.addLeague(league);
        return new ResponseEntity<>(addedLeague, HttpStatus.CREATED);
    }
}