package homework_4;

import java.util.Scanner;

public class Shopping_Spree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the person name: ");
		String name = input.nextLine();
		System.out.print("Enter how much money that person have: ");
		double money = input.nextDouble();
		input.nextLine();
		System.out.print("Enter the product name: ");
		String pname = input.nextLine();
		System.out.print("Enter that product cost: ");
		double cost = input.nextDouble();

		Product.Shoping(name, money, pname, cost);
		input.close();

	}

}

class Person {
	private String name;
	private double money;

	public Person(String name, double money) {
		set_name(name);
		set_money(money);
	}

	private void set_name(String name) {
		if (name.isEmpty())
			System.out.println("The name can not be empty!");
		else
			this.name = name;
	}

	private void set_money(double money) {
		if (money < 0)
			System.out.println("Money can not be negative!");
		else
			this.money = money;
	}
}

class Product extends Person {
	private String pname;
	private double cost;

	private Product(String name, double money, String pname, double cost) {
		super(name, money);
		set_pname(pname);
		set_cost(cost);
	}

	private void set_pname(String pname) {
		if (pname.isEmpty())
			System.out.println("Produc name can not be empty");
		else
			this.pname = pname;
	}

	private void set_cost(double cost) {
		if (cost <= 0)
			System.out.println("Cost can not be negative ot free");
		else
			this.cost = cost;
	}

	public static void Shoping(String name, double money, String pname, double cost) {
		Scanner input = new Scanner(System.in);
		new Product(name, money, pname, cost);

		if (!name.isEmpty() && !pname.isEmpty() && money >= 0 && cost > 0) {
			money -= cost;
			System.out.println("" + name + " bought " + pname + " for " + cost + " and he is left with " + money);

			System.out.println("\nDo you wont to keep shoping(Y/N)");
			char temp = input.next().charAt(0);
			while (temp == 'y' || temp == 'Y') {
				if (money == 0) {
					System.out.println("You are out of money");
					break;
				}
				System.out.print("Enter product name:");
				input.nextLine();
				pname = input.nextLine();
				System.out.print("Enter its cost: ");
				cost = input.nextDouble();
				if (money < cost)
					System.out.println("" + name + " cant affort " + pname);
				else {
					money -= cost;
					System.out
							.println("" + name + " bought " + pname + " for " + cost + " and he is left with " + money);
				}
				System.out.println("\nDo you wont to keep shoping(Y/N)");
				temp = input.next().charAt(0);
			}

		}
		input.close();
	}
}