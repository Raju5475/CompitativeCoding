package com.compittative.com;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
public static void main(String[] args) {
	String s="egg";
	String t="odd";
	System.out.println(isIsomorphic(s, t));
}
static boolean isIsomorphic(String s,String t) {
	Map<Character,Character> map=new HashMap<>();
	
	for(int i=0;i<s.length();i++) {
		if(map.containsKey(s.charAt(i))) {
			//check the it is equal or not 
			if(!map.get(s.charAt(i)).equals(t.charAt(i))) {
				return false;
			}
		}else {
			//check the particular key is already mapped with other element or not
			if(map.containsValue(t.charAt(i))) {
			}
			map.put(s.charAt(i),t.charAt(i));
		}
	}
	return true;	
}

}