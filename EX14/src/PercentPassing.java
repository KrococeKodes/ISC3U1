/*
 * 
 * Program Name: PercentPassing.java
 * Last edited on March 21th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program calculates the percentage of scores that are over 70. It keeps on prompting
 * the user for a score on the test until they enter a negative number, which exits
 * the loop and calculates the percentage
 * 
 * */
import java.util.Scanner;

public class PercentPassing
{

    public static void main(String[] args)
    {
        //declaring variables
    	int scoresAbove70, totalScores;
    	double percentageScoresAbove, userScores;
    	
        Scanner sc = new Scanner(System.in);
        
        //setting initial values
        userScores = 0;
        totalScores = 0;
        scoresAbove70 = 0;
        
        //prompting user for their test, while the test score is >=0
        while (userScores >= 0)
        {
            System.out.print("Enter your scores for your test: ");
            userScores = sc.nextInt();
            sc.nextLine();
            if (userScores > 70)
            {
            	scoresAbove70++;
            	totalScores++;
            }
            else if (userScores >= 0)
            {
            	totalScores++;
            }
        }
        //calculates the percentage of scores above, 
        percentageScoresAbove = ((double) (scoresAbove70) / (double) (totalScores))*100;
        
        //outputs the final percentage
        System.out.printf("\nThe percentage of scores above 70 is %.2f%%",percentageScoresAbove);
    }
}