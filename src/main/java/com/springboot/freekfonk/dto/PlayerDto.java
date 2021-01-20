package com.springboot.freekfonk.dto;

import javax.validation.constraints.NotBlank;

public class PlayerDto {
    private Long id;
    @NotBlank
    private String username;
    private int score;
    private int highScore;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}