/*
 * 
 * Program Name: Marks.java
 * Last edited on April 6, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program creates 2 arrays of size 4, prompting the user for values in the two arrays. (Name and mark, respectively)
 * The program than prompts the user for a mark, and indexes through the array to see what name the mark coordinates to.
 * If no name coordinates towards the mark, then outputs it can't be found
 * 
 * */
import java.util.*;

public class Marks
{

    public static void main(String[] args)
    {
        //creating variables
    	String[] arrName;
    	int[] arrMark;
    	int userMark;
    	arrName = new String[4];
    	arrMark = new int[4];
        Scanner sc = new Scanner(System.in);
        
        //prompts user for 4 people, and their respective mark
        for (int i = 0; i < 4; i++)
        {
            System.out.print("Enter a person's name: ");
            arrName[i] = sc.nextLine();
            
            System.out.print("Enter a person's mark: ");
            arrMark[i] = sc.nextInt();
            sc.nextLine();
        }
        
        //prompts the user for the mark to index database
        System.out.print("Enter a mark: ");
        userMark = sc.nextInt();
        sc.nextLine();
        
        //loops through to see what person it coordinates to. If none, then outputs "Mark can't be found, does not exist"
        for (int i = 0; i < 4; i++)
        {
        	if (arrMark[i] == userMark)
        	{
        		System.out.println("The person who got this mark is " + arrName[i]);
        	}
        	else if (arrMark[i] != userMark && i == 3)
        	{
        		System.out.println("Mark can't be found, does not exist");
        	}
        }
    
    }
}