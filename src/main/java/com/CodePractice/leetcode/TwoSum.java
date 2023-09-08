package com.CodePractice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums= {2,5,5,11};
		int target =10;
		int[] twoSum = twoSum(nums, target);
		System.out.println(twoSum);
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] op = new int[2];
		outer: for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					op[0] = i;
					op[1] = j;
					break outer;
				}
			}
		}
		return op;
	}
	

	public static int[] twoSumSol2(int[] nums, int target) {
		 Map<Integer, Integer> m=new HashMap<>();
		 for(int i=0;i<nums.length;i++) {
			 m.put(nums[i], i);
		 }
		 for(int i=0;i<nums.length;i++) {
			 int secondElm=target-nums[i];
			 if(m.containsKey(secondElm) && m.get(secondElm) != i) {
				 return new int[] {i,m.get(secondElm)};
			 }
		 }
		 return new int[] {};
	}
	
	public static int[] sol3(int[] nums ,int target) {
		Map<Integer,Integer> numIndex=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int n=target-nums[i];
			if(numIndex.containsKey(n)) {
				return new int[] {numIndex.get(nums[n]),i};
			}
			numIndex.put(nums[i], i);
		}
		return new int[] {};
	}
}








