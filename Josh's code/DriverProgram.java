/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EGameClasses;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Joshua
 */
public class DriverProgram {
   public static void main(String args[]){
    UserLibrary usersLibrary = new UserLibrary();
    Inventory inventory = new Inventory();
    fillInventory(inventory);
    User user = new User("Revenant90","12345", "Joshua", 125);
    
    ArrayList myList= new ArrayList();
    for(int i = 1; i <= 8; i++){
    
    myList.add(inventory.getGame(i));
    
    }
    String choice =(JOptionPane.showInputDialog(myList.toString()));
    int choiceInt = Integer.parseInt(choice);
    
    JOptionPane.showMessageDialog(null, "you chose " + inventory.getGame(choiceInt).toString());
    
    
    double newAmount = user.getMoney();
    newAmount = newAmount - inventory.getGame(choiceInt).getPrice();
    user.setMoney(newAmount);
    JOptionPane.showMessageDialog(null, user.getMoney());
    
    
    usersLibrary.addGame(inventory.getGame(choiceInt));
    
    JOptionPane.showMessageDialog(null, user.getMoney());
     
    
}

private static void fillInventory(Inventory inventory){
   inventory.addGame(1,"Call of Duty", Genre.Action, Console.PS4, 59.99);
   inventory.addGame(2,"Pokemon Sun/Moon", Genre.RPG,Console.Nintendo_3DS, 39.99);
   inventory.addGame(3,"Path Of Exile", Genre.RPG, Console.PC, 29.99);
   inventory.addGame(4,"Dead by Daylight", Genre.Horror, Console.PC, 16.99);
   inventory.addGame(5,"System has Failed", Genre.Racing, Console.PS4, 59.99);
   inventory.addGame(6,"Crash Bandicoot 3", Genre.Action, Console.PS4, 32.99);
   inventory.addGame(7,"Call of Duty", Genre.Action, Console.Xbox_1, 59.99); 
   inventory.addGame(8,"Never Ending Story", Genre.MMO, Console.PC, 59.99);
   
}

}
