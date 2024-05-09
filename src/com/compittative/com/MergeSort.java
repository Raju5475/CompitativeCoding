   package com.compittative.com;

public class MergeSort {
	
static void merge(int arr[],int l,int r) {
	
	if(l<r) {
		int mid=(l+r)/2;
		merge(arr, l, mid);
		merge(arr, mid+1, r);
		mergesort(arr, l, r, mid);
	}
}
	static void mergesort(int arr[],int l,int r, int mid) {
		int n=mid-l+1;
		int m=r-mid;
		int larr[]=new int[n];
		int rarr[]=new int[m];
		
		for(int i=0;i<n;i++) {
			larr[i]=arr[i+l];
		}
		for(int i=0;i<m;i++) {
			rarr[i]=arr[mid+1+i];
		}
		int i=0,j=0,k=l;
		while(i<n && j<m) {
			if(larr[i]<=rarr[j]) {
				arr[k]=larr[i];
				i++;
				k++;
			}else {
				arr[k]=rarr[j];
				j++;
				k++;
				
			}
		}
		while(i<n) {
			arr[k]=larr[i];
			i++;
			k++;
		}
		while(j<m) {
			arr[k]=rarr[j];
			j++;
			k++;
		}
		
		
		
	}
public static void main(String[] args) {
	int arr[]= {3,5,1,4,6,2};
	int l=0;
	int r=arr.length-1;
	
	merge(arr, l, r);
	for(int n:arr) {
		System.out.print(n+" ");
	}
}
}
