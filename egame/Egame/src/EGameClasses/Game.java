/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Code written by Joshua
package EGameClasses;


/**
 *
 * @author Joshua
 */
class Game {
    private int gameId = 0;
    private String title;
    private Genre genre;
    private Console console;
    private double price;

    
    public  Game(){
        gameId = 0;
        title = null;
        genre = null;
        console = null;
        price = 0;
    }
    
    public  Game (int gameId, String title, Genre genre,Console  console, double price){
        this.gameId = gameId;
        this.title = title;
        this.genre = genre;
        this.console = console;
        this.price = price;
    }
    
    
    /**
     * @return the gameId
     */
    public int getGameId() {
        return gameId;
    }

    /**
     * @param gameId the gameId to set
     */
    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the genre
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    /**
     * @return the console
     */
    public Console getConsole() {
        return console;
    }

    /**
     * @param console the console to set
     */
    public void setConsole(Console console) {
        this.console = console;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
 
    @Override
    public String toString() {
        return (this.gameId + " "  + this.title + " " + this.genre + " " + this.console + " " + this.price + "\n");
    }
    
    
    
}
