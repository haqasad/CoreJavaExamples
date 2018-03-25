package com.haqasad.main.operators;
/**
* <h1>Relational and Equality Operators</h1>
* <p>
* Different use cases for relational and equality operators.
* The usage of opeartors are displayed using one method
*
* @author  Asadul Haque
* @version 1.0
* @since   03/21/2018
*/

public class RelationalOp {

	/**
	* The method compares two numbers and determines their 
	* relationship (equal, greater or less)
	* 
	* @param num_1 Takes the first argument as double literal
	* @param num_2 Takes the second argument as double literal
	* @return void
	*/	
	public void compareVal (double num_1, double num_2) {
		if (num_1 == num_2) {
			System.out.println("Number 1 and Number 2 are equal");
		} else {
			if (num_1 < num_2) {
				System.out.println("Number 1 is lesser than Number 2"); 
			} else {
				System.out.println("Number 1 is greater than Number 2"); 
			}
		}
	}
}
