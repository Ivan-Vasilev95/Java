package homework2;
import java.util.Scanner;
public class Question23 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double array[];
		array=new double[5];
		for(int i=0;i<array.length;i++) {
			System.out.print("Enter a number: ");
			array[i]=input.nextDouble();
		}

		input.close();
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<(array.length-1);j++) {
				int k=j+1;
				double a=array[j];
				double b=array[k];
				if(b<a) {
					array[j]=b;
					array[k]=a;
				}
			}
		}
		System.out.println("Sorted array using Selection sort");
		for(int i=0;i<array.length;i++) {
			System.out.print(" "+array[i]);
		}
	}

}
