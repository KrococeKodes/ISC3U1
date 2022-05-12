/*
 * 
 * Program Name: LeastTwoPower.java
 * Last edited on March 21th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for a number, and prints out the least power of two that is greater or equal to the inputed number, using
 * while loops.
 * */
import java.util.Scanner;


public class LeastTwoPower
{


    public static void main(String[] args)
    {
        //declaring variables
    	int userInt, powerOfTwo;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for a number
        System.out.print("Please enter a number: ");
        userInt = sc.nextInt();
        sc.nextLine();
        
        //calculating the lowest power of two greater or equal to the number
        powerOfTwo = 1;
        while (powerOfTwo < userInt)
        {
        	powerOfTwo = powerOfTwo*2;
        	
        }
        
        //outputting the power of two that fits the parameters.
        System.out.println(powerOfTwo);
        
        
    }
}