package homework2;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double array[];
		array = new double[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = input.nextDouble();
		}
		input.close();

		int start = 0;
		int end = 0;

		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[i - 1]) {
				end = i + 1;
			} else if ( end <= start) {
				start++;
			}
		}

		if (start>end) {
			System.out.println("There is no sequence of the same number.");
		}
		for (int i = start; i < end; i++) {
			System.out.print(" " + array[i]);
		}
	}

}
