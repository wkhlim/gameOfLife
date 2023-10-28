package com.bglcorp.gol.data;

public class Grid {

	private boolean state = false;
	private boolean nextState;

	public Grid() {
		this.state=false;
		this.nextState=false;
	}

	public Grid(boolean state) {
		this.state = state;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public boolean isNextState() {
		return nextState;
	}

	public void setNextState(boolean nextState) {
		this.nextState = nextState;
	}

	public void updateState() {
		state = nextState;
	}

	@Override
	public String toString() {
		
		int val = (state) ? 1 : 0;
		return " "+val+ " ";
	}
	
	

}
