package com.bglcorp.gol.data;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bglcorp.gol.config.Constants;

public class MatrixTest {

	@Test
	public void testCreateMatrix() {
		
		String args1 = "[[1, 1]]";
		Matrix board1 = new Matrix(3, 3);
		
		board1.initWithParam(args1);
		board1.run(1);
		board1.printLiveCellCoord(1);
		String result1= board1.printLiveCellCoordStr(1);
		
		assertEquals("[]", result1);
		
		String args2 = "[[5, 5], [6, 5], [7, 5], [5, 6], [6, 6], [7, 6]]";
		Matrix board2 = new Matrix(10, 10);
		board2.initWithParam(args2);
		board2.run(1);
		board2.printLiveCellCoord(1);
		String result2= board2.printLiveCellCoordStr(1);
		
		assertEquals("[[5,5], [5,6], [6,4], [6,7], [7,5], [7,6]]", result2);
		
		
	}
}
