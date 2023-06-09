package cogent.homework.assignment2e6;

public class Manager extends Employee {

	public Manager()
	{
		super();
	}
	
	public Manager(String name, int age, String department, int salary)
	{
		super(name,age,department,salary);
	}
	@Override
	public void job() {
		// TODO Auto-generated method stub
		System.out.println("Manager");
	}

}
