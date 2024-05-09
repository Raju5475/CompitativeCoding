package com.compittative.com;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {2, 3, 4, 10, 40};
		int target=4;
		int result = binarySerach(a,target);
		if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
	}

 static int binarySerach(int a[],int target) {
	 int low=0;
	 int high=a.length-1;
	 int mid =low+(high-low)/2;
	 
	 if (a[mid] == target) {
         return mid;
     } else if (a[mid] > target) {
    	 high = mid - 1;
    	 
     } else {
    	 
    	 low = mid + 1;
     }
 
 return -1;
 }	
}
