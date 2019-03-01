package homework;

import java.util.Scanner;

public class Question_19 {

	public static void main(String[] args) {
		int arr[] = { 7, 4, 3, 20, 2, 11, 15, 9, 3 };
		Scanner input = new Scanner(System.in);
		System.out.print("The complete array is: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(" " + arr[i]);

		System.out.println("\nEnter a number: ");
		int s = input.nextInt();
		input.close();
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == s) {
				System.out.println("\nThe number you entered is in the array: " + arr[i]);
				flag = true;
			} else {
				int temp = arr[i];
				for (int j = i+1; j < arr.length; j++) {
					temp += arr[j];
					if (temp == s) {
						System.out.print("This elemets of the array combine equal the number you entered: ");
						for (int t = i; t <= j; t++)
							System.out.print(" " + arr[t]);
						flag = true;
					}
				}
			}
		}
		if (flag == false)
			System.out.println("There is no combination of numbers the are equal to the number you entered");

	}

}
