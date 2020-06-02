package com.algorithms;

/**
 * input = 5 
 * output = 120
 * hint: { 5 * 4 * 3 * 2 * 1 = 120 }
 */
public class FactorialNumber  {

	public static void main(String[] args) {
		
		final int INPUT_NUMBER = 7;
		
		int factorialByRecursive = FactorialNumber.factorialByRecursive(INPUT_NUMBER);
		System.out.println("Factorial of "+ INPUT_NUMBER +"! = "+ factorialByRecursive);

		int factorialByLoop = FactorialNumber.factorialByLoop(INPUT_NUMBER);		
		System.out.println("Factorial of "+ INPUT_NUMBER +"! = "+ factorialByLoop);
	}

	public static int factorialByRecursive(int input) {
		if (input > 1) {
			return input * factorialByRecursive(input - 1);
		}
		return 1;
	}
	
	public static int factorialByLoop(int input) {
		int output = 0;
		while (input > 1) {
			output = (output == 0) ? input * (input - 1) : output * (input - 1);
			input--;
		}
		return output;
	}
	
}
