package com.fantasy.stats.springfantasystats.models.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "users")
public class User {
    @Getter
    @Id
    private Integer id;
    @Getter
    private String username;
    @Getter
    private String password;
    @Getter
    private String email;
    @Getter
    private String yahooRefreshToken;
    @Getter
    private Integer leagueId;

    public User(){}
}