/*
 * 
 * Program Name: TwoLargest.java
 * Last edited on April 6, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program creates an array of 10, filling it with random numbers. It then
 * outputs the two largest items in the array.
 * 
 * */
import java.util.*;

public class TwoLargest
{

    public static void main(String[] args)
    {
    	//declaring variables and objects
        int[] arr1;
        int ranNum1;
        int highestNum, secondHigh;
        arr1 = new int[10];
        Scanner sc = new Scanner(System.in);
        
        //creating random int array of 10 elements
        for (int i = 0; i < 10; i++)
        {
        	ranNum1 = (int)(Math.random()*100);
        	arr1[i] = ranNum1;
        }
        
        //Outputting the random numbers to the user
        System.out.println("Numbers in the list");
        for (int i = 0; i <10; i++)
        {
        	System.out.println("Ran Num #"+(i+1)+": "+arr1[i]);
        }
        
        //initializing values to be used in the for loop
		highestNum = arr1[0];
		secondHigh = arr1[0];
        
		//finding the highest number
        for (int i = 0; i < 10; i++)
        {
    		if (arr1[i] > highestNum)
    		{
    			highestNum = arr1[i];
    			arr1[i] = 0;
    		}
        }
        
        //finding the second highest number
        for (int i = 0; i < 10; i++)
        {
        	arr1[0] = secondHigh;
        	if (arr1[i] > secondHigh)
        	{
        		arr1[i] = secondHigh;
        	}
        }
        
        //outputting the highest and second highest numbers
    	System.out.println("\nHighest number: "+highestNum);
    	System.out.println("Second highest: "+secondHigh);
        
        
    
    }
}