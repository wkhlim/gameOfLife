package com.bglcorp.gol.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameOfLifeAppTest {
	
	private GameOfLifeApp classUnderTest;

	@Before
	public void beforeEachTestMethod() {
		classUnderTest = new GameOfLifeApp();

	}

	@Test
	public void testApp() {
		try {
			classUnderTest.main(new String[] {});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAppWithParam() {
		try {
			classUnderTest.main(new String[] {"[[1,1]]"});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@After
	public void afterEachTestMethod() {

		classUnderTest = null;
	}

}
