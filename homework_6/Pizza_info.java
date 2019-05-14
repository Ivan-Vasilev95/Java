package homework_6;

import java.util.Scanner;

public class Pizza_info {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the pizza and the number of toppings");
		System.out.print("Pizza name: ");
		String name = input.nextLine();
		System.out.print("Number of toppings: ");
		int toppings_number = input.nextInt();
		while (toppings_number < 0 || toppings_number > 10) {
			System.out.println("Toppings number must be between 0 and 10\nEnter valid toppings number");
			toppings_number = input.nextInt();
		}

		System.out.print("Enter flour type: ");
		input.nextLine();
		String flour_type = input.nextLine();
		System.out.print("Enter baking technique: ");
		String baking_technique = input.nextLine();
		System.out.print("Enter the pizza total grams: ");
		double total_grams = input.nextDouble();

		double toppings_total_calories = 0;

		for (int i = 0; i < toppings_number; i++) {
			System.out.print("Enter the topping type: ");
			input.nextLine();
			String topping_type = input.nextLine();
			System.out.print("Enter the topping grams: ");
			double topping_grams = input.nextDouble();
			Toppings topping = new Toppings(topping_type, topping_grams);
			toppings_total_calories += topping.getTopping_calories();
		}

		Pizza finalPizza = new Pizza(name, toppings_total_calories,
				new Dough(flour_type, baking_technique, total_grams));

		System.out.println("\n" + finalPizza.getName() + " - " + finalPizza.Tottal_Pizza_callories());
		input.close();
	}

}

class Pizza {
	private String name;
	private double toppings_calories;
	private Dough dough;

	Pizza(String name, double toppings_calories, Dough dough) throws Exception {
		if (name.isEmpty() || name.length() > 15) {
			throw new Exception("The pizza name cant be empty or more then 15 symbols");
		} else
			this.name = name;

		this.toppings_calories = toppings_calories;
		this.dough = dough;
	}

	public String getName() {
		return name;
	}

	public double Tottal_Pizza_callories() {
		double tottal_pizza_callories = 0;
		tottal_pizza_callories = ((2 * dough.getPizza_grams()) * dough.getDough_grams() * dough.getType_grams());
		tottal_pizza_callories += toppings_calories;

		return tottal_pizza_callories;

	}

}

class Dough {
	private String dough;
	private String type;
	private double pizza_grams;
	private double dough_grams;
	private double type_grams;

	Dough(String dough, String type, double pizza_grams) throws Exception {

		if (dough.equalsIgnoreCase("white")) {
			this.dough = dough;
			this.dough_grams = 1.5;
		} else if (dough.equalsIgnoreCase("wholegrain")) {
			this.dough = dough;
			this.dough_grams = 1;
		} else
			throw new Exception("Wrong dough " + dough + " .It can be white or wholegrain");
		if (type.equalsIgnoreCase("crispy")) {
			this.type = type;
			this.type_grams = 0.9;
		} else if (type.equalsIgnoreCase("chewy")) {
			this.type = type;
			this.type_grams = 1.1;
		} else if (type.equalsIgnoreCase("homemade")) {
			this.type = type;
			this.type_grams = 1;
		} else
			throw new Exception("Wrong type " + type + " .It can be crispy , chewy or homemade");

		if (pizza_grams > 0 && pizza_grams <= 200)
			this.pizza_grams = pizza_grams;
		else
			throw new Exception("The pizza grams must be between  0 and 200");
	}

	public double getPizza_grams() {
		return pizza_grams;
	}

	public double getDough_grams() {
		return dough_grams;
	}

	public double getType_grams() {
		return type_grams;
	}
}

class Toppings {
	private String topping;
	private double topping_type_grams;
	private double topping_grams;

	Toppings(String topping, double topping_grams) throws Exception {

		if (topping.equalsIgnoreCase("meat")) {
			this.topping = topping;
			this.topping_type_grams = 1.2;
		} else if (topping.equalsIgnoreCase("veggies")) {
			this.topping = topping;
			this.topping_type_grams = 0.8;
		} else if (topping.equalsIgnoreCase("cheese")) {
			this.topping = topping;
			this.topping_type_grams = 1.1;
		} else if (topping.equalsIgnoreCase("sauce")) {
			this.topping = topping;
			this.topping_type_grams = 0.9;
		} else
			throw new Exception("Wrong topping " + topping + " .It can be meat,veggies,cheese or sauce");

		if (topping_grams > 0 && topping_grams <= 50)
			this.topping_grams = topping_grams;
		else
			throw new Exception("Topping grams must be between  0 and 50");
	}

	public double getTopping_calories() {
		return topping_type_grams * topping_grams;
	}
}
