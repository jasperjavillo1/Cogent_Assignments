package cogent.education.day4practice;

public class Rectangle extends Shape {
	public Rectangle(String s, double length, double width) {
		super(s);
		this.length = length;
		this.width = width;
	}
	double length;
	double width;
	@Override
	public void area() {
		double area = length * width;
		System.out.println("Area: " + area);
	}

	@Override
	public void perimeter() {
		double peri = (2*length) + (2*width);
		System.out.println("Perimeter: " + peri);
	}

}
