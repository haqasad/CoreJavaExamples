package com.haqasad.main.operators;
/**
* <h1>Arithmatic Operators</h1>
* <p>
* Different use cases for arithmatic operators 
*
* @author  Asadul Haque
* @version 1.0
* @since   03/22/2018
*/

public class ArithmaticOp {
	
	/**
	* The method adds two numbers and returns the summation
	* @param num_1 Takes the first argument as double literal
	* @param num_2 Takes the second argument as double literal
	* @return double
	*/	
	public double addNum(double num_1, double num_2) {
		return (num_1 + num_2);
	}

	/**
	* The method subtracts two numbers and returns the subtraction
	* @param num_1 Takes the first argument as double literal
	* @param num_2 Takes the second argument as double literal
	* @return double
	*/	
	public double subNum(double num_1, double num_2) {
		return (num_1 - num_2);
	}	

	/**
	* The method multiplies two numbers and returns the myltiplication
	* @param num_1 Takes the first argument as double literal
	* @param num_2 Takes the second argument as double literal
	* @return double
	*/	
	public double mulNum(double num_1, double num_2) {
		return (num_1 * num_2);
	}
	
	/**
	* The method divides two numbers and returns the division
	* @param num_1 Takes the first argument as double literal
	* @param num_2 Takes the second argument as double literal
	* @return double
	*/	
	public double divNum(double num_1, double num_2) {
		if (num_2 == 0) {
			System.out.println("Dividant can't be zero, "
					+ "please enter another value other than zero");
			return 0.0d;
		} else {
			return (num_1 / num_2);
		}		
	}
	
	/**
	* The method adds two numbers and returns the summation
	* @param num_1 Takes the first argument as double literal
	* @param num_2 Takes the second argument as double literal
	* @return double
	*/	
	public double modNum(double num_1, double num_2) {
		if (num_2 == 0) {
			System.out.println("Dividant can't be zero, "
					+ "please enter another value other than zero");
			return 0.0d;
		} else {
			return (num_1 % num_2);
		}
	}	
}
