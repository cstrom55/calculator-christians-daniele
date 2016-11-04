package com.assignment07.Classes;
import com.assignment07.Interfaces.CalculatorBasicOperationsInterface;

/**
 *	@author Christian Ström, Daniel Eriksson
 *	Methods for basic operations
 */
public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface{
	/**
	 * Method for add
	 * @param var1, var2
	 * @return return var1 + var2
	 */
	public double add(double var1, double var2) {
		return var1 + var2;
	}
	/**
	 * Method for subtraction
	 * @param var1, var2
	 * @return return var1 - var2
	 */
	public double subtract(double var1, double var2) {
		return var1 - var2;
	}
	/**
	 * Method for multiplication
	 * @param var1, var2
	 * @return return var1 * var2
	 */
	public double multiply(double var1, double var2) {
		return var1 * var2;
	}
	/**
	 * Method for division
	 * @param var1, var2
	 * @return return var1 / var2
	 */
	public double divide(double var1, double var2) {
			return var1 / var2;
	}
}
