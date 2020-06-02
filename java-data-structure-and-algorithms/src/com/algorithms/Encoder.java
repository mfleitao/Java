package com.algorithms;

public class Encoder {
	
	public static void main(String[] args) {
		
		System.out.println(Encoder.encode("aaabbcccc"));
		System.out.println(Encoder.encode("cchhhhhesshdrrruuukkkc"));
	}

	public static String encode(String input) {
		
		if (input == null || input.isEmpty())
			return "";
		
		char[] inputChars = input.toCharArray();
		char prevChar = 0;
		int counter = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for (char c : inputChars) { 
			if (prevChar == c)
				counter++;
			else {
				if (prevChar != 0) 
					sb.append(counter).append(prevChar);
				prevChar = c;
				counter = 1;
			}
		}
		sb.append(counter).append(prevChar);
		
		return sb.toString();
	}
	
}
