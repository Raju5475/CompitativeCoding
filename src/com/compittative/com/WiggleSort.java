package com.compittative.com;

import java.util.Arrays;

public class WiggleSort {
	
	//the index of the middle element should be greater
	//than the adjacent element  
	
	public static void main(String[] args) {
		int arr[]= {3,5,2,1,6};
		wiggle(arr);
		for(int i :arr) {
			System.out.print(i+" ");
		}
		
	//even positon should be less than the adjacent elements
	//Odd position should be greater than the adjacent positions	
		
	}
	static void wiggle(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			//check for the even position
			if(i%2==0) {
				if(arr[i]>arr[i+1]) {
					swap(arr, i, i+1);
				}
			}
			//check for the odd position
			else {
				if(arr[i]<arr[i+1]) {
					swap(arr, i, i+1);
				}
			}
		}
		
	}
	static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
