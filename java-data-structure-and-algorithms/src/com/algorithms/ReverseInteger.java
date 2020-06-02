package com.algorithms;

public class ReverseInteger {
	
	public static void main(String[] args) {
		
		System.out.println(ReverseInteger.reverse(123));
		System.out.println(ReverseInteger.reverse(2147483647));
		System.out.println(ReverseInteger.reverse(-123));
		System.out.println(ReverseInteger.reverse(-2147483647));
		System.out.println(ReverseInteger.reverse(120));
		System.out.println(ReverseInteger.reverse(5432100));
	}
	
	/**
	 * Time Complexity: O(log n)
	 * Space Complexity: O(1)
	 */
	public static int reverse(int x) {
		long rev = 0;
		while (x != 0) { 
			rev = (rev * 10) + (x % 10);
			x /= 10;
		}
		return (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) ? 0 : (int) rev;
	}
	
}
