package homework2;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int choice = input.nextInt();
		while (choice < 0 || choice > 9) {
			System.out.println("The number must be between 0 and 9");
			System.out.print("Enter a number ");
			choice = input.nextInt();
		}
		switch (choice) {
		case 0:
			System.out.println("Нула");
			break;
		case 1:
			System.out.println("Едно");
			break;
		case 2:
			System.out.println("Две");
			break;
		case 3:
			System.out.println("Три");
			break;
		case 4:
			System.out.println("Четири");
			break;
		case 5:
			System.out.println("Пет");
			break;
		case 6:
			System.out.println("Шест");
			break;
		case 7:
			System.out.println("Седем");
			break;
		case 8:
			System.out.println("Осем");
			break;
		case 9:
			System.out.println("Девет");
			break;
		}
		input.close();
	}
}
