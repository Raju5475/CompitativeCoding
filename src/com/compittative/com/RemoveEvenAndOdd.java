package com.compittative.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEvenAndOdd {
public static void main(String[] args) {
	 int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	 
	 List<Integer> even=Arrays.stream(numbers).filter(num -> num%2==0).
			 					boxed().collect(Collectors.toList());
	 
	 System.out.println(even);
}
}
