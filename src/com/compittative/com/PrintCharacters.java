package com.compittative.com;

import java.util.Scanner;

public class PrintCharacters {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Character...!");
	char c = sc.next().charAt(0);
	printNextElement(c);
}
static void printNextElement(char c) {
	for(int i=0;i<5;i++) {
		
		if(c>='a' && c<'z') {
			c++;
		}else if(c=='z') {
			c='A';
		}else if(c>='A' && c<'Z') {
			c++;
		}else if(c=='Z') {
			c='a';
		}
		System.out.println("Your Characters are:  "+c);
	}
}
}
