package homework;
import java.util.Scanner;
public class Question_12 {

	public static int fact(int x) {
		int fact=1;
		for(int i=1;i<=x;i++)
			fact*=i;
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter K: ");
		int k=input.nextInt();
		while(k<=1) {
			System.out.println("K must be bigger then 1!");
			System.out.print("\nEnter K: ");
			k=input.nextInt();
		}
		System.out.print("Enter N: ");
		int n=input.nextInt();
		while(n<=k) {
			System.out.println("N must be bigger then K!");
			System.out.print("\nEnter N: ");
			n=input.nextInt();
		}
		input.close();
		System.out.println("N!/K!= "+fact(n)/fact(k));

	}

}
