package homework2;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		while (n <= 0) {
			if (n < 0)
				System.out.println("Enter a positive number!");
			if(n==0)
				System.out.println("Enter number that is more then 0!");

			System.out.print("Enter an integer: ");
			n = input.nextInt();
		}
		input.close();
		for(int i=1;i<=n;i++) {
			System.out.print(""+i+" ");
		}
	}

}
