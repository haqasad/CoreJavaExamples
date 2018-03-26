package com.haqasad.main.operators;
/**
* <h1>Ternary Operators</h1>
* <p>
* Different use cases for instance of operator.
* The usage of this operator is shown in single method. 
*
* @author  Asadul Haque
* @version 1.0
* @since   03/22/2018
*/

public class InstanceOfOp {

	/**
	* The method determines if an object is instance of
	* a class and returns true or false.
	* @param None
	* @return boolean
	*/	
	public boolean isInstanceOf () {
		String name = "James";
		boolean result = name instanceof String;
		return result;
	}
}
