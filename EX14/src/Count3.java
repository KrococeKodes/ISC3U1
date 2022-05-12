/*
 * 
 * Program Name: Count3.java
 * Last edited on March th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts user to enter two numbers and inclusively prints the numbers in the range between the two numbers
 * 
 * */
import java.util.Scanner;

public class Count3
{

    public static void main(String[] args)
    {
        //declaring variables
        int userIntOne;
        int userIntTwo;
    	Scanner sc = new Scanner(System.in);
        
        //prompting user for bottom and top of range
    	System.out.print("Please enter the bottom number of the range: ");
    	userIntOne = sc.nextInt();
    	sc.nextLine();
    	System.out.print("Please enter the top number of the range: ");
    	userIntTwo = sc.nextInt();
    	sc.nextLine();
    	
    	//printing out the numbers in the range
    	while (userIntOne < userIntTwo + 1)
    	{
    		System.out.println(userIntOne++);
    	}
    }
}