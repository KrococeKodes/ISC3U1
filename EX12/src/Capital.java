/*
 * 
 * Program Name: Capital.java
 * Last edited on March 12th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * Ex12 - Selection Tracing and More
 * 
 * This program prompts the user for the capital of Canada (Ontario), and checks if their
 * answer is true or not. 
 * 
 * */
import java.util.Scanner;

public class Capital
{

    public static void main(String[] args)
    {
        //declaring variables
    	String input;
        Scanner sc = new Scanner(System.in);
        
        //prompting user

    	System.out.print("what is the capital of Canada? ");
        input = sc.nextLine();
        
        //outputs whether the user is correct or incorrect in inputing the correct answer
        if (input.toLowerCase().equals("ontario"))
        {
        	System.out.println("Correct!");
        }
        else
        {
        	System.out.println("Incorrect");
        }
 
        
    }
}