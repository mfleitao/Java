package com.algorithms;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	private static Map<Character, Integer> roman = new HashMap<>();
	
	static {
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
	}
	
	public static void main(String[] args) {
		System.out.println(RomanToInteger.convert("III")); // 3
		System.out.println(RomanToInteger.convert("IV")); // 4
		System.out.println(RomanToInteger.convert("IX")); // 9
		System.out.println(RomanToInteger.convert("LVIII")); // L = 50, V= 5, III = 3
		System.out.println(RomanToInteger.convert("MCMXCIV")); // M = 1000, CM = 900, XC = 90 and IV = 4
	}
	
	public static int convert(String str) {
		int output = 0;
		
		for (int i = 0; i < str.length(); i++) {
			output += roman.get(str.charAt(i));
			
			if (str.charAt(i) == 'V' || str.charAt(i) == 'X') {
				if (i > 0 && str.charAt(i-1) == 'I') 
					output -= 2;
			}
			else if (str.charAt(i) == 'L' || str.charAt(i) == 'C') {
				if (i > 0 && str.charAt(i-1) == 'X') 
					output -= 20;
			}
			else if (str.charAt(i) == 'D' || str.charAt(i) == 'M') {
				if (i > 0 && str.charAt(i-1) == 'C') 
					output -= 200;
			}
		}
		return output;
	}
	
}
