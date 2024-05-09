package com.compittative.com;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnnagrams {
public static void main(String[] args) {
	String[] str= {"eat","tea","tan","ate","nat","bat"};
	List<List<String>> list = checkAnnagarms(str);
	System.out.println(list);
}
public static List<List<String>> checkAnnagarms(String[] str){
	Map<String,List<String>> hm=new HashMap<>();
	
	//check for the empty inputs
	if(str==null && str.length==0) {
		return new ArrayList<>();
	}
	//iterate through the string
	for(String strs :str) {
		
		String Frequencystring = getFrequencyString(strs);
		if(hm.containsKey(Frequencystring)) {
			
			hm.get(Frequencystring).add(strs);
			
		}else {
			//Create new list and add to it.
			List<String> strlist=new ArrayList();
			strlist.add(strs);
			// if we cannot find the freq just add to the map
			hm.put(Frequencystring, strlist);
		}
	}
	return new ArrayList<>(hm.values());
}

//Method to count the frequency

public static String getFrequencyString(String str) {
	
	int freq[]=new int[26];//frequency count
	
	//convert the string to charcater array and count the characters
	for(char c:str.toCharArray()) {
		
		freq[c-'a']++;
	}
	
	//Start storing the values
	StringBuilder freqcount=new StringBuilder();
	char c='a';
	for(int i:freq) {
		freqcount.append(c);
		freqcount.append(i);
		c++;
	}
	
	return freqcount.toString();
	
	
}

















}
