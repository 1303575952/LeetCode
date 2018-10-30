package topics.hashtable;

import java.util.HashSet;

/**
 * 
 * @author FELIX
 *
 *         Question: Given a string, find the length of the longest substring
 *         without repeating characters.
 * 
 *         Example 1: Input: "abcabcbb" Output: 3 Explanation: The answer is
 *         "abc", with the length of 3.
 * 
 *         Example 2: Input: "bbbbb" Output: 1 Explanation: The answer is "b",
 *         with the length of 1.
 * 
 *         Example 3: Input: "pwwkew" Output: 3 Explanation: The answer is
 *         "wke", with the length of 3. Note that the answer must be a
 *         substring, "pwke" is a subsequence and not a substring.
 */
public class Q3LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		String str = "bcbcabb";
		System.out.println(new Q3LongestSubstringWithoutRepeatingCharacters().lengthOfNoRepeating(str));
	}
	public int lengthOfNoRepeating(String str) {
		int len = 1;
		HashSet<Character> hashset = new HashSet<Character>();
		int i=0,j=i+1;
		hashset.add(str.charAt(i));
		for(;j<str.length();){
			if(str.charAt(i)!=str.charAt(j)){
				hashset.add(str.charAt(j));
				j++;
			}else{
				i++;
				j++;
			}
			len = Math.max(len, hashset.size());
		}
		return len;
	}
}
