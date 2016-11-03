package com.assignment07.Classes;

import com.assignment07.Interfaces.CalculatorAdvancedOperationsInterface;

public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface{
	public double power(double var1, double var2) {
		return Math.pow(var1, var2);
	}
	public double squareroot(double var1) {
		return Math.sqrt(var1);
	}
	public double squared(double var1) {
		return var1 * var1;
	}
	public double cubed(double var1) {
		return var1 * var1 * var1;
	}
	public double log(double var1) {
		return Math.log(var1);
	}
	public double absolute(double var1) {
		return Math.abs(var1);
	}
}
