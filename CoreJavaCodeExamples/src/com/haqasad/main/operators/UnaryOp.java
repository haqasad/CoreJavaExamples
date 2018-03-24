package com.haqasad.main.operators;
/**
* <h1>Unary Operators</h1>
* <p>
* Different use cases for unary operators.
* The usage of uninary operators are shown in four methods 
*
* @author  Asadul Haque
* @version 1.0
* @since   03/22/2018
*/

public class UnaryOp {

	/**
	* The method takes a double literal and returns an incremented
	* double value.
	* 
	* @param iVal Takes a double literal
	* @return double
	*/		
	public double incrementVal (double iVal) {		
		return iVal = +1;
	}

	/**
	* The method takes an int literal and returns an incremented
	* int value.
	* 
	* @param iVal Takes an int literal
	* @return int
	*/	
	public int incrementVal (int iVal) {
		return iVal++;
	}
	
	/**
	* The method takes a double literal and returns an decremented
	* int value.
	* 
	* @param iVal Takes a double literal
	* @return double
	*/	
	public double decrementVal (double iVal) {		
		return iVal = -1;
	}
	
	/**
	* The method takes an int literal and returns an decremented
	* int value.
	* 
	* @param iVal Takes an int literal
	* @return int
	*/	
	public int decrementVal (int iVal) {
		return iVal--;
	}

	//==============================================================================
	// Difference between "iVal++" and "++iVal"?	
	//==============================================================================
	// No difference in final output, both of them increments variable values
	// There is sublte difference when they are assigned to another variable
	//
	// iVal++ first assigns the value to the assigned variable and then increments
	// the value
	//
	// ++iVal first increments the value and then assigns the value to the assigned
	// variable
	//=============================================================================
	
	/**
	* The method shows pre-increment unary operator
	* 
	* @param None
	* @return void
	*/	
	public void preIncrement() {
		int iVal = 0;
		int jVal = ++iVal;
		System.out.println("Pre-Increment unary operator" + "\nValue of iVal: " + iVal + 
				"\nValue of jVal: " + jVal); 
	}
	
	/**
	* The method shows post-increment unary operator
	* 
	* @param None
	* @return void
	*/	
	public void postIncrement() {
		int iVal = 0;
		int jVal = iVal++;
		System.out.println("Pre-Increment unary operator" + "\nValue of iVal: " + iVal + 
				"\nValue of jVal: " + jVal); 
	}
	
}
