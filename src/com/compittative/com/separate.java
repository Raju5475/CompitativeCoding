package com.compittative.com;

public class separate {

public static void main(String[] args) {
	
	String s="Nirmal@123";

	StringBuilder alpa=new StringBuilder();
	for(int i=0;i<s.length();i++) {
		
		char ch=s.charAt(i);
		
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			
			alpa.append(ch);
		}
	}
	System.out.println(alpa.toString());
	
		
}
}
