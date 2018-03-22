package com.haqasad.main.variables;
/**
* <h1>Float datatype</h1>
* <p>
* Different use cases for float datatype
*
* @author  Asadul Haque
* @version 1.0
* @since   03/21/2018
*/

public class FloatVar {

	//================================================================
	// "float" data type is 32 bits
	// Default value of "float" data type is 0.0f
	// Value limit: 1.40239846*10e-45 to 3.40282347*10e38
	// "float" is a signed floating-point data type	
	//================================================================
	
	/**
	* This method prints a float value passed as 
	* a parameter.
	* @param iVar parameter takes float value
	* @return float
	*/	
	public float getFloat(float iVar) {
		
		return iVar; 
	}
		
	/**
	* The method prints float values of float data type. 
	* @return void
	*/	
	public void getFloat() {

		/* Minimum float literal*/		
		float minFloat = 1.40239846e-45f;
		
		/* Maximum float literal*/
		float maxFloat = 3.40_282_347e38f;
		
		System.out.println("Minimum double value with no under-score separators: " + minFloat + 
				"\nMaximum double value with under-score separators: " + maxFloat);
	}	

	/**
	* This method is used to print float value in scientific-format
	* @return void
	*/	
	public void getScientificFloat() {
		
		/* The scientific-format equivalent of 123.42 is 1.234e2
		 * 25*10^15 is equivalent 25e15 */
		float floatVal = 1.234e2f;
		System.out.println("Float value written in scientific format: " + floatVal);
	}
	
}
