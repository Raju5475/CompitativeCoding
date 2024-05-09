package com.compittative.com;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s="race e Car";
		System.out.println(isPalindrome(s));
	}
public static boolean isPalindrome(String s) {
        
	s=s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
	int i=0;
	int j=s.length()-1;
	while(i<=j) {
	 if(s.charAt(i)==s.charAt(j)) {
		 i++;
		 j--;
		 return true;
	 }
	}
	return false;
    }
}
