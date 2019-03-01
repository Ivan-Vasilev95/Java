package homework2;
import java.util.Scanner;
public class Question25 {

	public static void main(String[] args) {
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word=input.nextLine();
		input.close();
		char[] c=word.toCharArray();
		for(int i=0;i<alphabet.length;i++) {
			System.out.print(" "+alphabet[i]);
		}
		System.out.println("\nThe index of the latters of the word you entered");
		for(int i=0;i<word.length();i++) {
			for(int j=0;j<alphabet.length;j++) {
				if(c[i]==alphabet[j]) {
					System.out.print(" "+j);
				}
			}
		}

	}

}
