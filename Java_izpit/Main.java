package Java_izpit;

import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		SIG s = new SIG(
				"C:\\Users\\Ivan Vasilev\\eclipse-workspace-java\\Java-izpit_podgotovka\\src\\podgotovka\\inF.txt");

		List<User> list = s.PrintFile();
		if(list.isEmpty()) {
			input.close();
			throw new Exception("The File is empty");
		}
		List<String> TechList = new ArrayList<String>();
		s.GetAllTech(list, TechList);
		
		
		System.out.println("(IV.2)The Full list of users and Tehnologys");
		for (User st : list)
			System.out.println(st);

		System.out.print("(III.5)Enter Tech: ");
		String Tech = input.nextLine();
		if (TechList.contains(Tech)) {
			List<String> list1 = s.CreateGroupList(Tech);

			System.out.println(
					"\n(IV.3 if XML was entered but you can enter what you like)The list of users with the entered tehnology");
			for (String st : list1)
				System.out.println(st);
		} else {
			input.close();
			throw new Exception("There is no such Tech");
		}

		System.out.println("\nList with the used Tech(III.6)");

		for (String st : TechList)
			System.out.print(st + " ");

		System.out.print("\n(III.7)Enter Tech: ");
		Tech = input.nextLine();
		if (TechList.contains(Tech)) {
			SIG.Users_from_given_Tech(list, Tech);
		}else {
			input.close();
			throw new Exception("There is no such Tech");
		}

		input.close();
	}

}
