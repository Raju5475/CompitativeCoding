package com.compittative.com;

public class Party {
	public static boolean isSuccessfulParty(boolean isWeekend, int numberOfBeers) {
        if (isWeekend) {
            return numberOfBeers <= 40;  
        } else {
            return numberOfBeers >= 40 && numberOfBeers <= 70;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        boolean isWeekend = false;  
        int numberOfBeers =38;     
        boolean success = isSuccessfulParty(isWeekend, numberOfBeers);
        System.out.println(success);
    }
}
