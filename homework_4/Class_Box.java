package homework_4;

import java.util.Scanner;

public class Class_Box {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Box obj = new Box();
		System.out.println("Enter lenght");
		double l = input.nextDouble();
		System.out.println("Enter width");
		double w = input.nextDouble();
		System.out.println("Enter height");
		double h = input.nextDouble();
		input.close();

		obj.volume(l, w, h);
	}

}

class Box {
	private double length;
	private double width;
	private double height;

	private void set_lenght(double lenght) {
		if (lenght == 0 || lenght < 0)
			System.out.println("The lenght cant be 0 or negative number!");
		else
			this.length = lenght;
	}

	private void set_width(double width) {
		if (width == 0 || width < 0)
			System.out.println("The width cant be 0 or negagative number!");
		else
			this.width = width;
	}

	private void set_height(double height) {
		if (height == 0 || height < 0)
			System.out.println("The height cant be 0 or negative number!");
		else
			this.height = height;
	}

	private void surface_area() {
		System.out.println("Surface Area - " + ((2 * length * width) + (2 * length * height) + (2 * width * height)));
	}

	private void lateral_surface_area() {
		System.out.println("Literal Surface Arena - " + ((2 * length * height) + (2 * width * height)));
	}

	public void volume(double lenght, double width, double height) {
		Box ob = new Box();
		ob.set_lenght(lenght);
		ob.set_width(width);
		ob.set_height(height);

		if (height > 0 && lenght > 0 && width > 0) {
			ob.surface_area();
			ob.lateral_surface_area();
			System.out.println("Volume - " + (lenght*width*height));
		}
	}
}