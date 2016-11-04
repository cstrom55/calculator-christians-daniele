package com.assignment07.Test;

import static org.junit.Assert.*;


import java.util.Random;

import org.junit.Test;

import com.assignment07.Classes.ViewClass;

public class ViewClassTest {

	ViewClass VC = new ViewClass();
	Random rng = new Random();
	double firstRandomNumber = 0.0; //firstRandomNumber
	double secondRandomNumber = 0.0; //secondRandomNumber
	double negativeFirstRandomNumber = 0.0; //negativeFirstRandomNumber
	double negativeSecondRandomNumber = 0.0; //negativeSecondRandomNumber
	double zero = 0.0;
	
	//getters and setters test start
	@Test
	public void gettersAndSettersTest() {
		for(int i = 0; i<50; i++){
			firstRandomNumber = rng.nextDouble() * 10;
			secondRandomNumber = rng.nextDouble() * 10;
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			negativeSecondRandomNumber=-rng.nextDouble() * 10;
			
			VC.setInput1(firstRandomNumber);
			VC.setInput2(secondRandomNumber);
			
			assertEquals(VC.getInput1(), firstRandomNumber, 0);
			assertEquals(VC.getInput2(), secondRandomNumber, 0);
						
			VC.setInput1(negativeFirstRandomNumber);
			VC.setInput2(negativeSecondRandomNumber);
			
			assertEquals(VC.getInput1(), negativeFirstRandomNumber, 0);
			assertEquals(VC.getInput2(), negativeSecondRandomNumber, 0);
			
			VC.setInput1(zero);
			VC.setInput2(zero);
			
			assertEquals(VC.getInput1(), zero, 0);
			assertEquals(VC.getInput2(), zero, 0);
			
		}
	}
	//getters and setters test ends
	//actionsPerformed test starts
	@Test
	public void actionPerformedTest() {
		VC.setVisible(false);
		for(int i = 0; i<50; i++){ //todo
			String firstRandomNumber = String.valueOf(rng.nextDouble() * 10);
			String secondRandomNumber = String.valueOf(rng.nextDouble() * 10);
			
			
			
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			negativeSecondRandomNumber=-rng.nextDouble() * 10;
			
			
			
			VC.input1Window.setText(firstRandomNumber);
			VC.input2Window.setText(secondRandomNumber);
			
			VC.additionButton.doClick();
			VC.subtractionButton.doClick();
			VC.multiplicationButton.doClick();
			VC.divisionButton.doClick();
			VC.powButton.doClick();
			VC.sqrtButton.doClick();
			VC.squareButton.doClick();
			VC.cubeButton.doClick();
			VC.logButton.doClick();
			VC.absoluteButton.doClick();
			VC.cubeButton.doClick();
			VC.clearButton.doClick();
			VC.exitButton.doClick();
			
			VC.input1Window.setText("as");
			VC.input2Window.setText("as");
			VC.cubeButton.doClick();

	
		}
		
	}
}
