import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random random = new Random ();
        String answer = "";
        int money = 5;
        

        System.out.println("Shall we play a game of slots? Starting money is " + money + ".");
        System.out.println("Press enter or type " + "no.");
        answer = in.nextLine();

        if (answer.isEmpty() || answer.equalsIgnoreCase("Yes") && money >=1)
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
                    int reward = 0;
                    if (randomNumber1 == 7) reward++;
                    if (randomNumber2 == 7) reward++;
                    if (randomNumber3 == 7) reward++;

                    if (reward == 3)
                    {
                    money += 27;
                    System.out.println("JACKPOT");
                    reward = 0;  
                    }
                    else if (reward == 2)
                    {
                    money += 9;
                    System.out.println("You've won Double!");
                    reward = 0;
                    }
                    else if (reward ==1)
                    {
                    money += 3;
                    System.out.println("You've won!");
                    reward = 0;
                    }
                    else
                    {
                    System.out.println("You've lost!");
                    }
                    money--;
                    System.out.println("You have " + money + " money left!");

                    if (money <= 0)
                    {
                        System.out.println("You ran out of money! Unlucky!");
                        break;
                    }
                    System.out.println("Play again? Press enter or type " + "no.");
                    answer = in.nextLine();
            }
                    while (answer.equalsIgnoreCase("Yes") || answer.isEmpty());     //End of the do loop.
        }                                                       // Closing the IF statement.
                    System.out.println("Have a nice day!");     // Ending message and closing the scanner.
                    in.close();
    }
}