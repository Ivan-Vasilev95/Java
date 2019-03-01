package homework2;
import java.util.Scanner;
public class Question15 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a series of numbers");
		double largest=0;
		double smallest=0;
		while(input.hasNextDouble()) {
			System.out.println("Enter a number or something different from number to stop ");
			double temp=input.nextDouble();
			if(temp>largest) {
				largest=temp;
			}else if(temp<smallest) {
				smallest=temp;
			}
		}
		System.out.println("The largest number is "+largest);
		System.out.println("The smallest number is "+smallest);
		input.close();
	}

}
