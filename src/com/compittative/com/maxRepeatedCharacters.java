package com.compittative.com;

public class maxRepeatedCharacters {

public static void main(String[] args) {
	String s="abab";
	System.out.println(Repeated(s, 10));
	
}
static int Repeated(String s,int n) {
	int countA=0;
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a') {
			countA++;
		}
		countA=countA*(n/s.length());
	}
	for(int i=0;i<(n%s.length());i++){
		if(s.charAt(i)=='a') {
			countA++;
		}
	}
	return countA;
}
	
}
