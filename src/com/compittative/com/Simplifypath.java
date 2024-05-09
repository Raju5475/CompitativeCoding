
package com.compittative.com;

import java.util.Stack;

public class Simplifypath {
public static void main(String[] args) {
	String s="/home/../usr//bin/./test";
	String string = check_path(s);
	System.out.println(string);
}
static String check_path(String s) {
	//we should remove all the .&&.. tooo.
	//Create a stack and store the elements in it
	Stack<String>stack=new Stack<>();
	//Split or convert the given string into the array
	String parts[]=s.split("/");
	//Iterarte through the string 
	for(String part:parts) {
		if(part.equals("")||part.equals(".")) {
			continue;
		}
		if(part.equals("..")) {
			if(!stack.empty()) {
				stack.pop();
			}
			
			
		}else {
			stack.push(part);
		}
	}
	StringBuilder sb=new StringBuilder();
	for(String dir:stack) {
		sb.append("/");
		sb.append(dir);
	}
	
	return sb.length()>0?sb.toString():"/";
	
}
}