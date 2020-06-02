package com.algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array = { 3, 2, 54, 1, 9, 6, 21, 37, 51, 21, 76, 11 };
		
		System.out.println("Before running bubble-sort");
		BubbleSort.display(array);
		
		BubbleSort.run(array);
		System.out.print("\n\n");
		
		System.out.println("After running bubble-sort");
		BubbleSort.display(array);
	}
	
	public static void run(int[] input) {
		int temp;
		for (int i = input.length - 1; i > 0; i--) {
			for (int x = 0; x < i; x++) {
				if (input[x] > input[x+1]) {
					temp = input[x];
					input[x] = input[x+1];
					input[x+1] = temp;
				}
			}
		}
	}
	
	public static void display(int[] array) {
		System.out.print("-> [");
		for (int out : array) System.out.print(" "+ out +" ");
		System.out.print("]");
	}
}
