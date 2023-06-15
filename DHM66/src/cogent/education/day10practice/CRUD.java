package cogent.education.day10practice;
import java.util.*;
public class CRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> ea = new ArrayList<Employee>();
		ea.add(new Employee());
		ea.add(new Employee("Ben",23,"male",70000));
		ea.add(new Employee("Carly",21,"female",62000));
		ea.add(new Employee("Eunie",20,"female",75000));
		Iterator<Employee> it = ea.iterator();
		while(it.hasNext())
		{
			Employee e = (Employee)it.next();
			e.read();
			System.out.println();
		}
		
		ea.remove(2);
		it = ea.iterator();
		while(it.hasNext())
		{
			Employee e = (Employee)it.next();
			e.read();
			System.out.println();
		}
		update(ea,1, 100000);
		it = ea.iterator();
		while(it.hasNext())
		{
			Employee e = (Employee)it.next();
			e.read();
			System.out.println();
		}
	}
	
	public static void update(ArrayList<Employee> ea, int index ,int salary)
	{
		Employee e = (Employee)ea.get(index);
		e.setSalary(salary);
	}

}
