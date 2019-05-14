package homework_6;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Speed_Racing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, Car> linkedHashMap = new LinkedHashMap<>();
		Car car[] = new Car[4];
		car[0] = new Car(0.5, 20, 0);
		car[1] = new Car(0.2, 18, 20);
		car[2] = new Car(0.6, 22, 0);
		car[3] = new Car(0.8, 15, 12);

		linkedHashMap.put("Audi", car[0]);
		linkedHashMap.put("Ford", car[1]);
		linkedHashMap.put("BMW", car[2]);
		linkedHashMap.put("Honda", car[3]);

		System.out.println("       Cars Info\n");
		for (Map.Entry<String, Car> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.toString());
		}
		System.out.println("\nDo you wonna go for a drive(Yes/No)");
		String choice = input.nextLine();

		while (!choice.equalsIgnoreCase("no")) {
			System.out.println("Enter car model");
			String car_name = input.nextLine();

			if (linkedHashMap.containsKey(car_name)) {
				System.out.print("Enter distance: ");
				double distance = input.nextDouble();
				linkedHashMap.computeIfPresent(car_name, (k,v)->v.Move(distance));

			} else
				System.out.println("There is no such car");

			System.out.println("Do you wonna go for a drive(Yes/No)");
			input.nextLine();
			choice = input.nextLine();

		}
		
		System.out.println("      Updated Cars Info\n");
		for (Map.Entry<String, Car> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.toString());
		}
		input.close();
	}
}

class Car {
	private double fuel_cost;
	private double fuel_amount;
	private double distance;

	Car(double fuel_cost, double fuel_amount, double distance) {
		if (fuel_cost >= 0)
			this.fuel_cost = fuel_cost;
		else
			System.out.println("The fuel cost cant be 0 or less");

		if (fuel_amount > 0)
			this.fuel_amount = fuel_amount;
		else
			System.out.println("the fuel amount cant be less then 0");

		if (distance >= 0)
			this.distance = distance;
		else
			System.out.println("The distance cant be less then 0");
	}

	public String toString() {
		return "| Fuel cost=" + this.fuel_cost + "| Fuel amount=" + this.fuel_amount + "| Distance: " + this.distance;
	}

	public Car Move(double distance) {
		if (distance >= 0) {
			if (fuel_amount >= distance * fuel_cost) {
				this.distance+=distance;
				this.fuel_amount-=distance*fuel_cost;
			}
			return new Car(this.fuel_cost,this.fuel_amount,this.distance);
		} else {
			return new Car(this.fuel_cost,this.fuel_amount,this.distance);
		}

	}
}