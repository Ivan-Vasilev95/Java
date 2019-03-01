package homework;
import java.util.Arrays;
import java.util.Scanner;

public class Question_21 {
	public static int binarySearch(int sortedArray[], int key) {
		int low = 0;
		int high = sortedArray.length;
		int index = -1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (sortedArray[mid] < key) {
				low = mid + 1;
			} else if (sortedArray[mid] > key) {
				high = mid - 1;
			} else if (sortedArray[mid] == key) {
				index = mid;
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = { 12,5,2,87,3,0,33,45};
		Arrays.parallelSort(arr);
		System.out.println("The full sorted array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.print("\nEnter the elemnt you like to find the position of: ");
		int x = input.nextInt();
		input.close();

		int result = binarySearch(arr, x);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}
