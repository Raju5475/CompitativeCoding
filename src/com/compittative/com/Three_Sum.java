package com.compittative.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three_Sum {
public static void main(String[] args) {
	int a[]= {-2,0,1,1,2};
	List<List<Integer>> sum = threeSum(a);                                               
	System.out.println(sum);
}
static  List<List<Integer>> threeSum(int[] a){
	if(a==null || a.length<3) return new ArrayList<>();
	Arrays.sort(a);
	Set<List<Integer>> list=new HashSet<>();
	
	for(int i=0;i<a.length;i++) {
		int left=i+1;
		int right=a.length-1;
		while(left<right) {
			int sum=a[i]+a[left]+a[right];
			if(sum==0) {
				list.add(Arrays.asList(a[i],a[left],a[right]));
				left++;
				right--;
			}
			else if(sum<0){
				left++;
			}else {
				right--;
			}
		}
	}
	
	return new ArrayList<>(list);
} 
}
