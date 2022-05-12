/*
 * 
 * Program Name: Temperature.java
 * Last edited on March 8th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for a temperature, and prints
 * out the respective message for the range the temperature falls in:
 * 
 *
 * 
 * */
import java.util.Scanner;

public class Temperature
{

    public static void main(String[] args)
    {
        //declaring variables
    	int inputTemp;
        Scanner sc = new Scanner(System.in);
        
        //prompting user to enter a temperature in degrees Celsius
        System.out.print("Enter a temperature in degrees Celsius: ");
        inputTemp = sc.nextInt();
        sc.nextLine();
        
        
        // This checks the range the temperature falls in, and the preceding output message
        if (inputTemp < -18)
        {
        	System.out.println("very cold");
        }
        else if (inputTemp >= -18 && inputTemp < 0)
        {
        	System.out.println("cold");
        }
        else if (inputTemp == 0)
        {
        	System.out.println("freezing point of water");
        }
        else if (inputTemp > 0 && inputTemp <= 10)
        {
        	System.out.println("very cool");
        }
        else if (inputTemp > 10 && inputTemp <= 20)
        {
        	System.out.println("moderate");
        }
        else if (inputTemp > 20 && inputTemp <= 30)
        {
        	System.out.println("warm");
        }
        else if (inputTemp > 30 && inputTemp <= 40)
        {
        	System.out.println("hot");
        }
        else if (inputTemp > 40 && inputTemp < 100)
        {
        	System.out.println("extremely hot");
        }
        else
        {
        	System.out.println("boiling point of water");
        }
        
    }
}