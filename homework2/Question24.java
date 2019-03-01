package homework2;

public class Question24 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("  " + matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("Matrix printed[3][3]");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("  " + matrix[i][j]);
			}
			System.out.println();
		}
	}

}
