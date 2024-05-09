package com.compittative.com;

public class ContainerWithMostWater {
public static void main(String[] args) {
	int a[]= {1,8,6,2,5,4,8,3,7};
	System.out.println(checkMostWater(a));
}
public static int checkMostWater(int[] a) {
	   int maxarea=0;
       int leftbar=0;
       int rightbar=a.length-1;
      while(leftbar<rightbar) {
    	  int area=Math.min(a[leftbar], a[rightbar])
    			  *(rightbar-leftbar);
    	  maxarea=Math.max(area, maxarea); 
    	  
    	  if(a[leftbar]<a[rightbar]) {
    		  leftbar++;
    	  }else {
    		  rightbar--;
    	  }
      }
       return maxarea;
       
}
}
