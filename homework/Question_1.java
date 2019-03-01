package homework;
import java.util.Scanner;
public class Question_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radious: ");
		double r=input.nextDouble();
		while(r<=0) {
			System.out.println("R must be bigger then 0");
			r=input.nextDouble();
		}
		
		input.close();
		
		System.out.println("The radious is : "+r*2*3.14);
	}

}
