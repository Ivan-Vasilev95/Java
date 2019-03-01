package homework;

import java.util.Scanner;

public class Question_25 {
	
	public static void Hello_name(String n) {
		System.out.println("Hello " + n+"!");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = input.nextLine();
		input.close();
		
		Hello_name(name);

	}

}
