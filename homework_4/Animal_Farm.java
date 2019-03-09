package homework_4;
import java.util.Scanner;
public class Animal_Farm {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the name of the chiken: ");
		String name=input.nextLine();
		System.out.print("Enter the age of the chiken: ");
		int age=input.nextInt();
		input.close();
		
		Chicken.ProductPerDay(name,age);
	}

}

class Chicken {
	private String name;
	private int age;

	private Chicken(String name,int age) {
		set_name(name);
		set_age(age);
	}

	private void set_name(String name) {
		if (name.isEmpty())
			System.out.println("Name cant be empty!");
		else
			this.name = name;
	}

	private void set_age(int age) {
		if (age > 15 || age < 0)
			System.out.println("Chiceks can live between 0 and 15 years.");
		else
			this.age = age;
	}

	private double CalculateProductPerDay() {
		if (this.age <= 6) {
			return 2;
		} else if (this.age > 6 && this.age <= 12) {
			return 1;
		} else
			return 0.75;
	}

	public static void ProductPerDay(String name, int age) {
		Chicken obj = new Chicken(name,age);

		if (age >= 0 && age <= 15 && !name.isEmpty()) {
			System.out.println("Chiken " + name + " (age " + age + ")" + " can produce " + obj.CalculateProductPerDay()
					+ " egg per day!");
		}

	}
}