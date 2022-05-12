/*
 * 
 * Program Name: SquareCube.java
 * Last edited on March 25th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for an upper limit N, and adds up the squares cubes of integers from 1 to N, 
 * and calculates the sum for all values 1 to N
 * 
 * */
import java.util.Scanner;

public class SquareCube
{

    public static void main(String[] args)
    {
        //declaring variables
    	int inputN, squareSum, cubeSum;
        Scanner sc = new Scanner(System.in);
        
        //prompting user for the upper limit
        System.out.println("Upper Limit:");
        inputN = sc.nextInt();
        sc.nextLine();
        
        //setting square sum and cube sum to 0
        squareSum = cubeSum = 0;
        
        //looping through the upper limit and adding the values of square sum and cube sum to itself
        for (int i = 1; i <= inputN; i++)
        {
        	squareSum += i*i;
        	cubeSum += i*i*i;
        }
        
        //outputting the respective values for sum of squares and sum of cubes
        System.out.println("The sum of Squares is " + squareSum);
        System.out.println("The sum of Cubes is " + cubeSum);
    }
}