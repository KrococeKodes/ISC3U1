/*
 * 
 * Program Name: Salary.java
 * Last edited on March 8th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * This program prompts the user for the number of sales this person has made, if their base salary is $1000.
 * If their sales is greater than 10, then they get a commission of number of sales as a percentage.
 * If they didn't they receive base salary. Finally, the program outputs the total salary for the month.
 * 
 * */


import java.util.Scanner;

public class Salary
{
	public static void main(String[] args)
	{
		//declaring variables
		final int BASE_SALARY = 1000;
		int salesPerMonth;
		double bonusSalary;
		double totalSalary;
		Scanner sc = new Scanner(System.in);
		
		
		//prompts user for the number of sales this person made
		System.out.print("How many sales has this person made? ");
		salesPerMonth = sc.nextInt();
		sc.nextLine();
		
		// if salesperson deserves bonus salary
		if (salesPerMonth > 10)
		{
			bonusSalary = BASE_SALARY * ((double)salesPerMonth/100);
		}
		else
		{
			bonusSalary = 0;
		}
		
		//calculating totalSalary
		totalSalary = BASE_SALARY + bonusSalary;
		
		//outputs total salary
		System.out.printf("This person has total monthly salary of $%,.2f",totalSalary);
	}
}
