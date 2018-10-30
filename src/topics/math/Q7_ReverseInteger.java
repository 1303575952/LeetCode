package topics.math;

/**
 * 
 * @author FELIX
 * 
 *         Question: Given a 32-bit signed integer, reverse digits of an
 *         integer.
 * 
 *         Example 1: Input: 123 Output: 321
 * 
 *         Example 2: Input: -123 Output: -321
 * 
 *         Example 3: Input: 120 Output: 21
 */
public class Q7_ReverseInteger {
	public static void main(String[] args) {
		System.out.println(new Q7_ReverseInteger().reverse(-1230));
	}

	public int reverse(int x) {
		String str = String.valueOf(x);
		while (str.charAt(str.length() - 1) == '0') {
			str = str.substring(0, str.length() - 1);
		}
		if (str.contains("-")) {
			str = str.substring(1,str.length());
			str = reverseNo0OrNeg(str);
			return Integer.parseInt("-"+str);
		} else {
			return Integer.parseInt(reverseNo0OrNeg(str));
		}

	}

	public String reverseNo0OrNeg(String str) {
		StringBuffer sb = new StringBuffer("");
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
