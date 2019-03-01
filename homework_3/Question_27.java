package homework;

import java.util.Scanner;

public class Question_27 {

	public static String last_num(int x) {
		x = x % 10;
		String temp="";
		switch (x) {
		case 0:
			  temp="zero";
			  break;
		case 1:
			 temp="one";
			 break;
		case 2:
			 temp="two";
			 break;
		case 3:
			 temp="three";
			 break;
		case 4:
			 temp="four";
			 break;
		case 5:
			 temp="five";
			 break;
		case 6:
			 temp="six";
			 break;
		case 7:
			 temp="seven";
			 break;
		case 8:
			 temp="eight";
			 break;
		case 9:
			 temp="nine";
			 break;
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		input.close();
		System.out.println("The last number in english is "+last_num(num));
	}

}
