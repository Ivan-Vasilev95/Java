package homework;
import java.util.Scanner;
public class Question_2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter number: ");
		double a=input.nextDouble();
		
		System.out.print("Enter number: ");
		double b=input.nextDouble();
		
		input.close();
		
		if(a<b)
			System.out.println(b);
		else
			System.out.println(a);
	}

}
