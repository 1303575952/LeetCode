package topics.sort;

import java.util.HashMap;

/**
 * 
 * @author FELIX
 *
 *         Question:Given two strings s and t , write a function to determine if
 *         t is an anagram of s.
 * 
 *         Example 1: Input: s = "anagram", t = "nagaram" Output: true
 * 
 *         Example 2: Input: s = "rat", t = "car" Output: false
 * 
 *         Note: You may assume the string contains only lowercase alphabets.
 * 
 *         Follow up: What if the inputs contain unicode characters? How would
 *         you adapt your solution to such case?
 */
public class Q242ValidAnagram {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(new Q242ValidAnagram().isAnagram(s, t));
	}

	public boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> mapS = new HashMap<Character, Integer>();
		HashMap<Character, Integer> mapT = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (mapS.containsKey(ch)) {
				mapS.put(ch, mapS.get(ch) + 1);
			} else {
				mapS.put(ch, 1);
			}
		}
		for (int i = 0; i < t.length(); i++) {
			Character ch = t.charAt(i);
			if (mapT.containsKey(ch)) {
				mapT.put(ch, mapT.get(ch) + 1);
			} else {
				mapT.put(ch, 1);
			}
		}
		return mapS.equals(mapT);
	}
}
