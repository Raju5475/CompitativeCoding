package com.compittative.com;

public class singleNumber {
public static void main(String[] args) {
	int a[]= {1,2,1,4,4};
	System.out.println(checkSingle(a));
}
static int checkSingle(int a[]) {
	int sign=a[0];
	for(int i=1;i<a.length;i++) {
		sign=sign^a[i];
	}
	return sign;
}
}
