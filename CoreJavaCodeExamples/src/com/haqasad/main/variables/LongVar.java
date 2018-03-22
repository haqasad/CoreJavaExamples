package com.haqasad.main.variables;
/**
* <h1>Long datatype</h1>
* <p>
* Different use cases for long datatype
*
* @author  Asadul Haque
* @version 1.0
* @since   03/21/2018
*/

public class LongVar {

	//================================================================
	// "long" data type is 64 bits
	// Default value of "long" data type is 0L
	// Value limit: -9223372036854775808 to 9223372036854775807
	// "long" is a signed data type	
	//================================================================
	
	/**
	* This method prints a long value passed as 
	* a parameter.
	* @param iVar parameter takes long value
	* @return long
	*/	
	public long getLong(long iVar) {
		
		return iVar; 
	}
		
	/**
	* The method prints long values of long data type. 
	* @return void
	*/	
	public void getLong() {
		
		long longVal_1 = 9223372036854775807L;
		
		/* Float literals can be separated with under-scores to make  
		 * them more readable.
		 * 
		 * Irrespective of the under-scores the print value does not
		 * show them in console.*/
		long longVal_2 = 9_223_372_036_854_775_807L;
		
		System.out.println("Long value with no under-score separators: " + longVal_1 + 
				"\nLong value with under-score separators: " + longVal_2);
	}	
	
}
