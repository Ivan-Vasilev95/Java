package homework2;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double biggest=0;
		for(int i=1;i<=5;i++) {
			System.out.print("Enter number "+i+": ");
			double a=input.nextDouble();
			if(biggest<a)
				biggest=a;
		}
		System.out.println("The biggest number is "+biggest);
		input.close();
	}

}
