package com.compittative.com;

public class Fibonocvis {
	
	public static void main(String[] args) {
		int n=20;
		int start=0;
		int sum=0;
		int end=1;
		System.out.print(start+end );
		for(int i=2;i<n;i++) {
			sum=start+end;
			System.out.print(sum +" ");
			start=end;
			end=sum;
		}
	}

}
