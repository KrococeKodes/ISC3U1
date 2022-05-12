/*
 * 
 * Program Name: Count1.java
 * Last edited on March 23th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program outputs the numbers from 100 to 1 by 2
 * 
 * */


public class Count1
{
    public static void main(String[] args)
    {
        //declaring variables
        int loopValue;
        
        //Outputting the numbers counting from 100 to 1 by 2
        loopValue = 50;
        do {
        	System.out.println(loopValue*2);
        	loopValue--;
        } 
        while (loopValue >= 1);

    }
}