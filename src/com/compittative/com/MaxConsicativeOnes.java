package com.compittative.com;

public class MaxConsicativeOnes {
	public static void main(String[] args) {
		int a[]= {1,1,0,0,1,1,1};
		
		System.out.println(checkmaxOnes(a));
	}
	
	static int checkmaxOnes(int a[]) {
		
		int count=0;
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				count=0;
			}else {
			 count++;
			 max=Math.max(count, max);
			 
			}
		}
		return max;
		
	}

}
