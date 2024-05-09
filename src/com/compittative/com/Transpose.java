package com.compittative.com;

public class Transpose {
public static void main(String[] args) {
	int a[][]= {
			{1,2,3,4,17},
			{5,6,7,8,18},
			{9,10,11,12,19},
			{13,14,15,16,20}
	};
	print(a);
	tarnspose1(a);
	System.out.println();
	print(a);
}
static void print(int a[][]) {
	for(int i=0;i<a.length;i++) {
		for(int j=0; j<a.length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}

public static void tarnspose1(int a[][]) {
	for(int i=0;i<a.length;i++) {
		for(int j=i+1; j<a.length;j++) {
			int temp=a[i][j];
			a[i][j]=a[j][i];
			a[j][i]=temp;
		}
	}
}
}
