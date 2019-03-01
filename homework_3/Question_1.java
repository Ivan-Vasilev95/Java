package homework;
import java.util.Scanner;
public class Question_1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter integer: ");
		int number=input.nextInt();
		String temp=Integer.toString(number);
		input.close();
		
		if(temp.length()<3)
			System.out.println("The number dont have third symbol");
		else
			if(temp.charAt(2)=='7')
				System.out.println("The third symbol of the number is 7");
			else
				System.out.println("The third symbol of the number is not 7");
	}

}
