package com.fantasy.stats.springfantasystats.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "nba_players_stats_season_2023")
public class NbaPlayersStatsSeason2023 {
    @Id
    @Column(name = "yahoo_id", nullable = false)
    private Integer id;

    @Column(name = "games_played")
    private Integer gamesPlayed;

    @Column(name = "fg_attempted")
    private Integer fgAttempted;

    @Column(name = "fg_made")
    private Integer fgMade;

    @Column(name = "fg_percentage")
    private Float fgPercentage;

    @Column(name = "ft_attempted")
    private Integer ftAttempted;

    @Column(name = "ft_made")
    private Integer ftMade;

    @Column(name = "ft_percentage")
    private Float ftPercentage;

    @Column(name = "three_attempted")
    private Integer threeAttempted;

    @Column(name = "three_made")
    private Integer threeMade;

    @Column(name = "three_percentage")
    private Float threePercentage;

    @Column(name = "three_avg")
    private Float threeAvg;

    @Column(name = "pts_made")
    private Integer ptsMade;

    @Column(name = "pts_avg")
    private Float ptsAvg;

    @Column(name = "rebounds_made")
    private Integer reboundsMade;

    @Column(name = "rebounds_avg")
    private Float reboundsAvg;

    @Column(name = "assists_made")
    private Integer assistsMade;

    @Column(name = "assists_avg")
    private Float assistsAvg;

    @Column(name = "steals_made")
    private Integer stealsMade;

    @Column(name = "steals_avg")
    private Float stealsAvg;

    @Column(name = "blocks_made")
    private Integer blocksMade;

    @Column(name = "blocks_avg")
    private Float blocksAvg;

    @Column(name = "turnovers_made")
    private Integer turnoversMade;

    @Column(name = "turnovers_avg")
    private Float turnoversAvg;

    @Column(name = "injured")
    private Boolean injured;

    @Column(name = "isInYahooFantasy")
    private Boolean isInYahooFantasy;

    @Column(name = "fg_attempted_avg")
    private Float fgAttemptedAvg;

    @Column(name = "ft_attempted_avg")
    private Float ftAttemptedAvg;

    @Column(name = "three_attempted_avg")
    private Float threeAttemptedAvg;

}