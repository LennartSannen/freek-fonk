package com.springboot.freekfonk.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.freekfonk.dto.MatchDto;
import com.springboot.freekfonk.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Controller
public class PlayerController {

    @Autowired
    PlayerService service;

    @RequestMapping(value="/players", method = RequestMethod.GET)
    public String getPlayers(ModelMap model){
        //Match match = service.createMatch(Integer.valueOf(model.get("numberOfPlayers").toString()));
        return "players";
    }
    @RequestMapping(value="/players", method = RequestMethod.POST)
    public String postPlayers(ModelMap model, @RequestBody @Valid MatchDto dto) throws JsonProcessingException {
        dto.getPlayers().stream().forEach((player) -> service.addPlayerToMatch(player));
        model.put("match", new ObjectMapper().writeValueAsString(dto));
        return "match";
    }
}
