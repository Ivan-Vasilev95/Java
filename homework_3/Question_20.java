package homework;

import java.util.Scanner;

public class Question_20 {

	public static void matrix_a(int n) {
		int matrix_a[][] = new int[n][n];
		int value = 1;
		int minCol = 0;
		int minRow = 0;
		int maxRow = n - 1;
		while (value <= n * n) {
			for (int i = minRow; i <= maxRow; i++) {
				matrix_a[i][minCol] = value;
				value++;
			}
			minCol++;
		}
		System.out.println("Matrix A");
		for (int i = 0; i < matrix_a.length; i++) {
			for (int j = 0; j < matrix_a.length; j++)
				System.out.print(matrix_a[i][j] + "\t");
			System.out.println();
		}
	}

	public static void matrix_b(int n) {
		int matrix_b[][] = new int[n][n];
		int value = 1;
		int minCol = 0;
		int minRow = 0;
		int maxRow = n - 1;
		while (value <= n * n) {
			for (int i = minRow; i <= maxRow; i++) {
				matrix_b[i][minCol] = value;
				value++;
			}
			minCol++;
			for (int i = maxRow; i >= minRow; i--) {
				matrix_b[i][minCol] = value;
				value++;
			}
			minCol++;
		}
		System.out.println("Matrix B");
		for (int i = 0; i < matrix_b.length; i++) {
			for (int j = 0; j < matrix_b.length; j++)
				System.out.print(matrix_b[i][j] + "\t");
			System.out.println();
		}
	}

	public static void matrix_c(int n) {
		int matrix_c[][] = new int[n][n];

        int side = matrix_c.length;
        int coordX = side - 1;
        int coordY = 0;
        for (int counter = 1; counter <= side * side; counter++)
        {
            matrix_c[coordX][coordY] = counter;
            int nextX = coordX + 1;
            int nextY = coordY + 1;
            if (nextX == side && nextY != side)
            {
                coordX = (side - coordY - 2);
                coordY = 0;
            }
            else if (nextY == side)
            {
                coordY = (side - coordX);
                coordX = 0;
            }
            else
            {
                coordX = nextX;
                coordY = nextY;
            }
        }	

	System.out.println("Matrix C");for(

	int i = 0;i<matrix_c.length;i++)
	{
		for (int j = 0; j < matrix_c.length; j++)
			System.out.print(matrix_c[i][j] + "\t");
		System.out.println();
	}
	}

	public static void matrix_d(int n) {
		int matrix_d[][] = new int[n][n];
		int value = 1;
		int minCol = 0;
		int maxCol = n - 1;
		int minRow = 0;
		int maxRow = n - 1;
		while (value <= n * n) {
			for (int i = minRow; i <= maxRow; i++) {
				matrix_d[i][minCol] = value;
				value++;
			}
			for (int i = minCol + 1; i <= maxCol; i++) {
				matrix_d[maxRow][i] = value;
				value++;
			}
			for (int i = maxRow - 1; i >= minRow; i--) {
				matrix_d[i][maxCol] = value;
				value++;
			}
			for (int i = maxCol - 1; i >= minCol + 1; i--) {
				matrix_d[minRow][i] = value;
				value++;
			}
			minCol++;

			minRow++;

			maxCol--;

			maxRow--;
		}
		System.out.println("Matrix D");
		for (int i = 0; i < matrix_d.length; i++) {
			for (int j = 0; j < matrix_d.length; j++)
				System.out.print(matrix_d[i][j] + "\t");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter N: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		matrix_a(n);
		System.out.println();
		matrix_b(n);
		System.out.println();
		matrix_c(n);
		System.out.println();
		matrix_d(n);
	}
}
