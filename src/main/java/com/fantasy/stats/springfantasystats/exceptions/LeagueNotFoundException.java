package com.fantasy.stats.springfantasystats.exceptions;

public class LeagueNotFoundException extends RuntimeException {
    public LeagueNotFoundException(String message) {
        super(message);
    }
}
