// Write your code here
package com.example.player.repository;

import com.example.player.model.Player;
import java.util.*;

public interface PlayerRepository{
    ArrayList<Player> getPlayers(); //Declaring abstract methods
    Player addPlayer(Player player);
    Player getPlayerById(int playerId);
    Player updatePlayer(int playerId, Player player);
    void deletePlayer(int playerId);
}
