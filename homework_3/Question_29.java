package homework;
import java.util.Scanner;
public class Question_29 {
	
	public static int reverse_int(int value) {
		int revers_number = 0;
	    for (int i = value; i !=0; i /= 10) {
	    	revers_number = revers_number * 10 + i % 10;
	    }
	    return revers_number;   
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number=input.nextInt();
		input.close();
		System.out.println("The number you entered but reversed: "+reverse_int(number));

	}

}
