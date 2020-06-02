package com.algorithms;

import java.util.HashMap;
import java.util.Map;

public class RegorObject {
	
	public static void go(String str, int[] ints) {
		
		char[] letters = str.toCharArray();
		Map<Integer, Character> map = new HashMap<>();

		for (int i = 0; i < letters.length; i++) {
			if (i < letters.length - 1 && letters[i] == letters[i+1]) {
				System.out.println(letters[i]+" "+ints[i]);
				//TODO
//				map.put(, value)
			}
		}
		
		/**
		 * a b c c b d
		 *     - - 
		 * 0 1 2 3 4 5
		 * 
		 * a a b b c c
		 * -   -   -
		 * 1 2 1 2 1 2
		 * 
		 */
	}
	
	public static void main(String[] args) {
		String S1 = "abccbd";
		int[] C1 = { 0, 1, 2, 3, 4, 5 }; // 2
		
		String S2 = "aabbcc";
		int[] C2 = { 1, 2, 1, 2, 1, 2 }; // 3

		String S3 = "aaa";
		int[] C3 = { 3, 4, 5, 6 }; // 3
		
		String S4 = "ababa";
		int[] C4 = { 10, 5, 10, 5, 10 }; // 0
		
		RegorObject.go(S1, C1);
//		RegorObject.go(S2, C2);
//		RegorObject.go(S3, C3);
//		RegorObject.go(S4, C4);
	}
	
}
