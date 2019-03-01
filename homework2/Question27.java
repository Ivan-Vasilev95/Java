package homework2;

import java.util.Scanner;

public class Question27 {

	public static int counter(double array[], double user_input) {
		int count=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == user_input) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		double user_input;
		double array[];
		array = new double[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = input.nextDouble();
		}
		System.out.print("Enter the number you wish to look for: ");
		user_input = input.nextDouble();
		input.close();

		count = counter(array, user_input);
		System.out.println("The number you entered is found " + count + " times");
	}

}
