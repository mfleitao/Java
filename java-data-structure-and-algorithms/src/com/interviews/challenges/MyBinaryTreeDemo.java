package com.interviews.challenges;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MyBinaryTreeDemo {

	public static void main(String[] args) {
		
		// TEST 1 : Sorted input via Constructor 
		// -----------------------------------------------------------------------------------------
		int[] input_1 = { 5, 7, 11, 20, 27, 36, 36, 54 };
		
		/**
		 *			1 
		 *		  /   \
		 *		 2     3  
		 *		/ \   / \
		 *	   4   5 6   7	
		 */
		MyBinaryTree binaryTree = new MyBinaryTree(1);
		binaryTree.left(binaryTree.root(), 2);
		binaryTree.right(binaryTree.root(), 3);
		
//		binaryTree.printPostOrder(binaryTree.root());
//		System.out.print("\n");
//		
//		binaryTree.printInOrder(binaryTree.root());
//		System.out.print("\n");
//		
//		binaryTree.printPreOrder(binaryTree.root());
//		System.out.print("\n");

		// TEST 2 : Unsorted input via Constructor 
		// -----------------------------------------------------------------------------------------
		int[] input_2 = { 54, 27, 36, 20, 7, 36, 11, 5, 54 };
		Set<Integer> t = new TreeSet<>();
		for (int in : input_2)
			t.add(in);
		System.out.println(t.toString());

		// TEST 3 : Unsorted input using 'add' method (one-by-one) 
		// -----------------------------------------------------------------------------------------
		int[] input_3 = { 60, 4, 21, 33, 11, 17, 2, 98 };
		
	}
	
}
