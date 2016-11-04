package com.assignment07.Test;

import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;
import com.assignment07.Classes.*;

public class AdvancedOperationsTest {
	CalculatorAdvancedOperations adv = new CalculatorAdvancedOperations();
	Random rand = new Random();
	double var1 = 0;
	double var2 = 0;
	double negVar1 = 0;
	double negVar2 = 0;
	double zero = 0;
	
	@Test
	public void powerOfTest() {
		for (int i = 0; i < 50; i++){
			var1 = rand.nextDouble() * 10;
			var2 = rand.nextDouble() * 10;
			negVar1 -= rand.nextDouble() * 10;
			negVar2 -= rand.nextDouble() * 10;
			
			assertEquals((adv.power(var1, var2)), Math.pow(var1, var2), 0);
			assertEquals((adv.power(negVar1, negVar2)), Math.pow(negVar1, negVar2), 0);
			assertEquals((adv.power(zero, zero)), Math.pow(zero, zero), 0);
		}
	}
	@Test
	public void squareRootTest(){
		for (int i = 0; i < 50; i++){
			var1 = rand.nextDouble() * 10;
			negVar1 -= rand.nextDouble() * 10;
			
			assertEquals((adv.squareroot(var1)), Math.sqrt(var1), 0);
			assertEquals((adv.squareroot(negVar1)), Math.sqrt(negVar1), 0);
			assertEquals((adv.squareroot(zero)), Math.sqrt(zero), 0);
		}
	}
	@Test
	public void squaredTest(){
		for (int i = 0; i < 50; i++){
			var1 = rand.nextDouble() * 10;
			negVar1 -= rand.nextDouble() * 10;
			
			assertEquals((adv.squared(var1)), var1 * var1, 0);
			assertEquals((adv.squared(negVar1)), negVar1 * negVar1, 0);
			assertEquals((adv.squared(zero)), zero * zero, 0);
		}
	}
	@Test
	public void cubedTest(){
		for (int i = 0; i < 50; i++){
			var1 = rand.nextDouble() * 10;
			negVar1 -= rand.nextDouble() * 10;
			
			assertEquals((adv.cubed(var1)), var1 * var1 * var1, 0);
			assertEquals((adv.cubed(negVar1)), negVar1 * negVar1 * negVar1, 0);
			assertEquals((adv.cubed(zero)), zero * zero * zero, 0);
		}
	}
	@Test
	public void logTest(){
		for (int i = 0; i < 50; i++){
			var1 = rand.nextDouble() * 10;
			negVar1 -= rand.nextDouble() * 10;
			
			assertEquals((adv.log(var1)), Math.log(var1), 0);
			assertEquals((adv.log(negVar1)), Math.log(negVar1), 0);
			assertEquals((adv.log(zero)), Math.log(zero), 0);
		}
	}
	@Test
	public void absoluteTest(){
		for (int i = 0; i < 50; i++){
			var1 = rand.nextDouble() * 10;
			negVar1 -= rand.nextDouble() * 10;
			
			assertEquals((adv.absolute(var1)), Math.abs(var1), 0);
			assertEquals((adv.absolute(negVar1)), Math.abs(negVar1), 0);
			assertEquals((adv.absolute(zero)), Math.abs(zero), 0);
		}
	}
}
