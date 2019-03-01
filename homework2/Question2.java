package homework2;

import java.util.Scanner;

public class Question2 {

	public static boolean checkfunction(double number) {

		if (number % 5 == 0 && number % 7 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number = input.nextDouble();
		
		if (checkfunction(number))
			System.out.println("Chisloto se deli bez ostatuk");

		else
			System.out.println("Chisloto se deli s ostatuk");
		input.close();
	}
	

}
