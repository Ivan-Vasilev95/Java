package homework2;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=input.nextInt();
		number=number/100;
		if((number%10)==7)
			System.out.println("The 3rd position from left to right is 7");
		else
			System.out.println("The 3rd position from left to right is not 7");

		input.close();
	}

}
