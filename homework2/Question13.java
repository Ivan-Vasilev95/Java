package homework2;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		int number = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Въведете число от 0 до 999 или -1 за изход:  ");
		number = input.nextInt();
		while (number != -1) {
			if (number >= 0 && number <= 999) {
				if (number == 0) {
					System.out.print("Число след преобразуване: Нула ");
				} else if (number >= 100 && number < 200) {
					System.out.print("Число след преобразуване: ");
					System.out.print("Сто ");
					numberToWord((number % 100), " ");
				} else if (number >= 200 && number < 400) {
					System.out.print("Число след преобразуване: ");
					numberToWord(((number / 100) % 10), "ста");
					numberToWord((number % 100), " ");
				}else {
					System.out.print("Число след преобразуване: ");
					numberToWord(((number / 100) % 10), "стотин");
					numberToWord((number % 100), " ");
				}

			} else {
				System.out.print("Числото е извън зададения параметър");
			}
			System.out.print("\nВъведете число между 0 и 999 или -1 за изход:  ");
			number = input.nextInt();
		}
		input.close();
	}

	public static void numberToWord(int num, String val) {
		String ones[] = { " ", " Едно", " Две", " Три", " Четири", " Пет", " Шест", " Седем", " Осем", " Девет",
				" Десет", " Единайсет", " Дванайсет", " Тринайсет", " Четиринайсет", " Петнайсет", " Шестнайсет",
				" Седемнайсет", " Осемнайсет", " Деветнайсет" };
		String tens[] = { " ", " ", " Двайсет", " Трийсет", " Четирисет", " Педесет", " Шейсет", " Седемдесет",
				" Осемдесет", " Деведесет" };
		if (num > 19) {
			System.out.print(tens[num / 10] + " и " + ones[num % 10]);
		} else {
			System.out.print(ones[num]);
		}
		if (num > 0) {
			System.out.print(val);
		}
	}

}
