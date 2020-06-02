package com.algorithms;

public class ReverseString {
	
	public static void main(String[] args) {
		
		System.out.println(ReverseString.reverse("civic"));
		System.out.println(ReverseString.reverse("madam"));
		System.out.println(ReverseString.reverse("may the force be with you"));
		System.out.println(ReverseString.reverse("mandalorian"));
	}
	
	public static String reverse(String input) {
		
		StringBuilder sb = new StringBuilder();
		char[] chars = input.toCharArray();
		
		for (int i = chars.length - 1; i >= 0; i--)
			sb.append(chars[i]);
		
		return sb.toString();
	}
	
}
