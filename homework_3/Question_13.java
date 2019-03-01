package homework;
import java.util.Scanner;
public class Question_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N=input.nextInt();
		input.close();
		int S=1;
		for(int i=1; i<=N; i++)
		{
			S+=(i*=i)/(Math.pow(i, i));
		}
		System.out.print("The result is: " + S);

	}

}
