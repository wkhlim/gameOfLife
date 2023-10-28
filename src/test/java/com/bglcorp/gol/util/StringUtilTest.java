package com.bglcorp.gol.util;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

import com.bglcorp.gol.data.Coordinate;


public class StringUtilTest {

	@Test
	public void testReadInputParam() {

		String str = "[[1,1]]";
		String str1= "[[5, 5], [6, 5], [7, 5], [5, 6], [6, 6], [7, 6]]";
		
		LinkedList<Coordinate> xyList= StringUtil.readInputParam(str);
		assertEquals(xyList.size(), 1);
		assertEquals(xyList.get(0).getIntX(),1);
		assertEquals(xyList.get(0).getIntY(),1);
		
		xyList= StringUtil.readInputParam(str1);
		assertEquals(xyList.size(), 6);
		assertEquals(xyList.get(0).getIntX(),5);
		assertEquals(xyList.get(0).getIntY(),5);
		assertEquals(xyList.get(1).getIntX(),6);
		assertEquals(xyList.get(1).getIntY(),5);
		assertEquals(xyList.get(2).getIntX(),7);
		assertEquals(xyList.get(2).getIntY(),5);
		assertEquals(xyList.get(3).getIntX(),5);
		assertEquals(xyList.get(3).getIntY(),6);
		assertEquals(xyList.get(4).getIntX(),6);
		assertEquals(xyList.get(4).getIntY(),6);
		assertEquals(xyList.get(5).getIntX(),7);
		assertEquals(xyList.get(5).getIntY(),6);
		

	}
}
