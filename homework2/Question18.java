package homework2;
import java.util.Scanner;
public class Question18 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		double n=input.nextDouble();
		double random = Math.random() * n + 1;
		input.close();
		System.out.println("Random number between 1 and "+n+" :"+random);
	}

}
