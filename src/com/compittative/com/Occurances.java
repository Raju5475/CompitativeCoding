package com.compittative.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Occurances {
	public static void main(String[] args) {
		int[] a = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
		System.out.println(find_Occurance(a));
	}
public static boolean find_Occurance(int[] a) {
	//Create a map to the frequency Occurances
	Map<Integer,Integer> map=new HashMap<>();
	for(int num:a) {
		map.put(num,map.getOrDefault(num,0)+1);
	}
	//Check for the values if its already associated or not
	Set<Integer> occurance=new HashSet<>();
	for(int count:map.values()) {
		if(!occurance.add(count)) {
			return false;
		}
	}
	return true;
}
}
