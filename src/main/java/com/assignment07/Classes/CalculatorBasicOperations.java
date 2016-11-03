package com.assignment07.Classes;

import com.assignment07.Interfaces.CalculatorBasicOperationsInterface;

public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface{
	public double add(double var1, double var2) {
		return var1 + var2;
	}
	public double subtract(double var1, double var2) {
		return var1 - var2;
	}
	public double multiply(double var1, double var2) {
		return var1 * var2;
	}
	public double divide(double var1, double var2) {
			return var1 / var2;
	}
}
