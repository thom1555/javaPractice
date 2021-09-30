package math;

import java.util.ArrayList;
import java.util.List;

/**
 * Program to find the number with the largest 
 * Collatz sequence up to 100
 * @author ianthompson
 *
 */
public class Collatz {
	
	private static final boolean DEBUG = true;
	private static final int LIMIT = 100;
	
	private static List<Integer> longSequence = new ArrayList<Integer>();
	private static int winningNumber;
	
	private static int calculate(int input) {
		int numSteps = 1;
		
		if (DEBUG) {
			System.out.println(input);
		}
		
		if (input == 1) {
			return numSteps;
		}
		else if (input % 2 == 0) {
			return numSteps + (calculate(input/2));
		}
		else {
			return numSteps + (calculate((3 * input)+ 1));
		}
	}

	public static void main(String[] args) {
		System.out.println(calculate(5));
	}

}
