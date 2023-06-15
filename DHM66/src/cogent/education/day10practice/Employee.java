package cogent.education.day10practice;

public class Employee {
	String name = "Adam";
	int id;
	int age = 21;
	String gender = "male";
	int salary = 60000;
	private static int counter = 1;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee()
	{
		id = counter;
		counter++;
	}
	public Employee(String name, int age, String gender, int salary)
	{
		this.name = name;
		this.id = counter;
		this.age =age;
		this.gender = gender;
		this.salary = salary;
		counter++;
	}
	
	public void read()
	{
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Salary: $" + salary);
	}
	
}
