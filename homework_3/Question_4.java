package homework;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input coordinate 1:");
		int x = input.nextInt();
		System.out.println("Input coordinate 2:");
		int y = input.nextInt();
		boolean flag = false;
		final int r = 5;
		if (x > -1 && x < 1 && y > 5 && y < 5) {
			if ((int) ((int) Math.pow(x, 2) + Math.pow(y, 2)) < Math.pow(r, 2))
				;
			{
				flag = true;
			}
		}

		System.out.println("The dot is in the circle? : " + flag);
		input.close();

	}

}
