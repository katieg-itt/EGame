import javax.swing.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Keith on 25/11/2016.
 */
public class Refund {
    public static void main(String args[]) {

        Set<Game> games = new HashSet<>();
        Game g = new Game("Battelfield 1", "FPS", "1/10/16", 80, true, "abcdefg");
        games.add(g);
        Game d = new Game("Garrys Mod", "Sandbox", "1/1/15",1098 ,true,"Mr. Donnchadh");
        games.add(d);
        Game e = new Game("No Mans Sky", "Not a finished game", "1/7/16" , 2, true, "Total crap!!!!!");
        games.add(e);



        System.out.println(g);
        JOptionPane.showMessageDialog(null,games);

    } //end main()

} //end class
