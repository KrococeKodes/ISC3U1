/*
 * 
 * Program Name: Tip.java
 * Last edited on March 12th, 2022
 * By: Lucas Chow
 * ICS3U1
 * 
 * Ex13: Case & Switch
 * 
 * This program prompts the user for the letter grade of their computer science course, and outputs some 
 * hand selected advice by yours truly :)
 * 
 * The study tip / advice is different for each letter grade you have.
 * */
import java.util.Scanner;

public class Tip
{

    public static void main(String[] args)
    {
        //declaring variables
    	String letterInput;
    	Scanner sc = new Scanner(System.in);
       
    	//prompting user for their letter grade
        
        System.out.println("Please enter your letter grade in your computer science course: ");
        System.out.println("(80 - 100)  A");
        System.out.println("(70 - 79)   B");
        System.out.println("(60 - 69)   C");
        System.out.println("(50 - 59)   D");
        System.out.println("(0 - 49)    F");
        System.out.print("\nYour letter grade: ");
    
        letterInput = sc.nextLine();
        
       
        System.out.println("\nYour personal advice:\n");
        
        //prints out their respective message coordinating to the letter they inserted
        if (letterInput.toLowerCase().equals("a"))
        {
        	System.out.println("look at past test excersizes, to ensure you don't repeat mistakes stopping \nyou from getting the highest possible mark you can acheive!");
        }
        else if (letterInput.toLowerCase().equals("b"))
        {
        	System.out.println("Keep on asking the teacher questions to elevate your work to the next level!");
        }
        else if (letterInput.toLowerCase().equals("c"))
        {
        	System.out.println("Ask for extra help from the teacher, and explore other resources (W3schools, Code Academy, etc) \nto ensure a thorough knowledge of the material");
        }
        else if (letterInput.toLowerCase().equals("d"))
        {
        	System.out.println("Ask for extra help, do the excersizes on time, ask peers, consult lecture slides, \ndo everything in your power to bring up your mark!!");
        }
        else if (letterInput.toLowerCase().equals("f"))
        {
        	System.out.println("Unless you haven't handed in ANYTHING and haven't payed attention at all, \nconsider talking to your guidance counselor :)\nOtherwise, look into credit rescue");
        }
        else
        {
        	System.out.println("That is not a valid letter!");
        }
        

        
    }
}