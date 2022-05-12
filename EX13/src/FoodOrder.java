/*
 * 
 * Program Name: FoodOrder.java
 * Last edited on March 12th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * Ex13: Case & Switch
 * 
 * This program prompts the user for a number corresponding to a meal they selected, and the respective price to the meal.
 * */
import java.util.Scanner;

public class FoodOrder
{

    public static void main(String[] args)
    {
        //declaring variables
    	int choice;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for their choice on the menu
        System.out.println("Choose something from the menu\n");
        System.out.println("1) juice, muffin & coffee");
        System.out.println("2) cereal, toast, & milk");
        System.out.println("3) egg, toas & coffee");
        System.out.println("4) banana, granola & milk");
        System.out.println("5) grapefruit, bacon, eggs & coffee");
        System.out.print("\nInsert the number coordinating to your purchase (Ex. Juice, muffin & coffee: 1): ");
        choice = sc.nextInt();
        sc.nextLine();
        
        //uses case function to check what input the user inputs and the respective cost
        
        switch(choice) {
        	case 1:
        		System.out.print("The price is ");
        		System.out.println("$2.50");
        		break;
        	case 2:
        		System.out.print("The price is ");
        		System.out.println("$2.50");
        		break;
        	case 3:
        		System.out.print("The price is ");
        		System.out.println("$3.00");
        		break;
        	case 4:
        		System.out.print("The price is ");
        		System.out.println("$4.00");
        		break;
        	case 5:
        		System.out.print("The price is ");
        		System.out.println("$5.00");
        		break;
        	default:
        		System.out.println("Please insert a valid number from 1 to 5");
        }
        
        
    }
}