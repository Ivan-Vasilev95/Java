package homework;
import java.util.Scanner;
public class Question_3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the gravity of Earth: ");
		double g=input.nextDouble();
		while(g<=0) {
			System.out.print("The gravity cant be 0 or less enter valid gravity: ");
			g=input.nextDouble();
		}
		input.close();
		double moon=(17*g)/100;
		System.out.println("The gravity of moon is: "+moon);
	}

}
