package com.compittative.com;

public class FindmedianofTwoSortedArrays {

	
	public static void main(String[] args) {
		int a[]= {1,3,8,17};
		int b[]= {5,6,7,19,21,25};
		
		
		System.out.println("The median is "+findMedian(a, b));
		
	}
	
	public static float findMedian(int a[],int b[]) {
		int n=a.length;
		int m=b.length;
		int x[]=new int[n+m];
		int k=0;
	 int i=0,j=0;
		while(i<n && j<m) {
			if(a[i]<b[j]) {
				x[k]=a[i];
				i++;k++;
			}else {
				x[k]=b[j];
				j++;k++;
			}
		}
		while(i<n) {
			x[k]=a[i];
			i++;k++;
		}
		while(j<n) {
			x[k]=b[j];
			j++;k++;
		}
		if(x.length%2==0) {
			int mid=x.length/2;
			return (float)(x[mid]+x[mid-1])/2;
		}else {
			int mid=x.length/2;
			return x[mid];
		}
	
	}
}
