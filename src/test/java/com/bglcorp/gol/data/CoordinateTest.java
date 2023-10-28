package com.bglcorp.gol.data;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoordinateTest {
	
	@Test
	public void testCreateCoordinate() {
		
		double x=0;
		double y=0;
		
		Coordinate xy = new Coordinate(x,y);
		
		assertEquals("X", xy.getX(), x, 0);
		assertEquals("Y", xy.getY(), y, 0);
		assertEquals(xy.getIntX(), new Double(x).intValue());
		assertEquals(xy.getIntY(), new Double(y).intValue());
		
	}

}
