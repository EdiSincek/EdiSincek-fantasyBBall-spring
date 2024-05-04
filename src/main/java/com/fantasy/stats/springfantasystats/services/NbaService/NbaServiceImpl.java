package com.fantasy.stats.springfantasystats.services.NbaService;

import com.fantasy.stats.springfantasystats.models.NbaPlayer.NbaPlayer;
import com.fantasy.stats.springfantasystats.repositories.NbaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NbaServiceImpl implements NbaService{

    private final NbaRepository nbaRepository;

    @Autowired
    public NbaServiceImpl(NbaRepository nbaRepository) {
        this.nbaRepository = nbaRepository;
    }

    public List<NbaPlayer> getAllNbaPlayers(){
        return nbaRepository.findAll();
    }
}
