import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random random = new Random ();
        int randomNumber = random.nextInt(11);
        String answer = "";
        
        System.out.println("Shall we play a game of slots?");
        System.out.println("Yes/No");
        if (answer.equalsIgnoreCase("Yes"))
        {
            System.out.println("Ok, let's play.");
        }
    }
}
