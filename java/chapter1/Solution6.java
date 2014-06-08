/**
 * Rotate a matrix clockwise.
 */
public class Solution6 {
	/**
	 * Solution:
	 * We can use standard Matrix Rotation algorithm.
	 */
	public static int[][] rotateClockwise(int[][] matrix) {
	 	final int M = matrix.length;
	 	final int N = matrix[0].length;

	 	if (M < 0 || N < 0) {
	 		throw new IllegalArgumentException();
	 	}

	 	int[][] result = new int[N][M];
	 	for (int r = 0; r < M; r++) {
	 		for (int c = 0; c < N; c++) {
	 			result[c][M - 1 - r] = matrix[r][c];
	 		}
	 	}

	 	return result;
	}

	private static void printMatrix(int[][] matrix) {
		System.out.println("Matrix = ");
		for (int[] row: matrix) {
			System.out.println(java.util.Arrays.toString(row));
		}
	}

	public static void main(String[] args){
	    int[][] mat = {
	        { 1, 2},
	        { 4, 5}
	    };
	    printMatrix(mat);
	    // Matrix = 
	    // [1, 2, 3]
	    // [4, 5, 6]
	    int[][] result = rotateClockwise(mat);
	    printMatrix(result);
	}
}