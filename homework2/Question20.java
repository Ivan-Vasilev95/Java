package homework2;

import java.util.Scanner;
import java.util.Arrays;

public class Question20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double array1[];
		array1 = new double[3];
		double array2[];
		array2 = new double[3];

		for (int i = 0; i < array1.length; i++) {
			System.out.print("Enter elemet " + i + " for the first array: ");
			array1[i] = input.nextDouble();
			System.out.print("Enter elemet " + i + " for the second array array: ");
			array2[i] = input.nextDouble();
		}
		input.close();
		System.out.println("is arr1 equals to arr2 : " + Arrays.equals(array1, array2));
	}

}
