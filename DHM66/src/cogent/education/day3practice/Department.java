package cogent.education.day3practice;

public class Department {
	public String name;
	protected int id;
	private String location;
	
	public Department(String name, int id, String location)
	{
		this.name = name;
		this.id = id;
		this.location = location;
	}
	public Department(String name, int id)
	{
		this.name = name;
		this.id = id;
		location = "Basement, Room 7";
	}
	public Department (String name)
	{
		this.name = name;
		id = 101;
		location = "Floor 1, Room 1";
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void displayDetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Location: " + location);
		System.out.println();
	}
}
