package com.bglcorp.gol.data;

import java.util.Arrays;
import java.util.LinkedList;

import com.bglcorp.gol.util.StringUtil;

public class Matrix {

	private Grid[][] grids;
	private int height = 10;
	private int width = 10;

	public Matrix(int height, int width) {
		this.height = height;
		this.width = width;
		
		grids = new Grid[height][width];

	}

	public Matrix(Grid[][] grids) {

		this.grids = grids;
		this.height = grids.length;
		this.width = grids.length;

		
	}

	public Grid[][] getGrid() {
		return grids;
	}

	public int getSize() {
		return width;
	}

	public boolean isAlive(int row, int col) {
		return grids[row][col].isState();
	}

	private boolean getNextStateForGrid(int row, int col) {

		// System.out.println("getNextStateForGrid() -> [" + row + "," + col + "]");
		int aliveNeighbors = this.calculateLivingNeighbors(row, col);

		// System.out.println("isAlive(" + row + "," + col + "):" + isAlive(row, col));
		// System.out.println("getNextStateForGrid() -> [" + row + "," + col + "] :
		// aliveNeighbors " + aliveNeighbors);
		/*
		 * 1.Any live cell with fewer than two live neighbours dies in the next
		 * generation as if caused by underpopulation.
		 */
		if (isAlive(row, col) && aliveNeighbors < 2) {
			return false;
		}

		/*
		 * 2.Any live cell with two or three live neighbours lives on to the next
		 * generation.
		 */
		else if (isAlive(row, col) && (aliveNeighbors == 2 || aliveNeighbors == 3)) {
			return true;
		}

		/*
		 * 3.Any live cell with more than three live neighbours dies in the next
		 * generation, as if by overpopulation.
		 */
		else if (isAlive(row, col) && aliveNeighbors > 3) {
			return false;
		}

		/**
		 * 4.Any dead cell with exactly three live neighbours becomes a live cell in the
		 * next generation, as if by reproduction.
		 */
		else if (!isAlive(row, col) && aliveNeighbors == 3) {
			return true;
		}

		// else remain the same
		else
			return isAlive(row, col);

	}

	public void run(int i) {

		//init();
		//initWithParam(paramArgs);
		//print2DGrid();
		
		getNextState();
		updateState();
		//print2DGrid();
		//printLiveCellCoord(i);

	}

	private void updateState() {
		for (int h = 0; h < grids.length; h++) {
			for (int w = 0; w < grids[h].length; w++) {
				grids[h][w].updateState();
			}
		}
	}

	private void getNextState() {
		for (int h = 0; h < grids.length; h++) {
			for (int w = 0; w < grids[h].length; w++) {
				grids[h][w].setNextState(getNextStateForGrid(h, w));
			}
		}
	}

	public void print2DGrid() {
		for (Grid[] row : grids)
			System.out.println(Arrays.deepToString(row));

	}

	private int calculateLivingNeighbors(int row, int col) {
		int liveCount = 0;

		for (int x = -1; x <= 1; x++) {
			for (int y = -1; y <= 1; y++) {
				// check for boundary conditions
				if (row + x < 0 || row + x > (height - 1) || y + col < 0 || y + col > (width - 1)) {
					continue;
				}

				if (isAlive(row + x, col + y))
					liveCount++;

			}
		}

		if (isAlive(row, col))
			liveCount -= 1;

		return liveCount;
	}

	public void printLiveCellCoord(int i) {

		LinkedList<String> queue = new LinkedList<>();

		for (int h = 0; h < grids.length; h++) {
			for (int w = 0; w < grids[h].length; w++) {

				if (isAlive(h, w)) 
					queue.add("[" + h + "," + w + "]");
				
			}
		}
	
		System.out.println(i+":"+Arrays.toString(queue.toArray()));

	}
	
	public String printLiveCellCoordStr(int i) {

		LinkedList<String> queue = new LinkedList<>();

		for (int h = 0; h < grids.length; h++) {
			for (int w = 0; w < grids[h].length; w++) {

				if (isAlive(h, w)) 
					queue.add("[" + h + "," + w + "]");
				
			}
		}
	
		return Arrays.toString(queue.toArray());

	}
	
	public void init() {
		
		for (int h = 0; h < grids.length; h++) {
			for (int w = 0; w < grids[h].length; w++) {
				grids[h][w] = new Grid();
				if (Math.random() <= 0.3) {

					grids[h][w].setNextState(true);
					grids[h][w].updateState();

				}
			}
		}
	}
	
	public void initWithParam(String paramArgs) {
			
		LinkedList<Coordinate> coordXY = StringUtil.readInputParam(paramArgs);
		//System.out.println(Arrays.toString(coordXY.toArray()));
	
		for (int h = 0; h < grids.length; h++) {
			for (int w = 0; w < grids[h].length; w++) {
				grids[h][w] = new Grid();
				
				for(Coordinate xy : coordXY)
				{
					if(h==xy.getIntX() && w==xy.getIntY()) {
						
						grids[h][w].setNextState(true);
						grids[h][w].updateState();
					}
						
				}
				
				
			}
		}
	}


}
