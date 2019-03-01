package homework;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = input.nextInt();
		input.close();

		
		for (int i = 1; i <= n; i++) {
			if (i % 3 != 0 && i % 7 != 0)
				System.out.print(" " + i);
		}
	}

}
