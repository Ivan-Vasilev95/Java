package homework;

public class Question_28 {

	public static int f(int arr[]) {
		int num = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				num = i;
				break;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 1, 2, 3, 4, 5, 0, 12 };

		System.out.print("The position of the first number that is bigger of his neighbors is: " + f(arr));
	}

}
