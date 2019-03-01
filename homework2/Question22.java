package homework2;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int n = input.nextInt();
		double array[];
		array = new double[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter a number");
			array[i] = input.nextDouble();
		}
		input.close();
		double largestA = 0;
		double largestB = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largestA) {
				largestB = largestA;
				largestA = array[i];
			} else if (array[i] > largestB && array[i] != largestA) {
				largestB = array[i];
			}
		}
		double sum_of_largest=largestA+largestB;
		System.out.println("The two largest numbers are A: "+largestA+" and B: "+largestB+" and there sum is :"+sum_of_largest);
	}

}
