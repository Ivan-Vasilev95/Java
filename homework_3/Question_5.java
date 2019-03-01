package homework;
import java.util.Scanner;
public class Question_5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int a=input.nextInt();
		System.out.print("Enter the second integer: ");
		int b=input.nextInt();
		input.close();
		int temp;
		int temp1;
		if(a>b) {
			temp1=a;
			temp=b;
		}else {
			temp1=b;
			temp=a;
		}
		int count=0;
		for(int i=temp+1;i<temp1;i++) {
			if(i%5==0)
				count++;
		}
		System.out.println("The amount of number thet divided by 5 = 0 are "+count);
	}

}
