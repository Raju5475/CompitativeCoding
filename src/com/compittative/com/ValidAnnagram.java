package com.compittative.com;

public class ValidAnnagram {
public static void main(String[] args) {
	String s="anagram";
	String t="nagaraa";
	boolean b = checkAnnagram(s, t);
	System.out.println(b);
}
public static boolean checkAnnagram(String s,String t) {
	int n=s.length();
	int m=t.length();
	int count[]=new int[26];//Ascci values are 26
	if(n!=m) {
		return false;
	}
	for(int i=0;i<n;i++) {
		//count the values
		count[s.charAt(i)-'a']++;
	}
	for(int i=0;i<m;i++) {
		count[t.charAt(i)-'a']--;
	}
	for(int i=0;i<count.length;i++) {
		if(count[i] != 0) {
			return false;
		}
	}
	return true;
}
}
