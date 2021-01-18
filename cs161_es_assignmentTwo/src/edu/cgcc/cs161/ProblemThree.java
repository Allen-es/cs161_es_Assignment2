package edu.cgcc.cs161;

//HEADER
//Program Name: Week 2 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/17/2021
//Description: This problem involves using the logic of a user to define the polarity of the integer input. 

import java.util.Scanner;

public class ProblemThree {
	
	/*PSEUDOCODE
	 *  Program Start
	 *  Declare variable number
	 *  Create a new scanner class for user that asks to enter a number
	 *  Create new object to receive an answer on a different line 
	 *  If variable is more than 0 then print "Number is positive"
	 *  	Otherwise if less than 0 print "Number is negative"
	 *  	Otherwise if neither print "Number is zero"
	 *  Program End
	 */ 


	public static void main(String[] args) {
				  
		int number;
				
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter a number:");
	  
		number = myObj.nextInt();   
		  
        if (number > 0) {
        	System.out.println("Number is positive.");
        }
        	else if (number < 0) {
        	System.out.println("Number is negative.");
        }
	        else {
	        	System.out.println("Number is zero");
        }
	}
}
/*FOOTER
 * Enter a number:
77
Number is positive.

Enter a number:
-1
Number is negative.			  
 */

