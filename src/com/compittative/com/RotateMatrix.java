package com.compittative.com;

public class RotateMatrix {
public static void main(String[] args) {
	int a[][]= {
			{1,2,3,4,17},
			{5,6,7,8,18},
			{9,10,11,12,19},
			{13,14,15,16,20}
	};
	
	printarr(a);
	System.out.println();
	rotate(a);
	printarr(a);
}

static void printarr(int a[][]) {
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
}

static void rotate(int a[][]) {
	
	//Make the tarnspose of the matrix
	
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1; j<a.length;j++) {
			int temp=a[i][j];
			a[i][j]=a[j][i];
			a[j][i]=temp;
		}
	}
	//Reverse the Rows
	for(int i=0;i<a.length;i++) {
		int left=0;
		int right=a[0].length-1;
		while(left<right) {
			int temp=a[i][left];
			a[i][left]=a[i][right];
			a[i][right]=temp;
			left++;
			right--;
		}
	}
}
}
