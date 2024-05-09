package com.compittative.com;

import java.util.Arrays;

public class Interview {
public static void main(String[] args) {
	
	 String[] arr= {"3","30","34","5","9"};
	 System.out.println(largest(arr));
}

static String largest(String arr[]) {
	Arrays.sort(arr, (a,b) -> (b + a).compareTo(a+b));

    // Concatenate the sorted strings
    StringBuilder result = new StringBuilder();
    for (String s : arr) {
        result.append(s);
    }

    return result.toString();
}

}
