package homework;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		double a = input.nextDouble();
		System.out.println("Enter second number");
		double b = input.nextDouble();
		System.out.println("Enter the third number");
		double c = input.nextDouble();

		input.close();

		if (a == b && a == c) {
			System.out.println("The numbers are the same");
		} else if (a >= b && a >= c) {
			if (a == b)
				System.out.println("" + a + "=" + b + " and are bigger then " + c);
			else if (a == c)
				System.out.println("" + a + "=" + c + " and are bigger then " + b);
			else
				System.out.println("" + a + " is the biggest number");
		} else if (b > a && b > c) {
			System.out.println("" + b + " is the biggest number");
		} else if (c >= a && c >= b) {
			if (c == b)
				System.out.println("" + c + "=" + b + " and are bigger then " + a);
			else
				System.out.println("" + c + " is the biggest number");
		}

	}

}
