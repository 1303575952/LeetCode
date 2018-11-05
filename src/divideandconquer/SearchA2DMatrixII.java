package divideandconquer;

/**
 * 
 * @author FELIX
 *
 *         Question:Write an efficient algorithm that searches for a value in an
 *         m x n matrix. This matrix has the following properties: Integers in
 *         each row are sorted in ascending from left to right. Integers in each
 *         column are sorted in ascending from top to bottom.
 * 
 *         Example: Consider the following matrix: [ [1, 4, 7, 11, 15], [2, 5,
 *         8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26,
 *         30] ] Given target = 5, return true. Given target = 20, return false.
 */
public class SearchA2DMatrixII {

	public static void main(String[] args) {
		int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int value = 16;
		System.out.println(new SearchA2DMatrixII().searchMatrix(arr, value));
	}

	public boolean searchMatrix(int[][] arr, int value) {
		int i = arr.length - 1;
		int j = 0;
		boolean isExist = false;
		while (i >= 0 && j < arr[0].length) {
			if (arr[i][j] > value) {
				i--;
			} else if (arr[i][j] < value) {
				j++;
			} else {
				isExist = true;
				break;
			}
		}
		return isExist;
	}
}
