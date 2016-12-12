/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EGameClasses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joshua
 */
public class UserLibrary {
    private List<Game> userGames;
   
    public UserLibrary(){
        userGames = new ArrayList<Game>();
    }
    
   public void addGame(Game game){ 
       
       userGames.add(game);
   
   }
}
