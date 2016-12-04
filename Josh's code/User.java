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
    private String userName;
    private String password;
    private List cart;

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * @return the cart
     */
    public List<Game> getCart() {
        return cart;
    }

    /**
     * @param cart the cart to set
     */
    public void setCart(List<Game> cart) {
        this.cart = cart;
    }
    
}
