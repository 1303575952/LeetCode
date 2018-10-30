package topics.string;

/**
 * 
 * @author FELIX
 *
 *         Question: Given a string s, find the longest palindromic substring in
 *         s. You may assume that the maximum length of s is 1000.
 * 
 *         Example 1: Input: "babad" Output: "bab" Note: "aba" is also a valid
 *         answer.
 * 
 *         Example 2: Input: "cbbd" Output: "bb"
 */
public class Q5_LongestPalindromicSubstring {
	public static void main(String[] args) {
		String str = "babad";
		System.out.println(new Q5_LongestPalindromicSubstring().getLongestPalindromicSubString(str));
	}

	public String getLongestPalindromicSubString(String str) {
		StringBuffer sb = new StringBuffer("");
		sb.append("#");
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));
			sb.append("#");
		}
		String newStr = sb.toString();
		String longestSubString = "";

		for (int i = 1; i < newStr.length() / 2 + 1; i++) {
			for (int j = 0; i - j >= 0;) {
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
