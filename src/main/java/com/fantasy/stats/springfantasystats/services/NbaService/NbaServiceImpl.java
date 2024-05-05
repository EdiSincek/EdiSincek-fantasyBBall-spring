package com.fantasy.stats.springfantasystats.services.NbaService;


import com.fantasy.stats.springfantasystats.DTOs.NbaPlayerWithStatsDto;
import com.fantasy.stats.springfantasystats.models.NbaPlayer;
import com.fantasy.stats.springfantasystats.models.NbaPlayersStatsSeason2023;
import com.fantasy.stats.springfantasystats.repositories.NbaRepository;
import com.fantasy.stats.springfantasystats.repositories.NbaStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NbaServiceImpl implements NbaService {

    private final NbaRepository nbaRepository;
    private final NbaStatsRepository nbaStatsRepository;

    @Autowired
    public NbaServiceImpl(NbaRepository nbaRepository, NbaStatsRepository nbaStatsRepository) {
        this.nbaRepository = nbaRepository;
        this.nbaStatsRepository = nbaStatsRepository;
    }

    @Override
    public List<NbaPlayer> getAllNbaPlayers() {
        return nbaRepository.findAll();
    }

    @Override
    public List<NbaPlayersStatsSeason2023> getAllNbaPlayerStats() {
        return nbaStatsRepository.findAll();
    }

    @Override
    public List<NbaPlayerWithStatsDto> getAllPlayersWithStats() {
        return nbaRepository.findAllWithStats();
    }

}
