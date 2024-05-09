package com.compittative.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicatesArray {
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6}; 
		
		List<Integer> unique=Arrays.stream(numbers).
				              distinct().boxed().
				              collect(Collectors.toList());
		
		System.out.println(unique);
	}

}
