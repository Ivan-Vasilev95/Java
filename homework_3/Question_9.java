package homework;
import java.util.Scanner;
public class Question_9 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter points: ");
		int points=input.nextInt();
		while(points<=0||points>9) {
			System.out.println("Invalid points!\nPoints must be between 1 and 9 ");
			System.out.print("Enter points: ");
			points=input.nextInt();
		}
		input.close();
		if(points>=1&&points<4) {
			points*=10;
			System.out.println("Your finale points are: "+points);
		}else if(points>=4&&points<7) {
			points*=100;
			System.out.println("Your finale points are: "+points);
		}else {
			points*=1000;
			System.out.println("Your finale points are: "+points);
		}

	}

}
