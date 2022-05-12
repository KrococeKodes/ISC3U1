/*
 * 
 * Program Name: ConertDate.java
 * Last edited on March 12th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for a year, month, and date, and prints out it in a similiar fashion
 * to a cheque, with the month being in word form.
 * 
 * */
import java.util.Scanner;

public class ConvertDate
{

    public static void main(String[] args)
    {
        //declaring variables
    	int year, month, date;
        Scanner sc = new Scanner(System.in);
        
        //getting user input for year, month & date
        System.out.print("Please insert a year: ");
        year = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Please insert a month: ");
        month = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Please insert a date: ");
        date = sc.nextInt();
        sc.nextLine();
        
        //corresponding month number to month name, and outputs it with the date and year
       switch (month) 
       {
       case 1:
    	   System.out.printf("%s %d, %d","January",date,year);
    	   break;
       case 2:
    	   System.out.printf("%s %d, %d","February",date,year);
    	   break;
       case 3:
    	   System.out.printf("%s %d, %d","March",date,year);
    	   break;
       case 4:
    	   System.out.printf("%s %d, %d","April",date,year);
    	   break;
       case 5:
    	   System.out.printf("%s %d, %d","May",date,year);
    	   break;
       case 6:
    	   System.out.printf("%s %d, %d","June",date,year);
    	   break;
       case 7:
    	   System.out.printf("%s %d, %d","July",date,year);
    	   break;
       case 8:
    	   System.out.printf("%s %d, %d","August",date,year);
    	   break;
       case 9:
    	   System.out.printf("%s %d, %d","September",date,year);
    	   break;
       case 10:
    	   System.out.printf("%s %d, %d","October",date,year);
    	   break;
       case 11:
    	   System.out.printf("%s %d, %d","November",date,year);
    	   break;
       case 12:
    	   System.out.printf("%s %d, %d","December",date,year);
    	   break;
	   default:
		   System.out.println("Please insert in a value from 0 - 12 for a valid month");
       }
    }
}