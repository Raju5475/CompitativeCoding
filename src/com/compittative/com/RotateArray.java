package com.compittative.com;

public class RotateArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	rotateMultiple(a,7);
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	
}
static void rotateOnes(int a[]) {
	
	int temp=a[0];
	for(int i=1;i<a.length;i++) {
		a[i-1]=a[i];
	}
	a[a.length-1]=temp;
}

static void rotateMultiple(int a[],int k) {
	if(k>0) {
		k=k%a.length;
	}else {
		k=k+a.length;
	}
	for(int i=1;i<=k;i++) {
		rotateOnes(a);
	}
}
}
