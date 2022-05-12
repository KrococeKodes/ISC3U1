/*
 * 
 * Program Name: .java
 * Last edited on April , 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for an array size, and then prompts them
 * to fill in the array, using a single array to reverse it. After 
 * reversing the list, it outputs the reversed list
 * */
import java.util.*;

public class SelfReverse
{

    public static void main(String[] args)
    {
        //declaring variables
        int[] arr;
        int inputn;
        Scanner sc = new Scanner(System.in);
        
        
        //prompting user for array size, making sure it is a positive number
        do {
            System.out.print("Enter an array size: ");
            inputn = sc.nextInt();
            sc.nextLine();
            if (inputn < 0)
            {
            	System.out.println("Enter positivive number for n");
            }
        } while (inputn < 0);

        
        //prompts the user for values in the array
        arr = new int[inputn];
        for (int i = 0; i < inputn; i++)
        {
        	System.out.print("Enter a number: ");
        	arr[i] = sc.nextInt();
        	sc.nextLine();
        }
        
        //reverses the array
        for (int i = 0; i < (inputn/2); i++)
        {
        	arr[i] = arr[i] + arr[inputn - 1 - i];
        	arr[inputn - 1 - i] = arr[i] - arr[inputn - 1 - i];
        	arr[i] = arr[i] - arr[inputn- 1 - i];
        }
        
        //outputs the reversed array
        for (int i = 0; i < inputn; i++)
        {
        	System.out.println(arr[i]);
        }
        
    
    }
}