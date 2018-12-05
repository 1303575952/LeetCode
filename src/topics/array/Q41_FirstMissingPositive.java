package topics.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author FELIX
 *
 *         Question:Given an unsorted integer array, find the smallest missing
 *         positive integer.
 * 
 *         Example 1: Input: [1,2,0] Output: 3
 * 
 *         Example 2: Input: [3,4,-1,1] Output: 2
 * 
 *         Example 3: Input: [7,8,9,11,12] Output: 1
 * 
 *         Note:Your algorithm should run in O(n) time and uses constant extra
 *         space.
 */
public class Q41_FirstMissingPositive {
	public static void main(String[] args) {
		int[] nums = { 3, 4, -1, 1 };
		System.out.println(new Q41_FirstMissingPositive().firstMissingPositive(nums));
	}

	/*
	 * O(n) time but not constant exsta space
	 */
	public int firstMissingPositive(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				set.add(nums[i]);
			}
		}
		int pNum = 1;
		while (true) {
			if (set.contains(pNum)) {
				pNum++;
			} else {
				return pNum;
			}
		}

	}
}
