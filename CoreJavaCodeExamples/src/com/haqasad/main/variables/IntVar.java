package com.haqasad.main.variables;
/**
* <h1>Interger datatype</h1>
* <p>
* Different use cases for integer datatype
*
* @author  Asadul Haque
* @version 1.0
* @since   03/21/2018
*/

public class IntVar {

	//================================================================
	// "int" data type is 32 bits
	// Default value of "int" data type is 0
	// Value limit: -2147483648 to 2147483647
	// "int" is a signed data type
	//================================================================
	
	/**
	* The method prints max integer value of int data type. 
	* This is a the simplest form of a class method, just to
	* print integer.
	* @return int
	*/	
	public int maxInt() {
		
		/* This is the maximum value an "int" data type can hold*/
		int maxVar = 2147483647;
		return maxVar; 
	}
	
	/**
	* The method prints max integer value of int data type. 
	* This is a the simplest form of a class method, just to
	* print integer.
	* @return void
	*/	
	public void getInt() {
		
		/* Literal: Any constant value which can be assigned to the 
		 * variable is called as literal. It is also commonly reffered 
		 * to a constant.
		 * 
		 * Integer literals can be separated with under-scores to make  
		 * them more readable.
		 * 
		 * Irrespective of the under-scores the print value does not
		 * show them in console.*/
		int decVal_1 = 2_101_969;
		int decVal_2 = 1__192;
		
		int hexVal = 0x7_b_1;
		int binVal = 0b0111_1011_0001;
		
		System.out.println("Decimal literal (single under-score): " + decVal_1 + 
				"\nDecimal literal (double under-score): " + decVal_2 + "\nHexadecimal literal: " +
				hexVal + "\nBinary literal: " + binVal);
	}	
	
	/**
	* This method is used to print integers. This is
	* a the simplest form of a class method, just to
	* print integer.
	* @param iVar parameter takes an interger value that will be printed when
	* the method is called.
	* @return int
	*/	
	public int getInt(int iVar) {
		
		return iVar; 
	}

}