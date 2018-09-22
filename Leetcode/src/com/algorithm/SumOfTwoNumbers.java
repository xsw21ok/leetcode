package com.algorithm;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		SumOfTwoNumbers numbers = new SumOfTwoNumbers();
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = numbers.twoSum(nums, target);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
