package homework;

public class Question_11 {

	public static void main(String[] args) {
		String cards[]= {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String color[]= {"hearts","diamonds","clubs","spades"};

		System.out.println("Standart Play Deck contain the cards\n");
		for(int i=0;i<color.length;i++) {
			for(int j=0;j<cards.length;j++)
				System.out.print(" "+cards[j]+" of "+color[i]);
			System.out.println();
		}
	}

}
