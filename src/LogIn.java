/**
 * Created by Katie on 21/11/2016.
 */
import java.util.Scanner; // I use scanner because it's command line.

public class LogIn {
    public void run() {
        Scanner input = new Scanner (System.in);
        Scanner keyboard = new Scanner (System.in);

        String user = input.nextLine();
        String pass = input.nextLine(); // looks at selected file in input

        String User = keyboard.nextLine();
        String Pass = keyboard.nextLine(); // gets input from user

        if (User.equals(user) && Pass.equals(pass)) {
            System.out.print("Sucessful log in");
        } else {
            System.out.print("Log in unsucessful, Please try again");
        }
    }
}
