package topics.string;

/**
 * @author FELIX
 * <p>
 * Question: Given a string s, find the longest palindromic substring in
 * s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example 1: Input: "babad" Output: "bab" Note: "aba" is also a valid
 * answer.
 * <p>
 * Example 2: Input: "cbbd" Output: "bb"
 */
public class Q5_LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "abb";
        System.out.println(new Q5_LongestPalindromicSubstring().longestPalindrome(s));
    }

    /**
     * time complex is O(n^2)
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        StringBuffer sb = new StringBuffer("");
        sb.append("#");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append("#");
        }
        String newStr = sb.toString();
        String longestSubString = "";

        for (int i = 0; i < newStr.length(); i++) {
            for (int j = 0; i >= j && i + j < newStr.length(); ) {
                if (newStr.charAt(i - j) == newStr.charAt(i + j)) {
                    if ((2 * j + 1) > longestSubString.length()) {
                        longestSubString = newStr.substring(i - j, i + j + 1);
                    }
                    j++;
                } else {
                    break;
                }
            }
        }
        StringBuffer sbAns = new StringBuffer("");
        for (int i = 0; i < longestSubString.length(); i++) {
            if (newStr.charAt(i) != '#') {
                sbAns.append(longestSubString.charAt(i));
            }
        }
        return sbAns.toString();
    }
}
