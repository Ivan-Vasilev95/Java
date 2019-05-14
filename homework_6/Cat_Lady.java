package homework_6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cat_Lady {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, Cat> linkedHashMap = new HashMap<>();

		Cat obj[] = new Cat[3];
		obj[0] = new Siamese("Maca", 85);
		obj[1] = new Cymric("Sim", 4);
		obj[2] = new StreetExtraordinaire("Tom", 28);

		for (int i = 0; i < obj.length; i++)
			linkedHashMap.put(obj[i].getName(), obj[i]);

		System.out.println("Cat list");
		for (Map.Entry<String, Cat> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.toString());
		}
		System.out.print("Enter cat name: ");
		String cat_name = input.nextLine();

		
		System.out.println(linkedHashMap.get(cat_name));

		input.close();
	}

}

class Cat {
	private String name;
	private double milimiters;

	Cat(String name, double milimiters) {
		this.name = name;
		this.milimiters = milimiters;
	}

	public String toString() {
		return this.name + " " + this.milimiters;
	}

	public String getName() {
		return name;
	}
}

class Siamese extends Cat {
	private String nameS;
	private double earSize;

	public Siamese(String name, double earSize) {
		super("", 0);
		if (!name.isEmpty())
			this.nameS = name;
		else
			System.out.println("the name cant be empty");

		if (earSize > 0)
			this.earSize = earSize;
		else
			System.out.println("earSize cant be 0 or less");
	}

	public String toString() {
		return this.nameS + " " + this.earSize;
	}

	public String getName() {
		return nameS;
	}
}

class Cymric extends Cat {
	private String nameC;
	private double furLength;

	public Cymric(String nameC, double furLength) {
		super("", 0);

		if (!nameC.isEmpty())
			this.nameC = nameC;
		else
			System.out.println("The name cant be empty");

		if (furLength > 0)
			this.furLength = furLength;
		else
			System.out.println("The furLength cant be 0 or less");
	}

	public String toString() {
		return this.nameC + " " + this.furLength;
	}

	public String getName() {
		return nameC;
	}
}

class StreetExtraordinaire extends Cat {
	private String nameE;
	private double decibelsOfMeows;

	StreetExtraordinaire(String nameE, double decibelsOfMeows) {
		super("", 0);

		if (!nameE.isEmpty())
			this.nameE = nameE;
		else
			System.out.println("The name cant be empty");

		if (decibelsOfMeows > 0)
			this.decibelsOfMeows = decibelsOfMeows;
		else
			System.out.println("decibelsOfMeows cant be 0 or less");

	}

	public String toString() {
		return this.nameE + " " + decibelsOfMeows;
	}

	public String getName() {
		return nameE;
	}
}