package homework2;
import java.util.Scanner;
public class Question17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter K: ");
		double K=input.nextDouble();
		System.out.print("Enter N: ");
		double N=input.nextDouble();
		System.out.println("N*K/(N-K)= "+((N*K)/(N-K)));
		input.close();

	}

}
