package com.compittative.com;

import java.util.Stack;

public class BasicCalculator {
	 public int calculate(String s) {
	        Stack<Integer> st=new Stack();
	        int ans=0,num=0,sign=1;
	        for(int i=0;i<s.length();i++) {
	        	char c=s.charAt(i);
	        	if(Character.isDigit(c)) {
	        		num=num*10+(c-'0');
	        	}else if(c=='+') {
	        		ans+=sign*num;
	        		sign=1;
	        		num=0;
	        	}else if(c=='-') {
	        		ans+=sign*num;
	        		sign=-1;
	        		num=0;
	        	}else if(c=='(') {
	        		//inside the brackets calculation
	        		st.push(ans);
	        		st.push(sign);
	        		sign=1;
	        		ans=0;
	        	}else if(c==')'){
	        		ans+=sign*num;
	        		
	        		num=0;
	        		ans*=st.pop();
	        		ans+=st.pop();
	        	}
	        }
	        if(num!=0)
	        	ans+=sign*num;
	        return ans;
	    }

    public static void main(String[] args) {
        // Example usage
        BasicCalculator calculator = new BasicCalculator();
        String input = 
        		"(1+(4+5+2)-3)+(6+8)";
        int result = calculator.calculate(input);
        System.out.println(result); // Output: 2
    }
}
