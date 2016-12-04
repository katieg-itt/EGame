/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EGameClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Joshua
 */
public class Inventory {
    private final List games;
    
    public Inventory(){
        games = new ArrayList<>();
    }
    
   public void addGame(int gameId, String title, String genre, String console, double price){
       Game game = new Game(gameId, title, genre, console, price);
       games.add(game);
   }
   
    /**
     *
     * @param serialNumber
     * @return
     */
    public Game getGame(int serialNumber) {
    for (Iterator i = games.iterator(); i.hasNext(); ) {
      Game game = (Game)i.next();
      if (game.getGameId() == serialNumber) {
        return game;
      }
    }
    return null;
  }
    
    
    
    
}
