package edu.cgcc.cs161;

//HEADER
//Program Name: Week 2 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/17/2021
//Description: This problem involves using and implementing the logic of a user. 
import java.util.Scanner;

public class ProblemFour {
	
	/*PSEUDOCODE
	 *  Program Start
	 *  Declare variable number
	 *  Create a new scanner class for user that asks to enter a number between 0 and 100
	 *  Create new object to receive an answer on a different line 
	 *  If variable is more than 50 and less than or equal to 100, print "Pass"
	 *  	Otherwise if variable less than 50 and more than or equal to 0, print "Fail"
	 *  	Otherwise if neither print "Number is zero"
	 *  Program End
	 */ 

	public static void main(String[] args) {
		
		int number;
		
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter a number between 0 and 100:");
	    
	    number = myObj.nextInt();  
	    
	    if (number > 50) {
	     if (number <= 100)
        	System.out.println("Pass");
        }
	    else if (number < 50) {
	    	if (number >= 0)
        	System.out.println("Fail");
        }
	}
}
/*FOOTER
Enter a number between 0 and 100:
26
Fail

Enter a number between 0 and 100:
99
Pass
*/
