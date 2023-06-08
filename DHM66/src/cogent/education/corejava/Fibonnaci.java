package cogent.education.corejava;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintFib();
		RecurseFib(0,1);

	}
	
	public static void PrintFib() {
		long previous = 0;
		long current = 1;
		System.out.println(previous);
		System.out.println(current);
		while(current < 100) {
			long next = previous + current;
			System.out.println(next);
			previous = current;
			current = next;
		}
	}
	
	public static void RecurseFib(long previous, long current)
	{
		if(current == 1) {
			System.out.println(0);
			System.out.println(1);
		}
		if(current < 100) {
			System.out.println(previous + current);
			RecurseFib(current, previous + current);
		}
	}

}
