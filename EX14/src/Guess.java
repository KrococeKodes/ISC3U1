/*
 * 
 * Program Name: Guess.java
 * Last edited on March 21th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user to guess for a number in the exclusive range of 1 to 20,
 * If the answer is correct, in the range, it output "Your guess is correct" and ends the loops.
 * If it is out of the range it exits the loops and prints "Invalid Number - Out of Range"
 * Else, it prompts the user to guess again
 * 
 * */
import java.util.Scanner;

public class Guess
{

    public static void main(String[] args)
    {
        //declaring variables
    	final int CORRECT_ANSWER = 12;
    	int userInt;
        Scanner sc = new Scanner(System.in);
        
        //initially setting it so the user hasn't entered the correct answer
        userInt = CORRECT_ANSWER + 1;
        
        //checking if user input is the correct answer, if not, prompts user for another guess
        while (userInt != CORRECT_ANSWER)
        {
        	System.out.print("Please enter a guess: ");
            userInt = sc.nextInt();
            sc.nextLine();
            if (userInt == CORRECT_ANSWER)
            {	
            	//if user input is correct, prints "Your guess is correct"
            	System.out.println("Your guess is correct!");
            }
            else if (userInt >= 20 || userInt <= 1)
            {
            	//if user input is out of the range, prints "Invalid Number - Out of range"
            	System.out.println("Invalid Number - Out of range");
            	userInt = CORRECT_ANSWER;
            }
        }
    }
}