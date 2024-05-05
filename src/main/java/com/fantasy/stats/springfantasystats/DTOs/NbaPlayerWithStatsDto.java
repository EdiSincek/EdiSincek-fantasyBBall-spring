package com.fantasy.stats.springfantasystats.DTOs;

import com.fantasy.stats.springfantasystats.models.NbaPlayersStatsSeason2023;
import lombok.Data;

@Data
public class NbaPlayerWithStatsDto {
    private Integer yahooId;
    private String name;
    private NbaPlayersStatsSeason2023 stats;
    
    public NbaPlayerWithStatsDto(Integer yahooId, String name, NbaPlayersStatsSeason2023 stats) {
        this.yahooId = yahooId;
        this.name = name;
        this.stats = stats;
    }
}
