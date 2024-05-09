package com.compittative.com;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
public static void main(String[] args) {
	boolean b = ishappy(19);
	System.out.println(b);
}
static boolean ishappy(int n) {
  Set<Integer> usedIntegers = new HashSet<>();
  //if condition is true run a loop and a inner loop
  while(true){
	  int sum=0;
	  while(n!=0) {
		  // get the remainder and it to the sum
		  //And the power(2) by using the math pow function
		  sum+=Math.pow(n%10, 2.0);
		  n=n/10;
	  }
	  // if the function gives the sum vales as 1 make the return type as true;
	  if(sum==1) {
		  return true;
	  }
	  // else check the number in map and and again add that sum to the ..
	  // set 
	  n=sum;
	  if(usedIntegers.contains(n)) {
		  return false;
	  }
	  usedIntegers.add(n);
  }
}
}
