package com.haqasad.main.variables;
/**
* <h1>Short datatype</h1>
* <p>
* Different use cases for short datatype
*
* @author  Asadul Haque
* @version 1.0
* @since   03/21/2018
*/

public class ShortVar {

	//================================================================
	// "short" data type is 16 bits
	// Default value of "short" data type is 0
	// "short" type takes values between -32,768 to 32,767
	// "short" is a signed data type
	//================================================================
	
	/**
	* This method prints a short value passed as 
	* a parameter.
	* @param iVar parameter takes short value
	* @return short
	*/	
	public short getShort(short iVar) {
		
		return iVar; 
	}
		
	/**
	* The method prints maximum short value of short data type. 
	* Methods do not take short argument directly. 
	* To provide a short type argument it has to type-casted as short
	* @return void
	*/	
	public void maxShort() {
		
		short shortVal = 32767;
		
		System.out.println("Maximum value short data type can store: " + shortVal);
	}	
	
}
