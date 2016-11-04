package com.assignment07.Test;

import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;
import com.assignment07.Classes.*;

public class BasicOperationsTest {
	CalculatorBasicOperations bas = new CalculatorBasicOperations();
	Random rand = new Random();
	double var1 = 0;
	double var2 = 0;
	double negVar1 = 0;
	double negVar2 = 0;
	double zero = 0;
	
	@Test
	public void addTest() {
		for (int i = 0; i < 50; i++){
			var1 = rand.nextDouble() * 10;
			var2 = rand.nextDouble() * 10;
			negVar1 -= rand.nextDouble() * 10;
			negVar2 -= rand.nextDouble() * 10;
			
			assertEquals((bas.add(var1, var2)), var1 + var2, 0);
			assertEquals((bas.add(negVar1, negVar2)), negVar1 + negVar2, 0);
			assertEquals((bas.add(zero, zero)), zero + zero, 0);
		}
	}
	@Test
	public void subtractTest() {
		for (int i = 0; i < 50; i++){
			var1 = rand.nextDouble() * 10;
			var2 = rand.nextDouble() * 10;
			negVar1 -= rand.nextDouble() * 10;
			negVar2 -= rand.nextDouble() * 10;
			
			assertEquals((bas.subtract(var1, var2)), var1 - var2, 0);
			assertEquals((bas.subtract(negVar1, negVar2)), negVar1 - negVar2, 0);
			assertEquals((bas.subtract(zero, zero)), zero - zero, 0);
		}
	}
	@Test
	public void multiplyTest() {
		for (int i = 0; i < 50; i++){
			var1 = rand.nextDouble() * 10;
			var2 = rand.nextDouble() * 10;
			negVar1 -= rand.nextDouble() * 10;
			negVar2 -= rand.nextDouble() * 10;
			
			assertEquals((bas.multiply(var1, var2)), var1 * var2, 0);
			assertEquals((bas.multiply(negVar1, negVar2)), negVar1 * negVar2, 0);
			assertEquals((bas.multiply(zero, zero)), zero * zero, 0);
		}
	}
	@Test
	public void divideTest() {
		for (int i = 0; i < 50; i++){
			var1 = rand.nextDouble() * 10;
			var2 = rand.nextDouble() * 10;
			negVar1 -= rand.nextDouble() * 10;
			negVar2 -= rand.nextDouble() * 10;
			
			assertEquals((bas.divide(var1, var2)), var1 / var2, 0);
			assertEquals((bas.divide(negVar1, negVar2)), negVar1 / negVar2, 0);
			assertEquals((bas.divide(zero, zero)), zero / zero, 0);
		}
	}
}
