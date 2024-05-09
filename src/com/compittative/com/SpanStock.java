package com.compittative.com;

import java.util.Arrays;
import java.util.Stack;

public class SpanStock {
public static void main(String[] args) {
	int[] prices= {100,80,60,70,60,75,85};
	int[] is = getSpan(prices);
	
}

public static int[] getSpan(int[] prices ) {
	
	int span[]=new int[prices.length];
	//Span of 1st price would be always 1
	span[0]=1;
	
	Stack<Integer> s=new Stack<>();
	
	for(int i=1;i<prices.length;i++) {
		while(!s.isEmpty() && prices[s.peek()]<=prices[i]) {
			s.pop();
			
			//if the above condition satisfy and if stack becomes empty
			
			if(s.isEmpty()) {
				span[i]=i+1;
			}else {
				span[i]=i-s.peek();
				s.push(i);
			}
		}
	}
	return span;
	
}



}
