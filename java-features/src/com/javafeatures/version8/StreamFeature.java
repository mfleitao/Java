package com.javafeatures.version8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFeature {

	public static void main(String[] args) {
		 
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 50; i++)
			myList.add(i + 1);
		
		Stream<Integer> highNumbers = myList.parallelStream().filter(p -> p > 40);
		highNumbers.forEach(p -> System.out.println("High numbers parallel: "+ p));
		
		Stream<Integer> highNumSeq = myList.stream().sequential().filter(p -> p > 40);
		highNumSeq.forEach(p -> System.out.println("High nums sequential "+ p));
		
	}
	
}
