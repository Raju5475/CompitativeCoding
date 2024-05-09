package com.compittative.com;

public class AlternatingCharacters {
	public static void main(String[] args) {
		String s="AABAAB";
		System.out.println(find(s));
	}
	public static int find(String s) {
		int count=0;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
			}
		}
		return count;
	}

}
