package question_1;

public class question_2 {

	public static void main(String[] args) {
		Car obj[]=new Car[3];
		obj[0]=new Truck(200,1500,"Red",2000);
		obj[1]=new Ford(180,1200,"Blue",1995,200);
		obj[2]=new Sedan(150,1600,"Green",15);
		
		for(int i=0;i<obj.length;i++)
			System.out.println(obj[i].getSalePrice());
	}

}

class Car {
	private int speed;
	public double regularPrice;
	private String color;

	Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	public double getSalePrice() {
		return regularPrice;
	}

}

class Truck extends Car {
	private int weight;

	Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	public double getSalePrice() {
		if (weight > 2000)
			return regularPrice -= (regularPrice * 10) / 100;
		else
			return regularPrice -= (regularPrice * 20) / 100;
	}
}

class Ford extends Car {
	private int year;
	private int manufactuarDiscaunt;

	Ford(int speed, double regularPrice, String color, int year, int manufactuarDiscaunt) {
		super(speed, regularPrice, color);
		this.manufactuarDiscaunt = manufactuarDiscaunt;
		this.year = year;
	}

	public double getSalePrice() {
		return regularPrice - manufactuarDiscaunt;
	}
}

class Sedan extends Car {
	private int length;

	Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	public double getSalePrice() {
		if(length>20)
			return regularPrice-=(regularPrice * 5) / 100;
		else
			return regularPrice-=(regularPrice * 10) / 100;
	}
}