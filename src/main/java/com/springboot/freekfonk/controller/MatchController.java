package com.springboot.freekfonk.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.freekfonk.dto.MatchDto;
import com.springboot.freekfonk.model.Match;
import com.springboot.freekfonk.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@SessionAttributes("numberOfPlayers")
public class MatchController {

    @Autowired
    MatchService service;

    @RequestMapping(value="/settings", method = RequestMethod.GET)
    public String showSettings(ModelMap model){
        return "settings";
    }

    @RequestMapping(value="/settings", method = RequestMethod.POST)
    public String postSettings(ModelMap model, @RequestParam int numberOfPlayers) throws JsonProcessingException {
        if (!service.isValidNumberOfPlayers(numberOfPlayers)) {
            model.put("errorMessage", "This game can be played with 2 to 8 players");
            return "settings";
        }
        model.put("match", new ObjectMapper().writeValueAsString(service.createMatch(numberOfPlayers)));
        return "players";
    }



}