package com.compittative.com;

public class ReverseWords {
public static void main(String[] args) {
	
	String s="World  Hello";
	
	System.out.println(reverse(s));
	
}
static String reverse(String s) {
	
	String words[]=s.split(" +");
	StringBuilder sb=new StringBuilder();
	
	for(int i=words.length-1;i>=0;i--) {
		
		sb.append(words[i]);
		sb.append(" ");
		}
	return sb.toString();
}
}
