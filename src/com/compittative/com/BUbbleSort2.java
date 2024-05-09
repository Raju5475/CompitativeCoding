
package com.compittative.com;

public class BUbbleSort2 {

	public static void main(String[] args) {
		int a[]= {3,4,7,2,1,6};
		bubble(a);
	}
	static void bubble(int a[]) {
		int temp=0;
		for(int nums:a) {
			System.out.print(nums+" ");
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
	}
		System.out.println();
		for(int nums:a) {
			System.out.print(nums+" ");
		}
	
	
}}
