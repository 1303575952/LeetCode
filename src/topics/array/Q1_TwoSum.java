package topics.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author FELIX
 * <p>
 * Question:Given an array of integers, return indices of the two
 * numbers such that they add up to a specific target. You may assume
 * that each input would have exactly one solution, and you may not use
 * the same element twice.
 * <p>
 * Example: Given nums = [2, 7, 11, 15], target = 9, Because nums[0] +
 * nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class Q1_TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 3};
        int target = 6;
        int[] ans = new Q1_TwoSum().twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int another = target - arr[i];
            if (map.containsKey(another)) {
                ans[0] = i;
                ans[1] = map.get(another);
                if (ans[0] != ans[1]) {
                    break;
                }
            }
        }
        return ans;
    }
}
