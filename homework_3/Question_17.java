package homework;

public class Question_17 {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 1, 2, 3, 4, 5, 0, 12 };
		int n = arr.length;
		System.out.println("Full array");
		for(int i=0;i<n;i++) 
			System.out.print(" "+arr[i]);
		System.out.println("\nLongest increasing subarray");
		printLogestIncSubArr(arr, n);

	}
	public static void printLogestIncSubArr(int arr[], int n) {
		int max = 1, len = 1, maxIndex = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1])
				len++;
			else {
				if (max < len) {
					max = len;
					maxIndex = i - max;
				}
				len = 1;
			}
		}
		if (max < len) {
			max = len;
			maxIndex = n - max;
		}
		for (int i = maxIndex; i < max + maxIndex; i++)
			System.out.print(arr[i] + " ");
	}
}
