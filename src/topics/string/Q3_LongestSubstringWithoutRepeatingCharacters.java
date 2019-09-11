package topics.string;

import java.util.HashSet;

/**
 * @author FELIX
 * <p>
 * Question: Given a string, find the length of the longest substring
 * without repeating characters.
 * <p>
 * Example 1: Input: "abcabcbb" Output: 3 Explanation: The answer is
 * "abc", with the length of 3.
 * <p>
 * Example 2: Input: "bbbbb" Output: 1 Explanation: The answer is "b",
 * with the length of 1.
 * <p>
 * Example 3: Input: "pwwkew" Output: 3 Explanation: The answer is
 * "wke", with the length of 3. Note that the answer must be a
 * substring, "pwke" is a subsequence and not a substring.
 * <p>
 * 通过HashSet中元素不可重复做
 */
public class Q3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "bbbbb";
        System.out.println(new Q3_LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(str));
    }

    public int lengthOfLongestSubstring(String s) {
        int length = 1;
        if (s.length() == 0 || s == null) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        HashSet<Character> hashSet = new HashSet<>();
        hashSet.add(s.charAt(0));
        hashSet.add(s.charAt(1));
        for (int p = 0, q = 1; ; ) {
            if (hashSet.size() == (q - p + 1)) {
                length = hashSet.size() > length ? hashSet.size() : length;
                q++;
            } else if (hashSet.size() < (q - p + 1)) {
                hashSet.remove(s.charAt(p));
                p++;
            }
            if (q < s.length()) {
                hashSet.add(s.charAt(q));
            } else {
                break;
            }
        }
        return length;
    }
}
