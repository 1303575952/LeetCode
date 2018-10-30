package topics.string;

/**
 * 
 * @author FELIX
 *
 *         Write a function to find the longest common prefix string amongst an
 *         array of strings. If there is no common prefix, return an empty
 *         string "".
 * 
 *         Example 1: Input: ["flower","flow","flight"] Output: "fl"
 * 
 *         Example 2: Input: ["dog","racecar","car"] Output: "" Explanation:
 *         There is no common prefix among the input strings.
 * 
 *         Note: All given inputs are in lowercase letters a-z.
 */
public class Q14_LongestCommonPrefix {
	public static void main(String[] args) {
		String[] arr = {"flower","flow","flight"};
		System.out.println(new Q14_LongestCommonPrefix().commonPrefixInArr(arr));
	}
	public String commonPrefixInArr(String[] arr){
		String commonStr = arr[0];
		for(int i=1;i<arr.length;i++){
			commonStr = commonPrefixInTwoString(commonStr, arr[i]);
		}
		return commonStr;
	}
	public String commonPrefixInTwoString(String str1,String str2){
		int index = 0;
		for(;index<str1.length()&&index<str2.length();index++){
			if(str1.charAt(index)!=str2.charAt(index)){
				break;
			}
		}
		return str1.substring(0, index);
	}
}
