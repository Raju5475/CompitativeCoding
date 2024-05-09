package com.compittative.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {
public static void main(String[] args) {

	int[] array = {1, 2, 3, 4, 4, 
			5, 6, 6, 7, 8, 9, 9};
	Set<Integer> s=new HashSet<>();
	
	for(int i:array) {
		s.add(i);
	}
	int[] uniqueArray=new int[s.size()];
	int index=0;
	
	for(int i:s) {
		uniqueArray[index++]=i;
	}
	System.out.println(Arrays.toString(uniqueArray));
}

}
