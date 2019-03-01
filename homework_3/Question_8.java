package homework;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double array[];
		array = new double[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter number: ");
			array[i] = input.nextDouble();
		}
		input.close();
		double max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max)
				max=array[i];
		}
		System.out.println("The biggest number is: "+max);
	}

}
