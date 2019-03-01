package homework2;

import java.util.Scanner;

public class Question28 {

	public static void check(double array[], double input) {
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == input) {
				if (i == 0) {
					System.out.println("Ther number you are looking for is in first positon");
					if (array[i + 1] > input) {
						System.out.println("The next number is bigger then the one you entered");
						flag = true;
						break;
					} else {
						System.out.println("The next number is smaller then the one you entered");
						flag = true;
						break;
					}
				} else if (i == array.length - 1) {
					System.out.println("Ther number you are looking for is in last positon");
					if (array[i - 1] > input) {
						System.out.println("The previous number is bigger then the one you entered");
						flag = true;
						break;
					} else {
						System.out.println("The previous number is smaller then the one you entered");
						flag = true;
						break;
					}
				}
				if (i > 0 && i != array.length - 1) {
					if (array[i - 1] < input && array[i + 1] < input) {
						System.out.println("The number you entered is bigger then his neighbors");
						flag = true;
						break;
					} else if (array[i - 1] > input && array[i + 1] > input) {
						System.out.println("TThe number you entered is smaller then his neighbors");
						flag = true;
						break;
					} else {
						System.out.println("The number you entered is in between bigger and smaller number");
						flag = true;
						break;
					}
				}
			}
		}
		if (flag == false) {
			System.out.println("The number you entered is not in the array");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double array[];
		array = new double[5];
		double user_input;
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = input.nextDouble();
		}

		System.out.print("Enter the number you wish to check: ");
		user_input = input.nextDouble();
		input.close();
		check(array, user_input);
	}

}
