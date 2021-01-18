package edu.cgcc.cs161;

//HEADER
//Program Name: Week 2 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/17/2021
//Description: This problem involves using conditionals to describe AND, OR, and NAND gates. 

public class ProblemTwo {
	/*PSEUDOCODE
	 *  Program Start
	 *  Declare variable
	 *  Enter main method and call next
	 *  Initialize variable a and b = 0 and 1
	 *  If variables multiplied equal 1 then print true
	 *  	Otherwise print false 
	 *  Call next
	 *  Initialize variable a and b = 0 and 1
	 *  If variables added equal 1 or more, print true
	 *  	Otherwise if 0 then print false
	 *  Call next
	 *  Initialize variable a and b = 0 and 1
	 *  If variables multiplied is 0, print true
	 *  	Otherwise if 1, print false
	 *  Program End
	 */ 

	static int a;
	static int b;
	
	public static void main(String[] args) {
		AND();

	}
	
	public static void AND() {
		a = (0);
		b =(1);
		
		if (a * b == 1) {
			System.out.print(true);
		}
		else if (a * b == 0) {
			System.out.println(false); 
		}
		ProblemTwo myObject = new ProblemTwo();
		myObject.OR();
		}
		
		public void OR() {
			a=(0);
			b=(1);
		
		if (a + b >= 1 ) {
			System.out.println(true);
		}
		else if (a + b == 0) {
			System.out.println(false);
		}
		ProblemTwo myObject = new ProblemTwo();
		myObject.NAND();
	}
			
			public void NAND() {
		 a=(0);
		 b=(1);
			
		if (a * b == 1) {
			System.out.print(false);
		}
		else if (a * b == 0) {
			System.out.println(true);
		}
}
}
/*FOOTER
*false
*true
*true
*/