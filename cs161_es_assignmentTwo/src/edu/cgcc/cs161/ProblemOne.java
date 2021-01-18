package edu.cgcc.cs161;

//HEADER
//Program Name: Week 2 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/17/2021
//Description: This problem involves using conditionals to describe the integer input. 

public class ProblemOne {
	/*PSEUDOCODE
	 *  Program Start
	 *  Declare and initialize variable
	 *  If variable equals 0 then print 0
	 *  	Otherwise print "Positive" if bigger and "Negative" if less.
	 *  If variable is less than 1, print "Small".
	 *  If variable is bigger than 1000000, print "Large".
	 *  Program End
	 */ 
	public static void main(String[] args) {
		
		float num1 = -3f;  
		if (num1 == 0f) {
			System.out.println("Zero");
			}
		else if (num1 > 0.0) {
			System.out.println ("Positive");
		}
		else if (num1 < 0.0) {
			System.out.println ("Negative");
	
		}
		if (num1 < 1.0) {
			System.out.println("Small");
			}
		if (num1 > 1000000) {
			System.out.println("Large");
		}
		}
}
/*FOOTER
 * Zero
Small

Positive
Large

Negative
Small
 */

