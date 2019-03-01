package homework;
import java.util.Scanner;
public class Question_14 {
	public static long fact(int i) {
		if (i == 1) {
			return 1;
		}
		return i * fact(i - 1);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = input.nextInt();
		input.close();
		long Cn = (fact(2 * num)) / (fact(num + 1) * fact(num));
		System.out.println("Catalan number :" + Cn);

	}

}
