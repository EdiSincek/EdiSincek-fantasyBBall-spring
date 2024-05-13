package com.fantasy.stats.springfantasystats.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
    }

    @Test
    void testId() {
        user.setId(1);
        assertEquals(1, user.getId());
    }

    @Test
    void testUsername() {
        user.setUsername("testUsername");
        assertEquals("testUsername", user.getUsername());
    }

    @Test
    void testEmail() {
        user.setEmail("testEmail");
        assertEquals("testEmail", user.getEmail());
    }

    @Test
    void testPassword() {
        user.setPassword("testPassword");
        assertEquals("testPassword", user.getPassword());
    }

    @Test
    void testYahooRefreshToken() {
        user.setYahooRefreshToken("testToken");
        assertEquals("testToken", user.getYahooRefreshToken());
    }

    @Test
    void testLeagueId() {
        user.setLeagueId(1);
        assertEquals(1, user.getLeagueId());
    }
}