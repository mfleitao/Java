package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class OnOffStates {

	public List<Integer> cellCompete(int[] states, int days) {
		
		// days = how many times should run the update
		List<Integer> out = new ArrayList<>();
		
		//TODO
		for (int i = 0; i < states.length; i++) {
				
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		OnOffStates demo = new OnOffStates();
		int[] input1 = { 1, 0, 0, 0, 0, 1, 0, 0 }; // houses
		int[] input2 = { 1, 1, 1, 0, 1, 1, 1, 1 }; // houses
//												 1 0 0 0 0 1 0 0
		demo.cellCompete(input1, 1); // expected 0 1 0 0 1 0 1 0
		
		demo.cellCompete(input2, 2); // expected 0 0 0 0 0 1 1 0
	}
}
