package com.haqasad.main.operators;
/**
* <h1>Ternary Operators</h1>
* <p>
* Different use cases for ternary operators.
* The usage of ternary operators are shown in single methods. 
*
* @author  Asadul Haque
* @version 1.0
* @since   03/22/2018
*/

public class TernaryOp {

	//==============================================================================
	// 						TERNARY OPERATIONS	
	//==============================================================================
	// variable x = (expression) ? value if true : value if false
	//==============================================================================
	
	/**
	* The method takes a double literal.
	* If the literal is 100 then it returns 20.
	* If the literal is not 100 then it returns 30.
	* 
	* @param num_1 Takes an argument as double literal. 
	* @return double
	*/	
	public double conditionalOperator (double num_1) {
		return (num_1 == 100) ? 20 : 30;
	}
}
