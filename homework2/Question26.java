package homework2;

public class Question26 {
//Pri poveche ot 10 000 programata kra6va
	public static void main(String[] args) {
		boolean check;
		for (int i = 0; i < 10000000; i++) {
			check = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = true;
					break;
				}
			}
			if (check == false) {
				System.out.println(" " + i);
			}
		}

	}
}