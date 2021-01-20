package com.springboot.freekfonk.service;

import com.springboot.freekfonk.model.Player;
import com.springboot.freekfonk.model.Match;
import com.springboot.freekfonk.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MatchService {

    @Autowired
    MatchRepository repository;

    @Autowired
    MatchService matchService;

    public Match saveAndFlush(Match match){
        return repository.saveAndFlush(match);
    }

    public boolean isValidNumberOfPlayers(int numberOfPlayers) {
        return numberOfPlayers > 1 && numberOfPlayers < 9;
    }

    public Match createMatch(int numberOfPlayers){
        Match match = new Match();
        for (int i = 0; i <= numberOfPlayers; i++) {
            match.getPlayers().add(new Player());
        }
        return match;
//        return saveAndFlush(match);
    }
}