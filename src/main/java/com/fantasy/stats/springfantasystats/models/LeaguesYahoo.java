package com.fantasy.stats.springfantasystats.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "leagues_yahoo")
public class LeaguesYahoo {
    @Id
    @Column(name = "league_id", nullable = false)
    private Integer id;

    @Column(name = "league_name")
    private String leagueName;

    @Column(name = "league_size")
    private Integer leagueSize;

    @Column(name = "start_date")
    private LocalDate startDate;

}