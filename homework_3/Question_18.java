package homework;

public class Question_18 {
	public static int getPopularElement(int a[] )
	{
	  int count = 1, tempCount;
	  int popular = a[0];
	  int temp = 0;
	  for (int i = 0; i < (a.length - 1); i++)
	  {
	    temp = a[i];
	    tempCount = 0;
	    for (int j = 1; j < a.length; j++)
	    {
	      if (temp == a[j])
	        tempCount++;
	    }
	    if (tempCount > count)
	    {
	      popular = temp;
	      count = tempCount;
	    }
	  }
	  return popular;
	}
	public static void main(String[] args) {
		System.out.print("The full array: ");
		int arr[] = { 7, 4, 3, 7, 3, 4, 7, 7, 3 };
		for(int i=0;i<arr.length;i++) 
			System.out.print(" "+arr[i]);
		System.out.println("\nThe most common element of the array is: "+getPopularElement(arr));
	}

}
