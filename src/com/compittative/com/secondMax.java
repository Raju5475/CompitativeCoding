package com.compittative.com;

public class secondMax {
	public static void main(String[] args) {
		
		
		
		
		int a[]= {10, 5, 8, 20, 2, 15};
		System.out.println(findMax2(a));
	}
	public static int findMax2(int a[]) {
	int max1=Integer.MIN_VALUE;
	int max2=Integer.MIN_VALUE;
	
	for(int i=0;i<a.length;i++) {
		
		if(a[i]>max1) {
			max1=max2;
			max1=a[i];
		}else if(a[i]>max2 && a[i]!=max1) {
			max2=a[i];
		}
		
		
	}
	return max2;
	}
}
