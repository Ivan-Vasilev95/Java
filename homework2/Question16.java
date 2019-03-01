package homework2;
import java.util.Scanner;
public class Question16 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int number1=0;
		int number2=1;
		System.out.print("Enter a number: ");
		int n=input.nextInt();
		
		System.out.print(""+number1+" "+number2);
		for(int i=2;i<n;i++) {
			int number3=number1+number2;
			System.out.print(" "+number3);
			number1=number2;
			number2=number3;
		}
		input.close();
	}

}
