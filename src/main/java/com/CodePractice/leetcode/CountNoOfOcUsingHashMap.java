package com.CodePractice.leetcode;

import java.util.HashMap;
import java.util.Map;

//count the number of occurance of a word in a string using hashMap
public class CountNoOfOcUsingHashMap {
	public static void main(String[] args) {
		String str = "pubFirst of all, we have declared our string variable called str. Then we have used split() \r\n"
				+ "function delimited by single space so that we can split multiple words in a string\r\n"
				+ "Thereafter, we have declared HashMap and iterated using for loop. Inside for loop, \r\n"
				+ "we have an if-else statement in which wherever at a particular position, the map contains a key, \r\n"
				+ "we set the counter at that position and add the object to the map";

		String[] split = str.split(" ");
		
		Map<String,Integer> m=new HashMap<>();
		System.out.println(split.length);
		for(String st:split) {
			if(m.containsKey(st)) {

				int count=m.get(st)+1;
				m.put(st, count);
			}else {
				m.put(st, 1);
			}
		}
		System.out.println(m);
	}
}