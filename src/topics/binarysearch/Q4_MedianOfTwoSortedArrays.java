package topics.binarysearch;

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
 * Example 2: nums1 = [1, 2] nums2 = [3, 4] The median is (2 + 3)/2 =2.5
 * <p>
 * 要求时间复杂度O(m+m)很容易，要求时间复杂度O(log(m+n))比较麻烦，参考https://mp.weixin.qq.com/s/FBlH7o-ssj_iMEPLcvsY2w
 */
public class Q4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        System.out.println(new Q4_MedianOfTwoSortedArrays().findMedianSortedArrays2(nums1, nums2));
    }

    /**
     * merge 2 arrays, then find the median of the merged array.
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
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

    /**
     * https://mp.weixin.qq.com/s/FBlH7o-ssj_iMEPLcvsY2w
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;
        //一个小技巧：将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k 。
        return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left) + getKth(nums1, 0, n - 1, nums2, 0, m - 1, right)) * 0.5;
    }

    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        //让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1
        if (len1 > len2) return getKth(nums2, start2, end2, nums1, start1, end1, k);
        if (len1 == 0) return nums2[start2 + k - 1];
        if (k == 1) return Math.min(nums1[start1], nums2[start2]);
        int i = start1 + Math.min(len1, k / 2) - 1;
        int j = start2 + Math.min(len2, k / 2) - 1;
        if (nums1[i] > nums2[j]) {
            return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
        } else {
            return getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
        }
    }
}
