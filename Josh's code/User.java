/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Code written by Joshua
package EGameClasses;


import java.util.List;

/**
 *
 * @author Joshua
 */
public class User {
    private String username;
    private String password;
    private String name;
    private double money;
    
    public User(String username, String password, String name, double money){
        this.username = username;
        this.password = password;
        this.name = name;
        this.money = money;
    }
    /**
     * @return the userName
     */
    public String getUserName() {
        return username;
    }

    /**
     * @param userName the userName to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the Money
     */
    public double getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    
}
