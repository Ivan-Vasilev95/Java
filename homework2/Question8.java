package homework2;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number a: ");
		double a=input.nextDouble();
		System.out.print("Enter number b: ");
		double b=input.nextDouble();
		
		System.out.println((a > b)?  ""+a+" is greater than "+b: ""+b+ " is greater than "+a);
		input.close();
	}

}
