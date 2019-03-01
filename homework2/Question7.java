package homework2;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		boolean flag = false;
		
		while ((n >= 100) || (n < 0)) {
			if(n>=100)
				System.out.println("The number must be less then 100!");
			else if(n<0)
				System.out.println("The number must be positive!");
			System.out.println("Enter a number: ");
			n = input.nextInt();
		}
		
		input.close();
		
		if (n == 0 || n == 1) {
			System.out.println("" + n + " is not a prime number");
			flag=true;
		} else {
			for (int i = 2; i <=n-1; i++) {
				if (n % i == 0) {
					System.out.println(i);
					System.out.println(n + " is not prime number");
					flag = true;
					break;
				}
			}

		}
		if(flag==false)
			System.out.println(""+n+" is a prime number");
	}
}
