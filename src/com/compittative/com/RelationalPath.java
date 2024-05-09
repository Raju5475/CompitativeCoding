package com.compittative.com;

import java.util.Stack;

public class RelationalPath {
public static void main(String[] args) {
	String[] s={"4","13","5","/","+"};
	int functions= function(s);
	System.out.println(functions);
}
static int function(String s[]) {
	Stack<Integer> st=new Stack<>();
	//Iterate through the given array
	for(String parts:s) {
		if(parts.equals("+")) {
			int a=st.peek();
			st.pop();
			int b=st.peek();
			st.pop();
			st.push(a+b);
		}else if(parts.equals("-")) {
			int a=st.peek();
			st.pop();
			int b=st.peek();
			st.pop();
			st.push(b-a);
		}else if(parts.equals("*")) {
			int a=st.peek();
			st.pop();
			int b=st.peek();
			st.pop();
			st.push(a*b);
		}else if(parts.equals("/")) {
			int a=st.peek();
			st.pop();
			int b=st.peek();
			st.pop();
			st.push(b/a);
		}else {
			st.push(Integer.valueOf(parts));
		}
	}
	return st.pop();
}
}
