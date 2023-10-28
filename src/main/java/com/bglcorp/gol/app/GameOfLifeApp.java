package com.bglcorp.gol.app;

import com.bglcorp.gol.config.Constants;
import com.bglcorp.gol.data.Matrix;

public class GameOfLifeApp {

	public static void main(String[] args) throws Exception {

		int iterations = Constants.ITERATIONS.getValue();

		int height = Constants.MATRIX_HEIGHT.getValue();

		int width = Constants.MATRIX_WIDTH.getValue();

		int sleep = Constants.SLEEP_MILLISEC.getValue();

		Matrix board = new Matrix(height, width);
		//System.out.println(args.length);
		if(args.length == 0)
			board.init();
		else if(args.length == 1)
			board.initWithParam(args[0]);
		else if (args.length != 1) {
			System.err.println("Invalid number of input parameter :"+args.length);
			System.exit(0);
		}

		//System.out.println("Initial Generation");
		//board.print2DGrid();

		for (int i = 0; i < iterations; i++) {

			board.run((i + 1));
			// System.out.println("Next Generation : "+(i+1));
			//board.print2DGrid();
			board.printLiveCellCoord((i + 1));
			Thread.sleep(sleep);

		}

	}

}
