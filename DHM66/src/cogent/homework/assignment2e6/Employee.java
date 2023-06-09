package cogent.homework.assignment2e6;

public abstract class Employee {
	protected String name;
	protected int age;
	protected String department;
	protected int salary;
	
	public Employee() {}
	
	public Employee(String name, int age, String department, int salary)
	{
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}
	
	public abstract void job();
}
