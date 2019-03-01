package homework2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = input.nextDouble();
		while (a <= 0) {
			System.out.println("a must be bigger then 0");
			a = input.nextDouble();
		}
		System.out.print("Enter b: ");
		double b = input.nextDouble();
		while (b <= 0) {
			System.out.println("b must be bigger then 0");
			b = input.nextDouble();
		}
		System.out.print("Enter h: ");
		double h = input.nextDouble();
		while (h <= 0) {
			System.out.println("h must be bigger then 0");
			h = input.nextDouble();
		}
		input.close();
		System.out.println("P=" + ((a + b) / 2) * h);
	}

}
