package homework;
import java.util.Scanner;
public class Question_6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double a=input.nextDouble();
		System.out.println("Enter the second number: ");
		double b=input.nextDouble();
		
		input.close();
		
		if(a>0&&b>0)
			System.out.println("The number we get from "+a+" divided by "+b+" have is positive(+)");
		else if(a<0&&b<0)
			System.out.println("The number we get from "+a+" divided by "+b+" have is positive(+)");
		else if(a<0&&b>0)
			System.out.println("The number we get from "+a+" divided by "+b+" have is negative(-)");
		else if(a>0&&b<0)
			System.out.println("The number we get from "+a+" divided by "+b+" have is negative(-)");
			

	}

}
