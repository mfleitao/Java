package com.algorithms;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int[] array = { 3, 2, 54, 1, 9, 6, 21, 37, 51, 21, 76, 11 };
		int left = 0; 
		int right = array.length - 1;
		
		System.out.println("Before running quick-sort ");
		QuickSort.display(array);
		
		System.out.print("\n\n");
		QuickSort.run(array, left, right);
		
		System.out.println("After running quick-sort");
		QuickSort.display(array);
	}

	/**
	 * Time Complexity:	O(n log n)
	 * Faster than Bubble-Sort
	 */
	public static void run(int[] input, int left, int right) {
		
		int i = left; 
		int j = right;

		if (right - left >= 1) {
			int tmp;
			int pivot = input[left];

			while (j > i) {
				while (input[i] <= pivot && i <= right && j > i)
					i++;
				while (input[j] > pivot && j >= left && j >= i)
					j--;
				if (j > i) {
					tmp = input[i];
					input[i] = input[j];
					input[j] = tmp;
				}
			}
			
			tmp = input[left];
			input[left] = input[j];
			input[j] = tmp;
			
			run(input, left, j - 1);
			run(input, j + 1, right);
		}
	}
	
	public static void display(int[] a) {
		System.out.print("-> [");
		for (int out : a) System.out.print(" "+ out +" ");
		System.out.print("]");
	}
	
}
