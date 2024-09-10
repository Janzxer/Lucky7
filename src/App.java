import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random random = new Random ();
        String answer = "";

        System.out.println("Shall we play a game of slots?");
        System.out.println("Yes/No");
        answer = in.nextLine();

        if (answer.equalsIgnoreCase("Yes"))
        {
        do {
                int randomNumber1 = random.nextInt(10) + 1;
                int randomNumber2 = random.nextInt(10) + 1;
                int randomNumber3 = random.nextInt(10) + 1;

                System.out.println("Ok, let's play.");
                System.out.println("Rolling numbers between 1-10");
                System.out.println(randomNumber1);
                System.out.println(randomNumber2);
                System.out.println(randomNumber3);

                    // Checking if there is a winning combination
                    if (randomNumber1 == 7 && randomNumber2 == 7 && randomNumber3 == 7)
                    {
                    System.out.println("JACKPOT");  
                    }
                    else if (randomNumber1 == 7 && randomNumber2 == 7 || randomNumber2 == 7 && randomNumber3 ==7 || randomNumber1 == 7 && randomNumber3 == 7)
                    {
                    System.out.println("You've won Double!");
                    }
                    else if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7)
                    {
                    System.out.println("You've won!");
                    }
                    else
                    {
                    System.out.println("You've lost!");
                    }
                    System.out.println("Play again? Yes/No");
                    answer = in.nextLine();
            }
                    while (answer.equalsIgnoreCase("Yes"));
                    System.out.println("Have a nice day!");
        }    
    else
    {
    System.out.println("Have a nice day!");
    }
in.close();
    }
}
