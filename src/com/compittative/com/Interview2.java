package com.compittative.com;

import java.util.*;

public class Interview2 {
    public static void main(String[] args) {
        int[] a = {36, 45, 63, 72, 81, 99};
        
        		List<Integer> l=find(a);
        		System.out.print(l);

      
    }
    static List<Integer> find(int a[]){
    	
    	List<Integer> list=new ArrayList<Integer>();
    	
    	for(int num:a) {
    		int d1=num%10;
    		int d2=num/10;
    		
    		if(Math.abs(d1-d2)==3) {
    			list.add(-num);
    		}else {
    			
    			list.add(num);
    		}
    	}
    	return list;
    	
    }
}
