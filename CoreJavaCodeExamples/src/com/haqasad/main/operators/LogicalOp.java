package com.haqasad.main.operators;
/**
* <h1>Logical Operators</h1>
* <p>
* Different use cases for logical operators.
* The usage of logical operators are shown in single methods. 
*
* @author  Asadul Haque
* @version 1.0
* @since   03/22/2018
*/

public class LogicalOp {

	/**
	* The method prints if a double literal passed on as
	* parameter is between 10 and 50 or not.
	* @param num_1 Takes the first argument as double literal  
	* @return void
	*/	
	public void logicalAndOr(double num_1) {
		if (num_1>=10 && num_1<=50) {
			System.out.println("Number is between 10 and 50"); 
		} else if (num_1>=10 || num_1<=50) {
			System.out.println("Number is not between 10 and 50");
		}
	}
}