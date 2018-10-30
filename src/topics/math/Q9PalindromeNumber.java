package topics.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author FELIX
 *
 *         Question: Determine whether an integer is a palindrome. An integer is
 *         a palindrome when it reads the same backward as forward.
 * 
 *         Example 1: Input: 121 Output: true
 * 
 *         Example 2: Input: -121 Output: false Explanation: From left to right,
 *         it reads -121. From right to left, it becomes 121-. Therefore it is
 *         not a palindrome.
 * 
 *         Example 3: Input: 10 Output: false Explanation: Reads 01 from right
 *         to left. Therefore it is not a palindrome.
 * 
 *         Follow up: Coud you solve it without converting the integer to a
 *         string?
 */
public class Q9PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(new Q9PalindromeNumber().isPalindrome(121));
	}
	public boolean isPalindrome(int num){
		List<Integer> list = new ArrayList<Integer>();
		if(num<0){
			return false;
		}
		int divider = 10;
		while(num%divider>0){
			list.add(num%divider);
			num = (num - num%divider)/10;
		}
		boolean ans = true;
		for(int i=0;i<list.size()/2;i++){
			if(list.get(i)!=list.get(list.size()-i-1)){
				ans = false;
				break;
			}
		}
		return ans;
	}
}
