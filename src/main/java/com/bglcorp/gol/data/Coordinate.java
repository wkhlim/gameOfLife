package com.bglcorp.gol.data;

public class Coordinate {

	private double x;
	private double y;
	
	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}
		
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public int getIntX() {
		return new Double(x).intValue();
	}
	public int getIntY() {
		return new Double(y).intValue();
	}
	
	@Override
	public String toString() {
		return "x: "+new Double(x).intValue()+ ", y:"+new Double(y).intValue();
	}
	

}
