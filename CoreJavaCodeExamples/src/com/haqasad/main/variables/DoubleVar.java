package com.haqasad.main.variables;
/**
* <h1>Double datatype</h1>
* <p>
* Different use cases for double datatype
*
* @author  Asadul Haque
* @version 1.0
* @since   03/21/2018
*/

public class DoubleVar {

	//================================================================
	// "double" data type is 64 bits
	// Default value of "double" data type is 0.0d
	// Value limit: 4.940656458412465*10e-324 to 1.7976931348623157*10e308
	// "double" is a signed floating-point data type	
	//================================================================
	
	/**
	* This method prints a double value passed as 
	* a parameter.
	* @param iVar parameter takes double value
	* @return double
	*/	
	public double getDouble(double iVar) {
		
		return iVar; 
	}
		
	/**
	* The method prints a double value of double data type. 
	* @return void
	*/	
	public void getDouble() {
		
		/* Minimum double literal*/
		double minDouble = 4.940656458412465e-324d;
		
		/* Maximum double literal*/
		double maxDouble = 1.7_976_931_348_623_157e307d;
		
		System.out.println("Minimum double value with no under-score separators: " + minDouble + 
				"\nMaximum double value with under-score separators: " + maxDouble);
		
	}	

	/**
	* This method is used to print double value in scientific format
	* @return void
	*/	
	public void getScientificDouble() {
		
		/* The scientific-format equivalent of 123.42 is 1.234e2*/
		double doubVal = 1.234e2d;
		System.out.println("Double value written in scientific format: " + doubVal);
	}
	
}
