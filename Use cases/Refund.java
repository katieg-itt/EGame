import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Keith Hussey on 25/11/2016.
 */
public class Refund {
    public static void main(String args[]) {

        Set<Game> games = new HashSet<>();
        Game g = new Game("Battelfield 1", Category.ACTION, "1/10/16", 80, true, "abcdefg");
        games.add(g);
        Game d = new Game("Garrys Mod", Category.ACTION, "1/1/15",1098 ,true,"Mr. Donnchadh");
        games.add(d);
        Game e = new Game("No Mans Sky", Category.PUZZLE, "1/7/16" , 2, true, "Total crap!!!!!");
        games.add(e);



        System.out.println(Category.RTS);
        JOptionPane.showMessageDialog(null,games);

    } //end main()

} //end class
