package com.compittative.com;

public class CurrentLeader {
public static void main(String[] args) {
	int a[]={1,7,11,6,11,8};
	int clr=a[a.length-1];
	for(int i=a.length-2;i>=0;i--) {
		if(clr<a[i]) {
			clr=a[i];
		}
	}
	System.out.println(clr);
}
}
