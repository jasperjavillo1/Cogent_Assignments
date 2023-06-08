package cogent.education.day4practice;

public abstract class Shape {
	String color = "Pink";
	public Shape(String s) {
		this.color = s;
	}
	public void getColor() {
		System.out.println("Color: " + color);
	}
	
	public abstract void area();
	public abstract void perimeter();
}
