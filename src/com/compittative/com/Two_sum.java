package com.compittative.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_sum {
public static void main(String[] args) {
	int a[]= {16,4,23,8,15,42,1,2};
	int target=19;
	int[] sum = check2Sum(a, target);
	System.out.println(Arrays.toString(sum));
}
static int[] check2Sum(int a[],int target) {
	Map<Integer, Integer> hm=new HashMap<Integer, Integer>();
	for(int i=0;i<a.length;i++) {   
		 
		int val=target-a[i];
		if(hm.containsKey(val)) {
			return new int[] {hm.get(val),i};
		}else {
			hm.put(a[i],i);
		}
	}
	throw new IllegalArgumentException("No Two Sum Found");
	
	
	
	
}

}
