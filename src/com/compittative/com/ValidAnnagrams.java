package com.compittative.com;

public class ValidAnnagrams {
public static void main(String[] args) {
	String s="anagram";
	String t="nagaram";
	boolean status=checkAnnagram(s, t);
	System.out.println(status);
}
static boolean checkAnnagram(String s,String t) {
	int freq[]=new int[26];
	for(int i=0;i<s.length();i++) {
		freq[s.charAt(i)-'a']++;
		freq[s.charAt(i)-'a']--;
		
	}
	for(int cur:freq) {
		if(cur!=0) {
			return false;
		}
	}
	return true;
}

}
