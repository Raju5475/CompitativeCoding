package com.compittative.com;

import java.util.HashMap;

public class HashDuplicate {
public static void main(String[] args) {
	int[] a= {1,2,3,1};
	System.out.println(findDuplicates(a, 3));
}
 static boolean findDuplicates(int a[],int k) {
	 
	 HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	 for(int i=0;i<a.length;i++) {
		 if(!hm.containsKey(a[i])) {
			 hm.put(a[i],i);
			 
		 }else {
			 
			 int pastIndex=hm.get(a[i]);
			 if(Math.abs(pastIndex-i)<=k) {
				 return true;
			 }else {
				 hm.put(a[i],i);
			 }
		 }
	 }
	 return false;
 }

}
