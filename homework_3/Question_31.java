package homework;
import java.util.Scanner;
public class Question_31 {
	public static int Reverse(int num) 
	{
		int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
	
	public static double Average(double arr[])
	{
		double sum = 0 ;
		 for (int i=0; i<arr.length; i++)
		    {
		    	sum+=arr[i];
		    }
	    return sum / arr.length;
	}
	
	public static double linear(float a,float b) {
		float x=0;
	    if(a==0)
	      if(b==0)
	        System.out.println("identity equation");
	      else
	        System.out.println("contrary equation");
	    else {
	      x=-b/a;
	    }
	    return x;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1. If you want to reverse a number.");
		System.out.println("2. Calculates average arithmetic.");
		System.out.println("3. If you want to calcuated - a * x + b = 0.");
		int choise=input.nextInt();
		switch(choise)
		{
		case 1:
			System.out.print("Enter a number: ");
			int N=input.nextInt();
			input.close();
			if(N>0) 
			{
				System.out.print("The result is: " + Reverse(N));
			}
			else
			{
				System.out.print("Wrong! You must enter a positive number!");
			}
			break;
		case 2:
			double[] A= new double [8];
		    for (int i=0; i<A.length; i++)
		    {
		    	System.out.print("Enter "+i+" number for Array: ");
		    	A[i]=input.nextDouble();
		    }
		    input.close();
		    if(!(A==null))
		    {
		    	System.out.print("Your result: " + Average(A));
		    }
			break;
		case 3:
			System.out.print("Enter a: ");
			float a=input.nextFloat();
			while(a==0) {
				System.out.println("a must different than 0!");
				System.out.print("Enter a: ");
				a=input.nextFloat();
			}
			System.out.print("Enter b: ");
			float b=input.nextFloat();
			System.out.println("\nFor 2*x+b=0\n"+linear(a,b));
			break;
			default: 
				System.out.print("Wrong choise! :)");
				break;
		}

	}

}
