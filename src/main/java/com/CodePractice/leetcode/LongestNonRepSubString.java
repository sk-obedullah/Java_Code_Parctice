package com.CodePractice.leetcode;

public class LongestNonRepSubString {

	public static void main(String[] args) {
		
		System.out.println(sol("pwwkew"));
	}
	
	public static int sol(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;i<str.length();j++) {
				char s1=str.charAt(i);
				char s2=str.charAt(j);
				if(s1==s2) {
					return str.substring(i,j).length();
				}
			}
		}
		return 0;
	}
}
