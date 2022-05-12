/*
 * 
 * Program Name: Pass.java
 * Last edited on March 12th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * Ex13: Case & Switch
 * 
 * This program using the random method from the math class to create a random equation using 2 random numbers and a random operator. It then
 * prints the equation and prompts the user for the correct answer, and outputs if the user is correct or not.
 * */
import java.util.Scanner;

public class Pass
{

    public static void main(String[] args)
    {
        //declaring variables
    	double answer, userInput;
    	int rand1, rand2;
    	int randOp;
        Scanner sc = new Scanner(System.in);
        
        //initializing values of variables
        rand1 = (int)(Math.random()*100+1);
        rand2 = (int)(Math.random()*100+1);
        randOp = (int)(Math.random()*4+1);
        
        //default value, although won't be used due to the following switch statement, to avoid error
        answer = 0;
        
        //prompting user in switch & case using printf, as well as setting the answer to the correct value
        switch (randOp)
        {
        case 1:
        	System.out.printf("%d %s %d = ",rand1,"+",rand2);
        	answer = rand1 + rand2;
        	break;
        case 2:
        	System.out.printf("%d %s %d =  ",rand1,"/",rand2);
        	answer = ((double) (rand1))/((double)(rand2));
        	break;
        case 3:
        	System.out.printf("%d %s %d = ",rand1,"*",rand2);
        	answer = ((double) (rand1) * (double) (rand2));
        	break;
        case 4:
        	System.out.printf("%d %s %d = ",rand1,"-",rand2);
        	answer = rand1 - rand2;
        	break;
        }
        
        //program retrieves user input
        userInput = sc.nextInt();
        sc.nextLine();
        
        //prints if it is correct or not
        if (userInput == answer)
        {
        	System.out.println("That is correct!");
        }
        else
        {
        	System.out.println("That is incorrect");
        }
        
        
        
        	
        
    }
}