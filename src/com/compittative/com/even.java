package com.compittative.com;

public class even {
	public static void main(String[] args) {
		int[] a= {1,12,3,8,4,6};
		int i = searcheven(a);
		System.out.println(i);
		
	}
	
	static int searcheven(int a[]) {
		
		int min=Integer.MAX_VALUE;
		
		for(int num : a) {
			if(num%2==0) {
				min=Math.min(min,num);
			}
		}
		return min;	
	}

}
