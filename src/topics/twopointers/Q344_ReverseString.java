package topics.twopointers;

/**
 * 
 * @author FELIX
 *
 *         Question:Write a function that takes a string as input and returns
 *         the string reversed.
 * 
 *         Example 1: Input: "hello" Output: "olleh"
 * 
 *         Example 2: Input: "A man, a plan, a canal: Panama" Output:
 *         "amanaP :lanac a ,nalp a ,nam A"
 */
public class Q344_ReverseString {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(new Q344_ReverseString().reverseString(s));
	}

	public String reverseString(String s) {
		StringBuffer sb = new StringBuffer("");
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
