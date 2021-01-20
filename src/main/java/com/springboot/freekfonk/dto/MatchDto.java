package com.springboot.freekfonk.dto;

import com.springboot.freekfonk.model.Player;

import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.NotNull;

public class MatchDto {
    private Long id;
    @NotNull
    private Set<PlayerDto> players = new HashSet<>();

    public void setPlayers(Set<PlayerDto> players) {
        this.players = players;
    }

    public Set<PlayerDto> getPlayers() {
        return players;
    }


}