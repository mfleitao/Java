package com.algorithms;

import java.util.Arrays;

public class SmallestPositive {

	public static int get(int[] input) {
		Arrays.sort(input);
		int output = 1;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == output) 
				output++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] A = { 1, 3, 6, 4, 1, 2 }; // 5
		int[] B = { 1, 2, 3 }; 			// 4
		int[] C = { -1, -3 }; 			// 1
		System.out.println(SmallestPositive.get(A));
		System.out.println(SmallestPositive.get(B));
		System.out.println(SmallestPositive.get(C));
	}
	
}

