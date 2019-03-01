package homework2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int r=5;
		System.out.print("Enter x: ");
		double x=input.nextDouble();
		System.out.print("Enter y: ");
		double y=input.nextDouble();
		if((Math.pow(x,2)+Math.pow(y,2))<Math.pow(r,2))
		    System.out.println("Its in the circle");
		else
			System.out.println("Its not in the circle");

		input.close();
	}

}
