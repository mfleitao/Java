package com.algorithms;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println(Palindrome.isPalindrome(121));
		System.out.println(Palindrome.isPalindrome(-121));
		System.out.println(Palindrome.isPalindrome(10));
		System.out.println(Palindrome.isPalindrome(1221));
		System.out.print("\n");
		System.out.println(Palindrome.isPalindrome("NASA"));
		System.out.println(Palindrome.isPalindrome("level"));
		System.out.println(Palindrome.isPalindrome("civic"));
		System.out.println(Palindrome.isPalindrome("madam"));
	}

	public static boolean isPalindrome(int x) {
		int reg = x;
		int rev = 0;
		if (x < 0)
			return false;
		else {
			while (x > 0) {
				rev = rev * 10 + x % 10;
				x /= 10;
			}
		}
		return reg == rev;
	}

	public static boolean isPalindrome(String x) {
		if (x == null || x.isEmpty())
			return false;
		char[] chars = x.toCharArray();
		int j = chars.length - 1;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != chars[j])
				return false;
			j--;
		}
		return true;
	}
	
}
