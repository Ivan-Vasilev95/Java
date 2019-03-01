package homework2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 4 digit integer: ");
		int number = input.nextInt();
		int length = (int) (Math.log10(number) + 1);
		input.close();

		while (length != 4) {
			System.out.print("Please Enter 4 digit integer: ");
			number = input.nextInt();
			length = (int) (Math.log10(number) + 1);
		}
		int sum = 0;
		int temp = number;
		for (int i = 0; i < 4; i++) {
			sum += temp % 10;
			temp /= 10;
		}

		System.out.println("The sum of all 4 digits is: " + sum);

		temp = number;
		int reversed = 0;
		for (int i = 0; i < 4; i++) {
			int digit = temp % 10;
			reversed = reversed * 10 + digit;
			temp /= 10;
		}
		System.out.println("The reversed number you entered is: " + reversed);

		temp = number;
		int last_digit_first;
		last_digit_first = temp % 10;
		temp /= 10;
		last_digit_first = last_digit_first * 1000 + temp;
		System.out.println("The number with the last digit becoming first: " + last_digit_first);

		int swap = number;
		char[] a = String.valueOf(swap).toCharArray();
		char tmp = a[1];
		a[1] = a[2];
		a[2] = tmp;
		swap = Integer.parseInt(new String(a));
		System.out.println("The number with 2nd and 3rd digit swaped: "+swap);
	}

}
