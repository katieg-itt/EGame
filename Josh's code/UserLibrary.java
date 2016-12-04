/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EGameClasses;

import java.util.List;

/**
 *
 * @author Joshua
 */
public class UserLibrary {
    private List userGames;
    
   public void addGame(int gameId, String title, String genre, String console, double price){
       Game game = new Game(gameId, title, genre, console, price);
       userGames.add(game);
       
       
   }
}
