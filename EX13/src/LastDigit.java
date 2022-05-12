/*
 * 
 * Program Name: LastDigit.java
 * Last edited on March 12th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * Ex13: Case & Switch
 * 
 * This program prompts the user for a integer input and prints out the last digit, as a word.
 * 
 * 
 * */
import java.util.Scanner;

public class LastDigit
{

    public static void main(String[] args)
    {
    	//declaring variables
    	int intInput;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for a number
        
        System.out.print("Please enter a number: ");
        intInput = sc.nextInt();
        sc.nextLine();
        

        //prints out the original number
        System.out.printf("The last digit of %d is ",intInput);
        
        //prints out the word for all of the last digits
        switch (intInput%10)
        {
        case 1:
        	System.out.println("one");
        	break;
        case 2:
        	System.out.println("two");
        	break;
        case 3:
        	System.out.println("three");
        	break;
        case 4:
        	System.out.println("four");
        	break;
        case 5:
        	System.out.println("five");
        	break;
        case 6:
        	System.out.println("six");
        	break;
        case 7:
        	System.out.println("seven");
        	break;
        case 8:
        	System.out.println("eight");
        	break;
        case 9:
        	System.out.println("nine");
        	break;
        case 0:
        	System.out.println("zero");
        	break;
        }
    }
}