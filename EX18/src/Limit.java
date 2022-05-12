/*
 * 
 * Program Name: Limit.java
 * Last edited on March 25th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program outputs the sum for sum = 1.0/(1 to N), N being the integer limit
 * entered by the user, and outputs the sum
 * 
 * */
import java.util.Scanner;

public class Limit
{

    public static void main(String[] args)
    {
        //declaring variables
    	int inputN;
    	double sum;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for N
        System.out.println("Enter N");
        inputN = sc.nextInt();
        sc.nextLine();
        
        
        //setting sum = 0
        sum = 0;
        for (int i = 1; i <=4; i++)
        {
        	sum += 1.0/(double)inputN;
        }
        
        //outputting out the sum
        System.out.println("Sum is: " + sum);
    }
}