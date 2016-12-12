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
    //The 8 below is a magic number and i would fix it by using the length of the array 
    //instead of just a numeric number. this way if inventory  changes it will change with the code. 
    //i cannot fix this because i dont know how to get access to the length of the array in the inventory. 
    for(int i = 1; i <=8; i++){
    
    myList.add(inventory.getGame(i));
    
    }
    
    String choice =(JOptionPane.showInputDialog("\n Type in the game you want to buy and type -1 if you are finished buying. \n" + myList.toString() + "\n and you have " + user.getMoney() + " euro left"));
    int choiceInt = Integer.parseInt(choice);
    
    while (choiceInt != -1){
    JOptionPane.showMessageDialog(null, "\n  you chose " + inventory.getGame(choiceInt).toString() + "\n\n");
    double newAmount = user.getMoney();
    newAmount = newAmount - inventory.getGame(choiceInt).getPrice();
    user.setMoney(newAmount);
    usersLibrary.addGame(inventory.getGame(choiceInt));
    
    JOptionPane.showMessageDialog(null,"You have " +String.format("%.2f",user.getMoney()) + " euro left");
    if(user.getMoney() < inventory.getGame(4).getPrice()){
    JOptionPane.showMessageDialog(null, "You cannot afford any more games");
    break;
        
    }
    choice =(JOptionPane.showInputDialog("\n" + myList.toString() + "\n"));
    choiceInt = Integer.parseInt(choice);

    }
    
    
    
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