package com.assignment07.Test;

import org.junit.Test;
import com.assignment07.Main.*;

public class MainTest {

	@Test
	public void mainTest() {
		for(int i = 0; i < 50; i++){
			Main main = new Main();
			main.main(null);
		}
	}
}
