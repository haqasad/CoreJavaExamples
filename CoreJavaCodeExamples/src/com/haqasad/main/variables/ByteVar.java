package com.haqasad.main.variables;
/**
* <h1>Byte datatype</h1>
* <p>
* Different use cases for byte datatype
*
* @author  Asadul Haque
* @version 1.0
* @since   03/21/2018
*/

public class ByteVar {

	//================================================================
	// "byte" data type is 8 bits
	// Default value of "byte" data type is 0
	// "byte" type takes values between -128 to 127
	// "byte" is a signed data type
	//================================================================
	
	/**
	* This method prints a byte value passed as a parameter.
	* @param iVar parameter takes byte value
	* @return byte
	*/	
	public byte getByte(byte iVar) {
		
		return iVar; 
	}
		
	/**
	* The method prints maximum byte value of byte data type. 
	* Methods do not take byte argument directly. 
	* To provide a byte type argument it has to type-casted as byte
	* @return void
	*/	
	public void maxByte() {
		
		byte byteVal = 127;
		
		System.out.println("Maximum value byte data type can store: " + byteVal);
	}	
	
}
