/*
 * 
 * Program Name: SameSum.java
 * Last edited on April 6, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for 10 values, and creates a list of the same size
 * where corresponding indexes add up to 25. (Ex. List1[2] = 5, therefore list2[2] = 20)
 * The program then outputs both list1 and list2
 * 
 * */
import java.util.*;

public class SameSum
{

    public static void main(String[] args)
    {
        //declaring variables and objects
    	int[] list1, list2;
    	list1 = new int[10];
    	list2 = new int[10];
        Scanner sc = new Scanner(System.in);
        
        //prompting user for values in the array, calculating the coordinating value in list2
        for (int i = 0; i < 10; i++)
        {
        	System.out.print("Enter in a value: ");
        	list1[i] = sc.nextInt();
        	sc.nextLine();
        	list2[i] = 25 - list1[i];
        }
        
        
        //outputs the values of list1 and list2
        System.out.println("List1  List2");
        for (int i = 0; i < 10; i++)
        {
        	System.out.printf("%d   %d\n",list1[i],list2[i]);
        }
    }
}