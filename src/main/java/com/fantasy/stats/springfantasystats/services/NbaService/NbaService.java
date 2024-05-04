package com.fantasy.stats.springfantasystats.services.NbaService;

import com.fantasy.stats.springfantasystats.models.NbaPlayer.NbaPlayer;

import java.util.List;

public interface NbaService {
    List<NbaPlayer> getAllNbaPlayers();
}