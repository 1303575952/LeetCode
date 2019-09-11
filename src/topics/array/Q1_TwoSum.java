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
 * <p>
 * 思路：
 * 要注意的是返回数组中存的是元素的下标，且下标按从小到大存放
 * 借助HashMap，代码中先把数据全部放入HashMap中是为了保证最终结果数组中数据的有序性，
 * 可以假想一下，每存放一个元素先在HashMap中查相应相减的数据是否存在会发生什么情况。
 */
public class Q1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        int[] ans = new Q1_TwoSum().twoSum(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
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
