package com.fantasy.stats.springfantasystats.services.LeagueService;

import com.fantasy.stats.springfantasystats.models.LeaguesYahoo;

public interface LeagueService {

    LeaguesYahoo getLeagueBasicInfoById(Integer leagueId);
}