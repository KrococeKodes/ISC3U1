/*
 * 
 * Program Name: Unicode.java
 * Last edited on March 23th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program displays the Unicode table for characters 1 to 212
 * 
 * */

public class Unicode
{

    public static void main(String[] args)
    {
        //declaring variables
        int loopValue;
        char unicodeValue;
        
        //looping through a while look printing out all unicode values for the range of 1 to 212
        loopValue = 0;
        
        System.out.println("Unicode   Character");
        do {
        	unicodeValue = (char) loopValue;
        	System.out.printf("%-12d %c \n",loopValue, unicodeValue);
        	
        	loopValue++;
        } while (loopValue <= 212);
    }
}