package com.compittative.com;

public class merge {
public static void main(String[] args) {
	int a[]= {1,2,3,0,0,0};
	int b[]= {4,5,6};
	int n=3;
	int m=3;
	merge(a, b, n, m);
	for(int i=0;i<m+n;i++) {
		System.out.println(a[i]+" ");
	}
}

static void merge(int a[],int b[],int n,int m) {
	
	int i=n-1;
	int j=m-1;
	int k=m+n-1;
	while(j>=0) {
		if(i>=0 && a[i]>b[j]) {
			a[k]=a[i];
			i--;k--;
		}else {
			a[k]=b[j];
			j--;
			k--;
		}
	}
	
}	
}
