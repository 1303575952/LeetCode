package topics.math;

/**
 * 
 * @author FELIX
 *
 *         Question:Given two binary strings, return their sum (also a binary
 *         string).The input strings are both non-empty and contains only
 *         characters 1 or 0.
 * 
 *         Example 1: Input: a = "11", b = "1" Output: "100"
 * 
 *         Example 2: Input: a = "1010", b = "1011" Output: "10101"
 */
public class Q67_AddBinary {
	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";
		System.out.println(new Q67_AddBinary().addBinary(a, b));
	}

	public String addBinary(String a, String b) {
		Integer numA = Integer.parseInt(a, 2);
		Integer numB = Integer.parseInt(b, 2);
		Integer sum = numA + numB;
		return Integer.toBinaryString(sum);
	}
}
