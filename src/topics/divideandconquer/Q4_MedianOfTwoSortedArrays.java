package topics.divideandconquer;

/**
 * @author FELIX
 * <p>
 * Question: There are two sorted arrays nums1 and nums2 of size m and n
 * respectively. Find the median of the two sorted arrays. The overall
 * run time complexity should be O(log (m+n)). You may assume nums1 and
 * nums2 cannot be both empty.
 * <p>
 * Example 1: nums1 = [1, 3] nums2 = [2] The median is 2.0
 * <p>
 * Example 2: nums1 = [1, 2] nums2 = [3, 4] The median is (2 + 3)/2 =
 * 2.5
 */
public class Q4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        System.out.println(new Q4_MedianOfTwoSortedArrays().findMedianSortedArrays(nums1, nums2));
    }

    /**
     * merge 2 arrays, then find the median of the merged array.
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int i = 0, j = 0;
        int p = 0;
        for (; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] <= nums2[j]) {
                nums[p] = nums1[i];
                p++;
                i++;
            } else {
                nums[p] = nums2[j];
                p++;
                j++;
            }
        }
        if (i < nums1.length) {
            for (; i < nums1.length; i++) {
                nums[p] = nums1[i];
                p++;
            }
        }
        if (j < nums2.length) {
            for (; j < nums2.length; j++) {
                nums[p] = nums2[j];
                p++;
            }
        }

        if (p % 2 == 1) {
            return (double) nums[p / 2];
        } else {
            return ((double) nums[(p - 1) / 2] + (double) nums[p / 2]) / 2.0;
        }
    }
}
