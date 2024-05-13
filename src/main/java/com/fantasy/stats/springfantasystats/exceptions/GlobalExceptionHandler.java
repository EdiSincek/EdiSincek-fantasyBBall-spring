package com.fantasy.stats.springfantasystats.exceptions;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {LeagueNotFoundException.class})
    public ResponseEntity<Object> handleException(LeagueNotFoundException e) {
        return ResponseEntity.status(404).body(e.getMessage());
    }
}
