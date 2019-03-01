package homework;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		int temp;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter integer a: ");
		int a = input.nextInt();

		System.out.println("Enter integer b: ");
		int b = input.nextInt();

		input.close();

		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		System.out.println("Number a = " + a);
		System.out.println("Number b = " + b);
	}

}
