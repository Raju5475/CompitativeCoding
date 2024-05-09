package com.compittative.com;

public class ArmStrong {
	
	public static void main(String[] args) {
		int orginalnumber=153;
		int digits=String.valueOf(orginalnumber).length();
		
		boolean armStrong = checkArmStrong(orginalnumber,digits);
		System.out.println(armStrong);
	}
	public static boolean checkArmStrong
	(int originalnumber,int digits) {
		
		int n=originalnumber;
		int temp,armstrong=0;
		while(n>0) {
			temp=n%10;
			temp=(int)Math.pow(temp,digits);
			armstrong+=temp;
			n=n/10;
		}
		if(armstrong==originalnumber) {
			return true;
		}	
		return false;
	}

}
