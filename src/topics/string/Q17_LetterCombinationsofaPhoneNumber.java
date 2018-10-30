package topics.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author FELIX
 *
 *         Question:Given a string containing digits from 2-9 inclusive, return
 *         all possible letter combinations that the number could represent. A
 *         mapping of digit to letters (just like on the telephone buttons) is
 *         given below. Note that 1 does not map to any letters.
 * 
 *         Example: Input: "23" Output: ["ad", "ae", "af", "bd", "be", "bf",
 *         "cd", "ce", "cf"].
 * 
 *         Note: Although the above answer is in lexicographical order, your
 *         answer could be in any order you want.
 */
public class Q17_LetterCombinationsofaPhoneNumber {
	static HashMap<String, String> hashmap = new HashMap<String, String>();
	static {
		hashmap.put("2", "abc");
		hashmap.put("3", "def");
		hashmap.put("4", "ghi");
		hashmap.put("5", "jkl");
		hashmap.put("6", "mno");
		hashmap.put("7", "pqrs");
		hashmap.put("8", "tuv");
		hashmap.put("9", "wxyz");
	}

	public static void main(String[] args) {
		List<String> list = new Q17_LetterCombinationsofaPhoneNumber().letterCombination("23");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public List<String> letterCombination(String digits) {
		List<String> list = new ArrayList<String>();
		String p = hashmap.get(digits.substring(0, digits.length() - 1));
		String q = hashmap.get(digits.substring(1));
		for (int i = 0; i < p.length(); i++) {
			for (int j = 0; j < q.length(); j++) {
				String str = p.substring(i, i + 1) + q.substring(j, j + 1);
				list.add(str);
			}
		}
		return list;
	}
}
