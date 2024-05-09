package com.compittative.com;

import java.util.Iterator;

public class BestTimeToBuy {
		   
static int prices[]= {7,1,5,3,6,4};
public static void main(String[] args) {
	int b=bestBuy(prices);
	System.out.println(b);
}

public static int bestBuy(int prices[]) {
	int profit=0;
	int buy1St=prices[0];
	for(int i=1;i<prices.length;i++) {
		if(prices[i]<buy1St) {
			buy1St=prices[i];
			
		}else {
			//calculate the profit amount
		     int cur_price=prices[i]-buy1St;
		       profit=Math.max(cur_price,profit);
			
		}
		
	}
	return profit;
}
}
