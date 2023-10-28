package com.bglcorp.gol.config;

public enum Constants {

	 /*MATRIX_WIDTH(200),
     MATRIX_HEIGHT(200),
     ITERATIONS(100),*/
     MATRIX_WIDTH(10),
     MATRIX_HEIGHT(10),
     ITERATIONS(5),
     SLEEP_MILLISEC(300);

     private final int value;

     Constants(final int newValue) {
         value = newValue;
     }

     public int getValue() { return value; }
}
