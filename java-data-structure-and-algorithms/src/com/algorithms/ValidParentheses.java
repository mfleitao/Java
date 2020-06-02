package com.algorithms;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
	
	static HashMap<Character, Character> mappings = new HashMap<>();
	
	static {
		mappings.put(')', '(');
		mappings.put('}', '{');
		mappings.put(']', '[');
	}
	
	public static void main(String[] args) {

		System.out.println(ValidParentheses.isValid("()"));
		System.out.println(ValidParentheses.isValid("()[]{}"));
		System.out.println(ValidParentheses.isValid("(]"));
		System.out.println(ValidParentheses.isValid("([)]"));
		System.out.println(ValidParentheses.isValid("{[]}")); 
		System.out.println(ValidParentheses.isValid("{[()]}")); 
		System.out.println(ValidParentheses.isValid("{[()]}[")); 
		System.out.println(ValidParentheses.isValid("{{}[][[[]]]}")); 
		System.out.println(ValidParentheses.isValid("(((((())))))")); 
		System.out.println(ValidParentheses.isValid("()()()()")); 
		System.out.println(ValidParentheses.isValid("(((((((()")); 
		System.out.println(ValidParentheses.isValid("((()(())))")); 
	}
	
	public static boolean isValid(String input) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (char c : input.toCharArray()) {
			if (mappings.containsKey(c)) {
				char topElement = stack.empty() ? '#' : stack.pop();
				if (topElement != mappings.get(c))
					return false;
			} 
			else
				stack.push(c);
		}
		
		return stack.isEmpty();
	}
	
}
