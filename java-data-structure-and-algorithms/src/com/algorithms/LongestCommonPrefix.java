package com.algorithms;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] input_1 = { "flower", "flow", "flight" };
		String[] input_2 = { "dog", "racecar", "car" };
		String[] input_3 = { "leets", "leetcode", "leet", "leeds" };
		String[] input_4 = { };
		
		System.out.println(LongestCommonPrefix.prefix(input_1));
		System.out.println(LongestCommonPrefix.prefix(input_2));
		System.out.println(LongestCommonPrefix.prefix(input_3));
		System.out.println(LongestCommonPrefix.prefix(input_4));
		System.out.println(LongestCommonPrefix.prefix(null));
	}
	
	// Time complexity	: O(s) where S is the sum of all characters in all strings
	// Space complexity	: O(1) used constant extra space only
	public static String prefix(String[] input) {
		
		if (input == null || input.length == 0)
			return "null or empty";
		
		String output = input[0];
		
		for (int i = 1; i < input.length; i++) {
			while (input[i].indexOf(output) != 0) {
				output = output.substring(0, output.length() - 1);
				if (output.isEmpty())
					return "there is no prefix";
			}
		}
		
		return "Prefix: "+ output;
	}
	
}
