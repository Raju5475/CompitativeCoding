package com.compittative.com;

public class Test {
	
	public static int fun(int a,int b) {
		if(a-b>0) {
			return a+b;
		}else {
			return a*b;
		}
	}
	
public static void main(String[] args) {
	int ans=0;
	for(int i=1;i*i<=20;i++) {
		ans+=fun(i, i);
	}
	System.out.println(ans);
}
}
