package com.compittative.com;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveElement {
public static void main(String[] args) {
	int a[]= {0,0,1,1,1,2,2,3,3,4};
	
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int i=0;i<a.length;i++) {
		hs.add(a[i]);
	}
	for(int nums:hs) {
		System.out.println(nums);
	}
	
	int x[]=new int[a.length];
	returnarray(a,x);
	for(int nums:x) {
		System.out.println(nums);
	}
	
}
static int[] returnarray(int a[],int x[]) {
//	int x[]=new int[a.length];
	int j=0;
	for(int i=0;i<a.length-1;i++) {
		if(a[i]!=a[i+1]) {
			x[j]=a[i];
			j++;
		}
		x[j]=a[a.length-1];
	}
	
	return x;
}

}



