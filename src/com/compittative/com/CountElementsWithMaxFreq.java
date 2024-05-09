package com.compittative.com;

public class CountElementsWithMaxFreq {
public static void main(String[] args) {
	int a[]= {1,2,2,3,1,4,3};
    System.out.println(count(a));

}
	static int count(int a[]) {
	int[] freq=new int[101];
	int maxfreq=0;
	for(int i:a) {
		freq[i]++;
		maxfreq=Math.max(maxfreq,freq[i]);
	}
	int ans=0;
	for(int i=0;i<100;i++) {
		if(maxfreq==freq[i]) {
		ans+=maxfreq;
		}
	}
	return ans;
}
}
