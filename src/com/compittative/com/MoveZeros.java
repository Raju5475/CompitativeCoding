package com.compittative.com;

import java.util.Arrays;

public class MoveZeros {
public static void main(String[] args) {
	int a[]= {1,0,3,0,4,1};
	int temp=0;
	int nz=0;
	int z=0;
	
	while(nz<a.length) {
		if(a[nz]!=0) {
			temp=a[nz];
			a[nz]=a[z];
			a[z]=temp;
			nz++;z++;
		}else {
			nz++;
		}
	}
	System.out.println(Arrays.toString(a));
}
}
