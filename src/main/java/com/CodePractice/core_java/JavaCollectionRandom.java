package com.CodePractice.core_java;

import java.util.HashMap;
import java.util.Map;

public class JavaCollectionRandom {

	
	public static void main(String[] args) {
		
		/*
		 * In Java, when you use a StringBuilder as a key in a HashMap, the key is
		 * actually based on the reference to the StringBuilder object, not its content.
		 * This means that if you modify the content of the StringBuilder after it has
		 * been used as a key in the map, it won't affect the map's ability to retrieve
		 * the associated value using that modified StringBuilder
		 */
		Map<StringBuilder,Integer> map=new HashMap<>();
		StringBuilder str=new StringBuilder();
		str.append("abc");
		map.put(str, 1);
		str.append("ABC");
		System.out.println(map.get(str));
		
		//-----------------------------//
		

		/*
		 * In Java, you can use primitive values in collections like HashMap by relying
		 * on autoboxing and unboxing. Autoboxing is the automatic conversion of
		 * primitive data types to their corresponding wrapper classes (e.g., int to
		 * Integer) when needed, and unboxing is the automatic conversion of wrapper
		 * classes back to primitive types.
		 */	
		Map<StringBuilder,Integer> map1=new HashMap<>();
		map1.put(str, 1);
		Map<StringBuilder,Boolean> map2=new HashMap<>();
		map2.put(str, true);
		Map<StringBuilder,Double> map3=new HashMap<>();
		map3.put(str, 1.2);
		
		
		
	}
}












