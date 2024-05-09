package com.compittative.com;

public class Product {
public static void main(String[] args) {
	int nums[]= {3,4,5,2};
	int sum=maxProduct(nums);
	System.out.println(sum);
}
static int maxProduct(int nums[]) {
	int max=0;
	int secondmax=0;
	for(int num: nums ) {
		if(num>max) {
			secondmax=max;
			max=num;
			continue;
		}else if(num>secondmax) {
			secondmax=num;
		}
	}
	return (max-1)*(
			secondmax-1);
}
}
