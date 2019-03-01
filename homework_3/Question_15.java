package homework;

import java.util.Scanner;

public class Question_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = input.nextInt();
		while(n>=20) {
			System.out.print("N must be less then 20!\nEnter N: ");
			n=input.nextInt();
		}
		input.close();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				int number = i + j;
				System.out.print(" "+number);

			}
		}
	}

}
