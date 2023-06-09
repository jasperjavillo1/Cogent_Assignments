package cogent.homework.assignment2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"Adam", "Cal", "Ben"};
		names = ArrayOps.sortNames(names);
		ArrayOps.print(names);
		int n[] = {1,2,4,5,6};
		System.out.println(ArrayOps.sequencialSearch(n, 0));
		System.out.println(ArrayOps.sequencialSearch(n, 4));
		Student s = new Student("Freshman", "Noah Keves", "Colony 9", "lucky7@iris.org");
		s.details();
		Employee e1 = new Employee("Adam", "HR", 30, "e1@gmail.com");
		Employee e2 = new Employee("Ben", "HR", 30, "e2@gmail.com");
		System.out.println(e1.getId());
		System.out.println(e2.getId());
	}

}
