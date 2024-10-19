package com.ashish;

import java.util.HashMap;
import java.util.Map;

public class CharOccurence {
	public static void main(String[] args) {
		String s ="Ramashish".toLowerCase();
		
		HashMap<Character, Integer> map = new  HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
				map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
