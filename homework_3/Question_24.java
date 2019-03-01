package homework;

import java.util.Scanner;

public class Question_24 {

	public static void main(String[] args) {
		int matrix[][] = { { 20, 1, 22, 20 }, { 1, 18, 18, 21 }, { 16, 18, 18, 18 }, { 18, 12, 15, 24 } };

		System.out.println("The matrix");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}

		System.out.print("Enter number: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();

		boolean flag = false;
		for (int z = 0; z < matrix.length; z++) {
			for (int x = 0; x < matrix.length; x++) {
				if (matrix[z][x] == n) {
					if ((z > 0 && z < matrix.length) && (x > 0 && x < matrix.length)) {
						if (matrix[z][x] == matrix[z - 1][x] || matrix[z][x] == matrix[z + 1][x]
								|| matrix[z][x] == matrix[z][x - 1] || matrix[z][x] == matrix[z][x + 1])
							System.out.print(matrix[z][x] + "\t");
					} else if (z == 0) {
						if (x == 0)
							if (matrix[z][x] == matrix[z + 1][x] || matrix[z][x] == matrix[z][x + 1]
									|| matrix[z][x] == matrix[z + 1][x])
								System.out.print(matrix[z][x] + "\t");
							else if (x == matrix.length)
								if (matrix[z][x] == matrix[z + 1][x] || matrix[z][x] == matrix[z][x - 1]
										|| matrix[z][x] == matrix[z - 1][x])
									System.out.print(matrix[z][x] + "\t");
					} else if (z == matrix.length) {
						if (x == 0)
							if (matrix[z][x] == matrix[z - 1][x] || matrix[z][x] == matrix[z][x + 1]
									|| matrix[z][x] == matrix[z + 1][x])
								System.out.print(matrix[z][x] + "\t");
							else if (x == matrix.length)
								if (matrix[z][x] == matrix[z - 1][x] || matrix[z][x] == matrix[z][x - 1]
										|| matrix[z][x] == matrix[z - 1][x])
									System.out.print(matrix[z][x] + "\t");
					}
					flag = true;
				}
			}
			System.out.println();
		}
		if (flag == false)
			System.out.println("The number you entered is not found in the matrix");

	}

}
