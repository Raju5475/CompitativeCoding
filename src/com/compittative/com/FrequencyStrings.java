package com.compittative.com;

import java.util.HashMap;
import java.util.Map;

public class FrequencyStrings {
public static void main(String[] args) {
	String s="hello";
	s=s.toLowerCase();
	get_freq(s);
}
static void get_freq(String s) {
	Map<Character,Integer> hm=new HashMap<Character, Integer>();
	char arr[]=s.toCharArray();
	
	for(char c: arr) {
		if(Character.isLetter(c)) {
			hm.put(c, hm.getOrDefault(c,0)+1 );
		}
	}
	//display the freq of ecah character 
	
	for(Map.Entry<Character,Integer> entry :hm.entrySet()) {
		
		System.out.println(entry.getKey() +
				" Frequency "+entry.getValue());
	}
}

}
