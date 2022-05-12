/*
 * 
 * Program Name: Pass.java
 * Last edited on March 10th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program is a modified iteration of the program in Ex11, but in this program, it utilizes the random method
 * from the math class to create two random numbers up to 100, and outputs an addition equation to the user
 * and checks if the user's input is the correct answer
 * 
 * */
import java.util.Scanner;

public class Pass
{

    public static void main(String[] args)
    {
        //declaring variables	
    	int randInt1;
    	int randInt2;
    	int userInput;
        Scanner sc = new Scanner(System.in);
        
        randInt1 = (int)(Math.random()*100);
        randInt2 = (int)(Math.random()*100);
        
        //prompting user for sum of two numbers
        System.out.printf("What is the sum of %d + %d: ",randInt1,randInt2);
        userInput = sc.nextInt();
        sc.nextLine();
        
        //checks if the random number 1 + random number 2 is equal to the user input, and outputs whether it is correct 
        if (randInt1 + randInt2 == userInput)
        {
        	System.out.println("That is correct");
        }
        else
        {
        	System.out.println("That is incorrect");
        }
    }
}