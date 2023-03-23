/*
 * 
 * You can use the following import statemets
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * import org.springframework.beans.factory.annotation.Autowired;
 * 
 */

// Write your code here
package com.example.player.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import com.example.player.model.Player;
import com.example.player.service.PlayerJpaService;

@RestController
public class PlayerController{

    @Autowired // Injecting dependencies
    public PlayerJpaService playerService;


    @GetMapping("/players") //Methods is telling what crud operations it should be done
    public ArrayList<Player> getPlayers(){
        return playerService.getPlayers();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId){
        return playerService.getPlayerById(playerId);

    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player){
        return playerService.updatePlayer(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId){
        playerService.deletePlayer(playerId);
    }
}
