package homework2;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = input.nextDouble();
		System.out.print("Enter b: ");
		double b = input.nextDouble();
		System.out.print("Enter c: ");
		double c = input.nextDouble();
		input.close();
		double root1, root2;

		double determinant = b * b - 4 * a * c;

		if (determinant > 0) {
			root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root2 = (-b - Math.sqrt(determinant)) / (2 * a);
			System.out.println("Root 1: " + root1 + "\nRoot 2: " + root2);
		} else if (determinant == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.print("\nRoot 1 = Root 2 " + root1);
		} else {
			System.out.println("The equation has no real roots");
        }
	}

}
