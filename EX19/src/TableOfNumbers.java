/*
 * 
 * Program Name: TableOfNumbers.java
 * Last edited on March 31th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts user for x and y and then outputs x rows and y columns
 * 
 * */
import java.util.Scanner;

public class TableOfNumbers
{

    public static void main(String[] args)
    {
        //declaring variables
    	int userX, userY;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for x and y
        System.out.print("Enter x:  ");
        userX = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter y:  ");
        userY = sc.nextInt();
        sc.nextLine();
        
        //prints out the rows and columns of x and y
        for (int i = 1; i <= userX; i++)
        {
        	for (int q = 1; q <=userY; q++)
        	{
        		System.out.print(q + " ");
        	}
        	System.out.println();
        }
    }
}