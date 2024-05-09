package com.compittative.com;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
public static void main(String[] args) {
	String word1="abba";
	String word2="dog cat cat dog";
	System.out.println(isCorrect(word1, word2));
}
static boolean isCorrect(String word1,String word2) {
	Map<Character,String> hm=new HashMap<>();
	String[] words=word2.split(" +"); 
	 if (word1.length() != words.length) {
         return false;  // Different lengths, cannot have the same pattern.
     }
	for(int i=0;i<words.length;i++) {
		char a=word1.charAt(i);
		String currentWord=words[i];
		if(hm.containsKey(a)) {
			if(!hm.get(a).equals(currentWord)) {
				return false;
			}
		}else {
			if(hm.containsValue(currentWord)) {
				return false;
			}
			hm.put(a, currentWord);
		}
	}
	return true;
}
}
