package com.haqasad.main.operators;
/**
* <h1>Bitwise Operators</h1>
* <p>
* Different use cases for bitwise operators.
* The usage of uninary operators are shown in seven methods 
*
* @author  Asadul Haque
* @version 1.0
* @since   03/22/2018
*/

public class BitwiseOp {
	
	//==============================================================================
	// 					BITWISE LOGICAL OPERATIONS	
	//==============================================================================
	// AND: 0 & 1 = 0; 1 & 0 = 0; 0 & 0 = 0; 1 & 1 = 1
	// OR:  0 & 1 = 1; 1 & 0 = 1; 0 & 0 = 0; 1 & 1 = 1
	// XOR: 0 & 1 = 1; 1 & 0 = 1; 0 & 0 = 0; 1 & 1 = 0	
	// NOT: ~0 = 1; ~1 = 0
	//==============================================================================
	// Bitwise right shift operator shifts the binary number from left to right. The
	// shifted places are replaced by the value by the left digit.
	//==============================================================================
	// Bitwise zero fill operator shifts the binary number from left to right and 
	// fills them with zero.
	//==============================================================================

	/**
	* The method returns bitwise AND operation between two 
	* binary integers.
	* 
	* @param None
	* @return int
	*/	
	public int bitwiseAnd() {
		/* 0011 1100 = 60
		 * 0000 1100 = 12
		 * ==============
		 * 0000 1100 = 12 */
		int binVal_1 = 0b0011_1100;
		int binVal_2 = 0b0000_1100;
		
		return binVal_1 & binVal_2;
	}
	
	/**
	* The method returns bitwise OR operation between two 
	* binary integers.
	* 
	* @param None
	* @return int
	*/	
	public int bitwiseOr() {
		/* 0011 1100 = 60
		 * 0000 1100 = 12
		 * ==============
		 * 0011 1100 = 60 */		
		int binVal_1 = 0b0011_1100;
		int binVal_2 = 0b0000_1100;
		
		return binVal_1 | binVal_2;
	}
	
	/**
	* The method returns bitwise XOR operation between two 
	* binary integers.
	* 
	* @param None
	* @return int
	*/	
	public int bitwiseXor() {
		/* 0011 1100 = 60
		 * 0000 1100 = 12
		 * ==============
		 * 0011 0000 = 48 */		
		int binVal_1 = 0b0011_1100;
		int binVal_2 = 0b0000_1100;
		
		return binVal_1 ^ binVal_2;
	}	
	
	/**
	* The method returns compliment of a binary integer
	* 
	* @param None
	* @return int
	*/	
	public int bitwiseCompliment() {
		/* 0011 1100 = 60
		 * ~0011 1100 = -61 */		
		int binVal_1 = 0b0011_1100;
		
		return ~binVal_1;
	}	

	/**
	* The method returns binary literal after left shift operation
	* 
	* @param None
	* @return int
	*/	
	public int bitwiseLeftShift() {
		/* 0011 1100 = 60
		 * 0011 1100 << 2 = 1111 0000 = 240 */		
		int binVal_1 = 0b0011_1100;
		
		return binVal_1 << 2;
	}

	/**
	* The method returns binary literal after right shift operation
	* 
	* @param None
	* @return int
	*/		
	public int bitwiseRightShift() {
		/* 0011 1100 = 60
		 * 0011 1100 >> 2 = 0000 1111 = 15 */		
		int binVal_1 = 0b0011_1100;
		
		return binVal_1 >> 2;
	}	

	/**
	* The method returns binary literal after zero fill operation
	* 
	* @param None
	* @return int
	*/	
	public int bitwiseZeroFill() {
		/* 0011 1100 = 60
		 * 0011 1100 >>> 3 = 0000 0001 = 1 */		
		int binVal_1 = 0b0000_1111;
		
		return binVal_1 >>> 3;
	}	
}
