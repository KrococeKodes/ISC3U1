/*
 * 
 * Program Name: Rectangle.java
 * Last edited on March 31th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program outputs a rectangle with asterisks, prompting
 * the user for the number of rows and number of columns
 * 
 * */
import java.util.Scanner;

public class Rectangle
{
	
    public static void main(String[] args)
    {
        //declaring variables
    	int userRows,userColumns;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for # of rows and $ of columns
        System.out.print("Enter # of rows:  ");
        userRows = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter # of columns:  ");
        userColumns = sc.nextInt();
        sc.nextLine();
        
        //prints out the rows and columns
        for (int i = 1; i <= userRows; i++)
        {
        	for (int y = 1; y <= userColumns; y++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }
}