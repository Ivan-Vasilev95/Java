package homework2;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		boolean flag = false;
		Scanner input = new Scanner(System.in);
		double array[];
		array = new double[3];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = input.nextDouble();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j >= 0; j--) {
				if (array[i] + array[j] == 0) {
					System.out.println("Number " + array[i] + " + " + "Number " + array[j] + " = 0");
					flag = true;
				}

			}
		}
		if (flag == false) {
			System.out.println("There is no number that combine are equal to 0");
		}
		input.close();
	}

}
