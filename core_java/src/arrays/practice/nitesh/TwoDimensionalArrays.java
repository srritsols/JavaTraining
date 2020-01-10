package arrays.practice.nitesh;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		int[][] matrix;
		matrix = new int[4][5];
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 5; col++) {
				matrix[row][col] = row + col;
			}
			
		}
	}

}
