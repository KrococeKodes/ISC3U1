/*
 * 
 * Program Name: Age.java
 * Last edited on March 21th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user to guess my age (15) until they get it right, effectively printing out "That is correct"
 * 
 * */
import java.util.Scanner;

public class Age
{

    public static void main(String[] args)
    {
        //declaring variables
    	final int CREATOR_AGE = 15;
    	int userInt;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for their age
        System.out.print("Guess my age! ");
        userInt = sc.nextInt();
        sc.nextLine();
        
        //checking if input is correct, if not, prompts the user again for another guess
        while (userInt != CREATOR_AGE)
        {
        	System.out.print("Guess my age! ");
            userInt = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("That is correct!");
    }
}