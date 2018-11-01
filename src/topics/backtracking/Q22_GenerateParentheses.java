package topics.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author FELIX
 *
 *         Quetion:Given n pairs of parentheses, write a function to generate
 *         all combinations of well-formed parentheses.
 * 
 *         For example, given n = 3, a solution set is: [ "((()))", "(()())",
 *         "(())()", "()(())", "()()()" ]
 */
public class Q22_GenerateParentheses {
	public static void main(String[] args) {
		List<String> ans = new Q22_GenerateParentheses().generateParentheses(3);
		for(int i=0;i<ans.size();i++){
			System.out.println(ans.get(i));
		}
	}

	public List<String> generateParentheses(int n) {
		List<String> ans = new ArrayList<String>();
		backtrack(ans, "", 0, 0, 3);
		return ans;
	}

	public void backtrack(List<String> ans, String cur, int open, int close, int max) {
		if (cur.length() == max * 2) {
			ans.add(cur);
			return;
		}
		if (open < max) {
			backtrack(ans, cur + "(", open + 1, close, max);
		}
		if (close < open) {
			backtrack(ans, cur + ")", open, close + 1, max);
		}
	}
}
