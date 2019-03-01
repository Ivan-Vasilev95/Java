package homework;
import java.util.Scanner;
public class Question_2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the height of rectangle: ");
		double a=input.nextDouble();
		while(a<=0) {
			System.out.print("The height can be 0 or less please enter valid height: ");
			a=input.nextDouble();
		}
		System.out.print("Enter the width of rectangle: ");
		double b=input.nextDouble();
		while(b<=0) {
			System.out.print("The width can be 0 or less please enter valid width: ");
			b=input.nextDouble();
		}
		input.close();
		double p=a*b;
		System.out.println("P of the rectangle is: "+p);
		double s=2*(a+b);
		System.out.println("S of the rectangle is: "+s);

	}

}
