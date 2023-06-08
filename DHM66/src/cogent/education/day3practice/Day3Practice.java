package cogent.education.day3practice;

public class Day3Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1 = new Department("Management", 201, "Floor 2, Room 1");
		Department d2 = new Department("Sanitation", 7);
		Department d3 = new Department("Human Resources");
		d1.displayDetails();
		d2.displayDetails();
		d3.displayDetails();
		d2.setLocation(d3.getLocation());
		d2.displayDetails();
	}

}
