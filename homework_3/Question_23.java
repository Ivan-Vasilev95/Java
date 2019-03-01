package homework;

public class Question_23 {
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void sort(int arr[], int low, int high) {
		if (low < high) {

			int pi = partition(arr, low, high);

			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		System.out.print("The array before sorting is: ");
		int arr[] = { 101, 73, 8, 8, 1, 5,23,2,0,1 };
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(" " + arr[i]);

		sort(arr, 0, n - 1);

		System.out.print("\nThe array sorted using quick sort: ");
		for (int i = 0; i < n; i++)
			System.out.print(" " + arr[i]);

	}

}
