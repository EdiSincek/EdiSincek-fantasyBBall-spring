package com.fantasy.stats.springfantasystats.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "nba_players")
public class NbaPlayer {
    @Id
    @Column(name = "yahoo_id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

}