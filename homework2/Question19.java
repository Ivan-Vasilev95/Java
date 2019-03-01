package homework2;

public class Question19 {

	public static void main(String[] args) {

		int array[];
		array = new int[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = i * 5;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

	}

}
