/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EGameClasses;

/**
 *
 * @author Joshua
 */
public class DriverProgram {
   public static void main(String args[]){
   
    Inventory inventory = new Inventory();
    fillInventory(inventory);
    /* Testing the getGame method. 
    Game mygame = inventory.getGame(3);
    System.out.print(mygame.toString());
    
    */
    
    
    
    
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
