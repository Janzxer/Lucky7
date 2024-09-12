import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random random = new Random ();
        String answer = "";
        int money = 0;
        

            System.out.println("Shall we play a game of slots?");
            System.out.println("Press enter or type " + "no.");
            answer = in.nextLine();

        if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n") || !answer.isEmpty())
            {
            System.out.println("Have a nice day!");
            in.close();
            return;
            }

            System.out.println("How much money would you like to bet?");
            String bet = in.nextLine();
        
        if (bet.isEmpty())
            {
            System.out.println("Invalid number, setting money to 5");
            money = 5;
            } 
                else
                {//Catching the exception that would occur if user would input something other than numeric value.
                try {
                    money = Integer.parseInt(bet);
                    if (money <=0)
                        {
                        System.out.println("Invalid number, setting money to 5");
                        money = 5;
                        }
                    }
                    catch (NumberFormatException e)
                        {
                        System.out.println("Invalid number, setting money to 5");
                        money = 5;
                        }
                }

        if (answer.isEmpty() || answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y") && money >=1)
            {
            do 
            {
            //Generating 3 random numbers.   
            int randomNumber1 = random.nextInt(10) + 1;
            int randomNumber2 = random.nextInt(10) + 1;
            int randomNumber3 = random.nextInt(10) + 1;
        
            //Rolling the slots
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

            //Payouts for corresponding amount of 7s
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

            //Notifying the user how much money they have left, and breaking the loop if money reaches 0
            System.out.println("You have " + money + " money left!");

        if (money <= 0)
            {
            System.out.println("You ran out of money! Unlucky!");
            break;
            }
        
            //Asking if the player wants to roll again.
            System.out.println("Play again? Press enter or type " + "no.");
            answer = in.nextLine();
            } while (answer.equalsIgnoreCase("Yes") || answer.isEmpty() || answer.equalsIgnoreCase("Y"));       //End of the do loop.
        }                                                                                                       // Closing the IF statement. That asks the user if they want to play again.
        System.out.println("Have a nice day!");                                                                 // Ending message and closing the scanner.
        in.close();
    }
}