package com.fantasy.stats.springfantasystats.models.NbaPlayer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "nba_players")
public class NbaPlayer {

    @Id
    @Getter
    private Integer yahooId;

    @Getter
    private String name;

}
