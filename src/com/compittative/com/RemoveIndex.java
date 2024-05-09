package com.compittative.com;

public class RemoveIndex {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int index=2;
		int n=a.length;
		for(int i=index;i<n-1;i++) {
			a[i]=a[i+1];
		}
		//n--;
		for(int i=0;i<n-1;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
