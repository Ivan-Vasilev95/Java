package homework2;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number:");
		double number=input.nextDouble();
		if(number%2==0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
		input.close();
	}

}
