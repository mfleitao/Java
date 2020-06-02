package com.interviews.challenges;

public class MySortedLinkedListDemo {

	public static void main(String[] args) {
		
		// TEST 1 : Sorted input via Constructor 
		// -----------------------------------------------------------------------------------------
		int[] input_1 = { 5, 7, 11, 20, 27, 36, 36, 54 };
		MyList linkedList_1 = new MySortedLinkedList(input_1);
		
		// Displaying list values
		System.out.println(linkedList_1.toString());

		// TEST 2 : Unsorted input via Constructor 
		// -----------------------------------------------------------------------------------------
		int[] input_2 = { 54, 27, 36, 20, 7, 36, 11, 5 };
		MyList linkedList_2 = new MySortedLinkedList(input_2);
		
		// Displaying list values
		System.out.println(linkedList_2.toString());

		// TEST 3 : Unsorted input using 'add' method (one-by-one) 
		// -----------------------------------------------------------------------------------------
		int[] input_3 = { 60, 4, 21, 33, 11, 17, 2, 98 };
		MyList linkedList_3 = new MySortedLinkedList();

		for (int in : input_3)
			linkedList_3.add(in); // using method 'add'
		
		// Displaying list values
		System.out.println(linkedList_3.toString());
		
	}
	
}
