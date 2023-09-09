package com.CodePractice.core_java;

public class Java_String_StringBuffer_StringBuilder {

	public static void main(String[] args) {
		// Reverse a string ways

		String str = "apple";

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();

		// App-2

		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}

		// String Formatter Cap 1st letter of each word
		capitalizeWord("this my string");
		//convert each words first letter to Uppercase in a string;
		System.out.println(capitalizeWord("hello there"));

	}

	// Check a String is Palindrome or not
	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * str.split("\\s"); is used to split a string str into an array of words based
	 * on whitespace characters (spaces, tabs, and line breaks).
	 */
	public static String capitalizeWord(String str) {
		String capWordsStr="";
		String words[] = str.split("\\s");
		for (String string : words) {
			String firstLetter = string.substring(0,1);
			String restWord=string.substring(1);
			capWordsStr+=firstLetter.toUpperCase()+restWord+" ";
		}
		return capWordsStr;
	}

}
