package com.assignment07.Classes;
import com.assignment07.Interfaces.CalculatorAdvancedOperationsInterface;

/**
 * 	@author Christian Ström, Daniel Eriksson
 *	Methods for advanced operations
 */
public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface{
	/**
	 * Method for power of
	 * @param var1, var2
	 * @return Math.pow(var1, var2)
	 */
	public double power(double var1, double var2) {
		return Math.pow(var1, var2);
	}
	/**
	 * Method for squareroot
	 * @param var1
	 * @return Math.sqrt(var1)
	 */
	public double squareroot(double var1) {
		return Math.sqrt(var1);
	}
	/**
	 * Method for squared
	 * @param var1
	 * @return return var1 * var1
	 */
	public double squared(double var1) {
		return var1 * var1;
	}
	/**
	 * Method for cubed
	 * @param var1
	 * @return return var1 * var1 * var1
	 */
	public double cubed(double var1) {
		return var1 * var1 * var1;
	}
	/**
	 * Method for log
	 * @param var1
	 * @return return Math.log(var1)
	 */
	public double log(double var1) {
		return Math.log(var1);
	}
	/**
	 * Method for absolute numbers
	 * @param var1
	 * @return Math.abs(var1)
	 */
	public double absolute(double var1) {
		return Math.abs(var1);
	}
}
