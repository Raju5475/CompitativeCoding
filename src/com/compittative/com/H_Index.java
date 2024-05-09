package com.compittative.com;

import java.util.Arrays;

public class H_Index {
static int[]citations= {3,0,6,1,5};
public static void main(String[] args) {
	int v=maxCitations(citations);
	System.out.println(v);
}

public static int maxCitations(int citations[]) {
	int n=citations.length;
	Arrays.parallelSort(citations);
	
	for(int i=0;i<n;i++) {
		
		int h=n-i;
		
		if(citations[i]>=h) {
			return h;
		}
		
}
	return 0;	

}
}
