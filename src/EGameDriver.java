import javax.swing.*;
import java.util.Scanner;

/**
 * Created by t00021385 on 21/11/2016.
 */
public class EGameDriver {
    public static void main(String args[]){


        EGameSystem game = new EGameSystem("Battlefield 1","Active","FPS","21/11/16","2","abZ158Ip");

        String refund = JOptionPane.showInputDialog("Please enter the game you would like to refund");
        if(refund == "")
        {
            JOptionPane.showMessageDialog(null,"Nothing has been entered");
        }
        else
            JOptionPane.showMessageDialog(null,"The game you have entered is " + refund);

        System.out.println(game);

    } //end main
} //end class
