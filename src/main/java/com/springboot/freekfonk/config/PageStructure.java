package com.springboot.freekfonk.config;

public class PageStructure {

    private String settings = "http://localhost:8080/settings";
    private String playerNames = "http://localhost:8080/match/settings/player-names";

    public String getSettings() {
        return settings;
    }

    public String getPlayerNames() {
        return playerNames;
    }


}
