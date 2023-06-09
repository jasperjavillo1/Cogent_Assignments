package cogent.homework.assignment2;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = new Circle(5,"blue");
		System.out.println("c1 radius: " + c1.getRadius());
		System.out.println("c2 radius: " + c2.getRadius());
		System.out.println("c1 area: " + c1.getArea());
		System.out.println("c2 area: " + c2.getArea());
	}

}
