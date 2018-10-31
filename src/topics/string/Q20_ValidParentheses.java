package topics.string;

import java.util.HashMap;
import java.util.Stack;

/**
 * 
 * @author FELIX
 *
 *         Given a string containing just the characters '(', ')', '{', '}', '['
 *         and ']', determine if the input string is valid. An input string is
 *         valid if: Open brackets must be closed by the same type of brackets.
 *         Open brackets must be closed in the correct order. Note that an empty
 *         string is also considered valid.
 * 
 *         Example 1: Input: "()" Output: true
 * 
 *         Example 2: Input: "()[]{}" Output: true
 * 
 *         Example 3: Input: "(]" Output: false
 * 
 *         Example 4: Input: "([)]" Output: false
 * 
 *         Example 5: Input: "{[]}" Output: true
 */
public class Q20_ValidParentheses {
	static HashMap<Character, Character> hashmap = new HashMap<Character, Character>();
	static {
		hashmap.put('(', ')');
		hashmap.put('[', ']');
		hashmap.put('{', '}');
	}

	public static void main(String[] args) {
		System.out.println(new Q20_ValidParentheses().isValid("{[]}"));
	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) != hashmap.get(stack.peek())) {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == hashmap.get(stack.peek())) {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
