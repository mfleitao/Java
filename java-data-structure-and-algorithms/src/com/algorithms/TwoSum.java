package com.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1]
 * 
 * @author Matheus
 *
 */
public class TwoSum {
	
	public static void main(String[] args) {
		
		int[] input = { 2, 4, 7, 11, 15 };
		int target = 9;
		
		TwoSum.display(TwoSum.nestedLoopApproach(input, target));
		TwoSum.display(TwoSum.singleLoopApproach(input, target));
		TwoSum.display(TwoSum.hashMapApproach_1(input, target));
		TwoSum.display(TwoSum.hashMapApproach_2(input, target));
	}
	
	/**
	 * Time Complexity	: O(n^2) iterates the arrays, which is O(n) each, to find what sum of 
	 * elements is equals to the target input
	 * 
	 * Space Complexity	: O(1) single integer array for return
	 */
	public static int[] nestedLoopApproach(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target)
					return new int[] { i, j };
			}
		}

		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static int[] singleLoopApproach(int[] nums, int target) {

		int firstElment = 0;
		int complement = 0;
		
		//FIXME: there's a bug in this
		for (int i = 0; i < nums.length; i++) {
			if (target > nums[i] && complement == 0) {
				complement = target - nums[i];
				firstElment = i;
			}
			if (nums[i] == complement)
				return new int[] { firstElment, i }; 
		}

		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static int[] hashMapApproach_1(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++)
			map.put(nums[i], i);

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i)
				return new int[] { i, map.get(complement) };
		}
			
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static int[] hashMapApproach_2(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement))
				return new int[] { map.get(complement), i };
			map.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void display(int[] output) {
		System.out.println("["+ output[0] +", "+ output[1] +"]");
	}

}













