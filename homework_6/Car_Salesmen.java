package homework_6;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Car_Salesmen {

	public static void main(String[] args) {
		Map<String, Car1> linkedHashMap = new HashMap<>();
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter how many engine do you need: ");
		int eng_num=input.nextInt();
		input.nextLine();
		Engine model[]=new Engine[eng_num];
		
		for(int i=0;i<model.length;i++) {
			System.out.print("\nEnter engine model: ");
			String eng_model=input.nextLine();
			System.out.print("\nEnter power: ");
			double power=input.nextDouble();
			System.out.print("\nEnte displacements: ");
			input.nextLine();
			String displacements=input.nextLine();
			System.out.print("\nEnter efficiency: ");
			String efficiency=input.nextLine();
			model[i]=new Engine(eng_model,power,displacements,efficiency);
		}
		System.out.print("Enter how many cars you have: ");
		int car_num=input.nextInt();
		input.nextLine();
		Car1 car[]=new Car1[car_num];
		
		for(int i=0;i<car.length;i++) {
			System.out.print("Enter car mode: ");
			String car_model=input.nextLine();
			System.out.print("Enter what engine this car will have: ");
			String car_model_eng=input.nextLine();
			System.out.print("Enter cars weight: ");
			String weight=input.nextLine();
			System.out.print("Enter cars color: ");
			String color=input.nextLine();
			
			
			for(int j=0;j<model.length;j++) {
				if(model[j].getModel().contains(car_model_eng)) {
					car[i]=new Car1(car_model,model[j],weight,color);
					linkedHashMap.put(model[j].getModel(), car[i]);
				}
			}
		}

		for (Map.Entry<String, Car1> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.toString());
		}

		input.close();
	}

}

class Car1 {
	private String model;
	private Engine engine;
	private String weight;
	private String color;

	Car1(String model, Engine engine, String weight, String color) {
		if (!model.isEmpty())
			this.model = model;
		else
			System.out.println("Model cant be empty");

		this.engine = engine;

		if (!weight.isEmpty())
			this.weight = weight;
		else
			this.weight = "n/a";	

		if (!color.isEmpty())
			this.color = color;
		else
			this.color = "n/a";
	}

	public String toString() {
		return this.model + ":\n" + " " + engine.getModel() + "\n " + engine.getPower() + "\n "
				+ engine.getDisplacements() + "\n " + engine.getEfficiency() + "\n" + this.weight + "\n" + this.color+"\n";
	}
}

class Engine {
	private String model;
	private double power;
	private String displacements;
	private String efficiency;

	Engine(String model, double power, String displacements, String efficiency) {
		if (!model.isEmpty())
			this.model = model;
		else
			System.out.println("The model cant be empty");

		if (power > 0)
			this.power = power;
		else
			System.out.println("Power cant be 0 or less");

		if (efficiency.isEmpty())
			this.efficiency = "n/a";
		else
			this.efficiency = efficiency;

		if (displacements.isEmpty())
			this.displacements = "n/a";
		else
			this.displacements = displacements;

	}

	public String getModel() {
		return model;
	}

	public double getPower() {
		return power;
	}

	public String getDisplacements() {
		return displacements;
	}

	public String getEfficiency() {
		return efficiency;
	}
}