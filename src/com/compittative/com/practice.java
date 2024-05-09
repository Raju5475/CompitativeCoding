package com.compittative.com;

public class practice {
public static void main(String[] args) {
	  int[] a = {1, 4, 20, 3, 10, 5};
	  int targetSum = 24;
	  System.out.println(maxSum(a, targetSum));
}

static int maxSum(int a[],int targetSum) {
	int maxsize=0;
	int start=0;
	int sum=0;
	for(int end=0;end<a.length;end++) {
		sum+=a[end];
		while(sum>targetSum) {
			sum-=a[start];
			start++;
		}
		if(sum==targetSum) {
			int currsize=end-start+1;
			maxsize=Math.max( currsize,maxsize);
		}
	}
	return (maxsize==Integer.MIN_VALUE)?-1:maxsize;
}


}
