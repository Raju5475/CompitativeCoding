package com.compittative.com;

public class maxSubArray {
public static void main(String[] args) {
	int a[]= {2,9,31,-4,21,7};
	System.out.println(maxSum(a, 3));
	
}
static int maxSum(int a[],int k) {
	int wSum=0;
	int mSum=Integer.MIN_VALUE;
	for(int i=0;i<k;i++) {
		wSum+=a[i];
	}
	for(int i=k;i<a.length;i++) {
		wSum=wSum-a[i-k]+a[i];
		mSum=Math.max(mSum,wSum);
	}
	return mSum;
}
}
