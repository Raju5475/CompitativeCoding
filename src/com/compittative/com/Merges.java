package com.compittative.com;

public class Merges {
	public static void main(String[] args) {
	    int a[]={1,2,3};
	    int b[]={4,5,6};
	    int [] mergerArray=merge(a, b);
	    for(int n:mergerArray) {
	    	System.out.println(n+" ");
	    }
	    
		System.out.print("Message");
	}
	static int[] merge(int a[],int b[]){
	    int n=a.length;
	    int m= b.length;
	    int x[]=new int[m+n];
	    int k=0,i=0,j=0;
	    while(i<n && j<m){
	        
	        if(a[i]>b[j]){
	    x[k]=a[i];
	    k++;i++;
	}else{
	    x[k]=b[j];
	    k++;j++;
	}
	        
	}
	while(i<n){
	     x[k]=a[i];
	    k++;i++;
	}
	while(j<n) {
	 x[k]=b[j];
	k++;j++;
	}
	
	return x;
		
	}
	    }

