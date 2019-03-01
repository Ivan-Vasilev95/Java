package homework;
import java.math.BigInteger;
import java.util.Scanner;
public class Question_30 {

	public static void fact(int x) {
	       BigInteger num = BigInteger.ONE;
	        for(int i=2; i<=x; i++){
	            num = num.multiply(BigInteger.valueOf(i));
	        }
	        System.out.print(num);
	    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = input.nextInt();
		while (n < 1 || n > 100) {
			System.out.println("N must be between 1 and 100!");
			System.out.print("Enter N: ");
			n = input.nextInt();
		}
		input.close();
		System.out.print("N!= ");
		fact(n);
	}

}
