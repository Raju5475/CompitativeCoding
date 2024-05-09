package com.compittative.com;


import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
    	//step 1-Create a hashmap
    	Map<Character,Integer> magzineFreq=new HashMap<Character, Integer>();
    	
    	//Iterate through the magnize string
    	
    	for(Character ch:magazine.toCharArray()) {
    		//Put the values in the map if it occurs again increment it by one.
    		magzineFreq.put(ch,magzineFreq.getOrDefault(ch,0)+1);
    	}
    	for(Character ch:ransomNote.toCharArray()) {
    		if(!magzineFreq.containsKey(ch)||magzineFreq.get(ch)==0) {
    			return false;
    		}
    		magzineFreq.put(ch,magzineFreq.get(ch)-1);
    	}
    	
    	
       return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));      // Output: false
        System.out.println(canConstruct("aa", "ab"));    // Output: false
        System.out.println(canConstruct("aa", "aab"));   // Output: true
    }
}

