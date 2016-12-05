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
    User user = new User("Revenant90","12345", "Joshua", 500);
    
    ArrayList myList= new ArrayList();
    for(int i = 1; i <= 7; i++){
    
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
   inventory.addGame(1,"Call of Duty", "Action", "Xbox One", 59.99);
   inventory.addGame(2,"Pokemon Sun/Moon", "RPG", "3DS", 39.99);
   inventory.addGame(3,"Path Of Exile", "RPG", "PC", 29.99);
   inventory.addGame(4,"Dead by Daylight", "Horror", "PC", 16.99);
   inventory.addGame(5,"System has Failed", "Adventure", "PS4", 59.99);
   inventory.addGame(6,"Crash Bandicoot 3", "Adventure", "PS4", 32.99);
   inventory.addGame(7,"Call of Duty", "Action", "Xbox One", 59.99);   
}

}
