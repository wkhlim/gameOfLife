package com.bglcorp.gol.data;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GridTest {

	@Test
	public void testCreateGrid() {
		
		Grid grid = new Grid();
		
		assertEquals(false, grid.isState());
		assertEquals(false, grid.isNextState());
		
		grid.setNextState(true);
		grid.updateState();
		
		assertEquals(true, grid.isState());
		assertEquals(true, grid.isNextState());
		
	}
}
