package topics.string;

import java.util.Stack;

/**
 * 
 * @author FELIX
 *
 *         Given a string containing just the characters '(' and ')', find the
 *         length of the longest valid (well-formed) parentheses substring.
 * 
 *         Example 1: Input: "(()" Output: 2 Explanation: The longest valid
 *         parentheses substring is "()"
 * 
 *         Example 2: Input: ")()())" Output: 4 Explanation: The longest valid
 *         parentheses substring is "()()"
 */
public class Q32_LongestValidParentheses {
	public static void main(String[] args) {
		System.out.println(new Q32_LongestValidParentheses().longestValidParentheses0(")()())"));
	}

	/*
	 * Using Stack
	 */
	public int longestValidParentheses0(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(str.charAt(i));
			} else if (stack.peek() == '(' && str.charAt(i) == ')') {
				stack.pop();
			} else {
				stack.push(str.charAt(i));
			}
		}
		return str.length() - stack.size();
	}
}
