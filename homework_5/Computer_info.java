package homework_5;

public class Computer_info {

	public static void main(String[] args) {
		Dimensions dimensions=new Dimensions(20,20,5);
		Case theCase=new Case("220B","Dell","240",dimensions);
		Monitor theMonitor=new Monitor("27inch Beast","Acer",27,new Resolution(2450,1440));
		Motherboard theMotherboard=new Motherboard("BJ-200","Asus",4,6,"v2.44");
		
		PC thePC=new PC(theCase,theMonitor,theMotherboard);
		thePC.PowerUp();

	}

}

class Motherboard {
	private String model;
	private String manufactuar;
	private int ramSlot;
	private int cardSlot;
	private String bios;

	Motherboard(String model, String manufactuar, int ramSlot, int cardSlot, String bios) {
		this.model = model;
		this.manufactuar = manufactuar;
		this.ramSlot = ramSlot;
		this.cardSlot = cardSlot;
		this.bios = bios;
	}

	public String getModel() {
		return model;
	}

	public String getManufactuar() {
		return manufactuar;
	}

	public int getRamSlot() {
		return ramSlot;
	}

	public int getCardSlot() {
		return cardSlot;
	}

	public String getBios() {
		return bios;
	}

	public void loadProgram(String programName) {
		System.out.println("Program " + programName + " is now loading...");
	}
}

class Monitor {
	private String model;
	private String manufactuar;
	private int size;
	private Resolution nativeResolution;

	Monitor(String model, String manufactuar, int size, Resolution nativeResolution) {
		this.model = model;
		this.manufactuar = manufactuar;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}

	public String getModel() {
		return model;
	}

	public String getManufactuar() {
		return manufactuar;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

	public void drawPixelat(int x, int y, String color) {
		System.out.println("Drawing pixels at " + x + " " + y + " in color " + color);
	}
}

class Resolution {
	private int height;
	private int width;

	Resolution(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
}

class Case {
	private String model;
	private String manufactuar;
	private String powersuply;
	private Dimensions dimensions;

	Case(String model, String manufactuar, String powersuply, Dimensions dimensions) {
		this.model = model;
		this.manufactuar = manufactuar;
		this.powersuply = powersuply;
		this.dimensions = dimensions;
	}

	public String getModel() {
		return model;
	}

	public String getManufactuar() {
		return manufactuar;
	}

	public String getPowersuply() {
		return powersuply;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

	public void PressPowerButton() {
		System.out.println("Power button pressed!");
	}

}

class Dimensions {
	private int height;
	private int width;
	private int depth;

	Dimensions(int height, int width, int depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getDepth() {
		return depth;
	}
}

class PC {
	private Case theCase;
	private Monitor theMonitor;
	private Motherboard theMotherboard;

	PC(Case obj1, Monitor obj2, Motherboard obj3) {
		theCase = obj1;
		theMonitor = obj2;
		theMotherboard = obj3;
	}

	 void drawLogo() {
		theMonitor.drawPixelat(1200, 50, "yellow");
	}
	public void PowerUp() {
		theCase.PressPowerButton();
		drawLogo();
	}
}
