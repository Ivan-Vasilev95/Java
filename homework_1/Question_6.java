package homework;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter integer for the square : ");
		int x = input.nextInt();
		int choice;
		do {
			System.out.println("\nTo print empty square  press 1");
			System.out.println("To print the whole square  press 2");
			System.out.println("To change side of the square  press 3");
			System.out.println("For exit press 4");
			do {
				choice = input.nextInt();
				if (choice > 4)
					System.out.println("Please enter a choice between 1 and 4");
			} while ((choice < 1) || (choice > 4));

			switch (choice) {
			case 1: {
				for (int i = 1; i <= x; i++) {
					for (int j = 1; j <= x; j++) {
						if (i == 1 || j == 1 || i == x || j == x) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;
			}
			case 2: {
				for (int i = 0; i < x; i++) {
					System.out.println();
					for (int j = 0; j < x; j++)
						System.out.print("*");
				}
				break;
			}
			case 3:
				System.out.print("Enter integer for the square : ");
				x = input.nextInt();
				break;
			case 4:
				System.out.println("You closed the program");
				break;
			}
		} while (choice != 4);
		input.close();
	}
}