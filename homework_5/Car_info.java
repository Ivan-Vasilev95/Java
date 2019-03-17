package homework_5;

public class Car_info {

	public static void main(String[] args) {
		Car obj[]=new Car[3];
		obj[0]=new Ford(1,"ford");
		obj[1]=new Mitsubishi(2,"mitsubishi");
		obj[2]=new Honda(3,"honda");
		
		for(int i=0;i<obj.length;i++) {
			obj[i].startEngine();
			obj[i].accelerate();
			obj[i].Break();
		}
	}

}
class Car{
	private int engine;
	private int cylinder;
	private int wheels;
	private String name;
	
	Car(int cylinder,String name){
		this.cylinder=cylinder;
		this.name=name;
	}
	public int get_cylinder() {
		return cylinder;
	}
	public String get_name() {
		return name;
	}
	
	public void startEngine() {
		System.out.println("Car->startEngine");
	}
	public void accelerate() {
		System.out.println("Car->accelerate");
	}
	public void Break() {
		System.out.println("Car->break");
	}
}
class Ford extends Car{
	
	Ford(int cylinder,String name){
		super(cylinder,name);
	}
	public void startEngine() {
		System.out.println("Ford->startEngine");
	}
	public void accelerate() {
		System.out.println("Ford->accelerate");
	}
	public void Break() {
		System.out.println("Ford-break");
	}
}
class Mitsubishi extends Car{
	
	Mitsubishi(int cylinder,String name){
		super(cylinder,name);
	}
	public void startEngine() {
		System.out.println("Mitsubishi->startEngine");
	}
	public void accelerate() {
		System.out.println("Mitsubishi->accelerate");
	}
	public void Break() {
		System.out.println("Mitsubishi->break");
	}
}
class Honda extends Car{
	
	Honda(int cylinder,String name){
		super(cylinder,name);
	}
	public void startEngine() {
		System.out.println("Honda->startEngines");
	}
	public void accelerate() {
		System.out.println("Honda->eccelerate");
	}
	public void Break() {
		System.out.println("Honda->break");
	}
}