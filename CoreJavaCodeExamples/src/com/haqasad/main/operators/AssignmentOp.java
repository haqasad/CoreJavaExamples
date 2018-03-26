package com.haqasad.main.operators;
/**
* <h1>Assignment Operators</h1>
* <p>
* Different use cases for assignment operator.
* The usage of this operator is shown in eleven methods. 
*
* @author  Asadul Haque
* @version 1.0
* @since   03/22/2018
*/

public class AssignmentOp {

	/**
	* The method adds two int literals and returns an
	* int literal as summation. The expression uses 
	* assignment operators.
	* 
	* @param None
	* @return int
	*/	
	public int simpleAssignment() {
		int num_1 = 0;
		int num_2 = 5;
		int num_3 = 5;
		
		num_1 = num_2 + num_3;
		return num_1;
	}

	/**
	* The method uses add AND assignment operator.
	* It adds right operand (num_1) to the left operand  
	* (num_2) and assign the result to left operand (num_1).
	* The summation result is returned as double.
	* 
	* @param num_1 Takes an argument as double literal.
	* @param num_2 Takes an argument as double literal.
	* @return double
	*/	
	public double addAndAssignment(double num_1, double num_2) {
		return num_1 += num_2;
	}

	/**
	* The method uses subtract AND assignment operator.
	* It subtracts right operand (num_1) to the left operand  
	* (num_2) and assign the result to left operand (num_1).
	* The subtraction result is returned as double.
	* 
	* @param num_1 Takes an argument as double literal.
	* @param num_2 Takes an argument as double literal.
	* @return double
	*/	
	public double subAndAssignment(double num_1, double num_2) {
		return num_1 -= num_2;
	}

	/**
	* The method uses multiply AND assignment operator.
	* It multiplies right operand (num_1) to the left operand  
	* (num_2) and assign the result to left operand (num_1).
	* The multiplication result is returned as double.
	* 
	* @param num_1 Takes an argument as double literal.
	* @param num_2 Takes an argument as double literal.
	* @return double
	*/	
	public double multAndAssignment(double num_1, double num_2) {
		return num_1 *= num_2;
	}

	/**
	* The method uses divide AND assignment operator.
	* It divides right operand (num_1) by the left operand  
	* (num_2) and assign the result to left operand (num_1).
	* The division result is returned as double.
	* 
	* @param num_1 Takes an argument as double literal.
	* @param num_2 Takes an argument as double literal.
	* @return double
	*/	
	public double divAndAssignment(double num_1, double num_2) {
		return num_1 /= num_2;
	}
	
	/**
	* The method uses modulus AND assignment operator.
	* It divides right operand (num_1) by the left operand  
	* (num_2) and assign the result to left operand (num_1).
	* The reminder is returned as double.
	* 
	* @param num_1 Takes an argument as double literal.
	* @param num_2 Takes an argument as double literal.
	* @return double
	*/	
	public double modAndAssignment(double num_1, double num_2) {
		return num_1 %= num_2;
	}

	/**
	* The method returns a left-shifted binary int literal 
	* 
	* @param None
	* @return int
	*/	
	public int leftShiftAndAssignment() {
		/* 0011 1100 = 60
		 * 0011 1100 << 2 = 1111 0000 = 240 */		
		int binVal_1 = 0b0011_1100;
		return binVal_1 <<= 2;
	}
	
	/**
	* The method returns a right-shifted binary int literal 
	* 
	* @param None
	* @return int
	*/	
	public int rightShiftAndAssignment() {
		/* 0011 1100 = 60
		 * 0011 1100 >> 2 = 0000 1111 = 15 */		
		int binVal_1 = 0b0011_1100;
		return binVal_1 >>= 2;		
	}
	
	/**
	* The method returns a bitwise-AND-operated binary int literal 
	* 
	* @param None
	* @return int
	*/	
	public int bitwiseAndAssignment() {
		/* 0011 1100 = 60
		 * 0000 1100 = 12
		 * ==============
		 * 0000 1100 = 12 */		
		int binVal_1 = 0b0011_1100;
		return binVal_1 &= 12;		
	}

	/**
	* The method returns a bitwise-exclusive-OR-operated binary int literal 
	* 
	* @param None
	* @return int
	*/	
	public int bitwiseExclusiveOrAssignment() {
		/* 0011 1100 = 60
		 * 0000 1100 = 12
		 * ==============
		 * 0011 0000 = 48 */		
		int binVal_1 = 0b0011_1100;
		return binVal_1 ^= 12;		
	}
	
	/**
	* The method returns a bitwise-inclusive-OR-operated binary int literal 
	* 
	* @param None
	* @return int
	*/	
	public int bitwiseInclusiveOrAssignment() {
		/* 0011 1100 = 60
		 * 0000 1100 = 12
		 * ==============
		 * 0011 1100 = 60 */		
		int binVal_1 = 0b0011_1100;
		return binVal_1 |= 12;		
	}

}
