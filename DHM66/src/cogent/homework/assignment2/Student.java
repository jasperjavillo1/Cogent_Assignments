package cogent.homework.assignment2;

public class Student {
	String role;
	String name;
	String address;
	String email;
	
	public Student(String role, String name, String address, String email)
	{
		this.role = role;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	
	public void details()
	{
		System.out.println("Name: " + name);
		System.out.println("Role: " + role);
		System.out.println("Address: " + address);
		System.out.println("Email: " + email);
	}
}
