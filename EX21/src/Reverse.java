/*
 * 
 * Program Name: Reverse.java
 * Last edited on April , 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program has 2 list of size 10. It prompts the user for input of the values in list1, 
 * then reverses the values as thev values in list2.
 * It then outputs the values of list 1 and 2
 * 
 * */
import java.util.*;

public class Reverse
{

    public static void main(String[] args)
    {
        //
    	int[] list1;
    	int[] list2;
    	
    	list1 = new int[10];
    	list2 = new int[10];
        Scanner sc = new Scanner(System.in);
        
        //
        for (int i = 0; i < 10; i++)
        {
        	System.out.print("Enter a value: ");
        	list1[i] = sc.nextInt();
        	sc.nextLine();
        	
        	list2[9-i] = list1[i]; 
        	
        }
        
        System.out.println("List 1   List 2");
        
        for (int i = 0; i<10; i++)
        {
        	System.out.println(list1[i] + "        " + list2[i]);
        }
        
    
    }
}