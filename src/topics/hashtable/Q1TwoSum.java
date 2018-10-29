package topics.hashtable;

import java.util.HashMap;

/**
 * 
 * @author FELIX
 * 
 *         Question:Given an array of integers, return indices of the two
 *         numbers such that they add up to a specific target. You may assume
 *         that each input would have exactly one solution, and you may not use
 *         the same element twice.
 * 
 *         Example: Given nums = [2, 7, 11, 15], target = 9, Because nums[0] +
 *         nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class Q1TwoSum {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;
		int[] ans = new Q1TwoSum().getIndexOfTwoNums(arr, target);
		System.out.println(ans[0] + " " + ans[1]);
	}

	public int[] getIndexOfTwoNums(int[] arr, int target) {
		int[] ans = new int[2];
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			hashmap.put(arr[i], i);
		}
		for (int i = 0; i < arr.length; i++) {
			int key = target - arr[i];
			if (hashmap.get(key) != null) {
				ans[0] = i;
				ans[1] = hashmap.get(key);
				break;
			}
		}
		return ans;
	}
}
