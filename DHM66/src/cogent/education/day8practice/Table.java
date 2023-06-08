package cogent.education.day8practice;

public class Table {
	public synchronized void printOut(int n)
	{
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Multiples of " + n + ": ");
		int r = 0;
		for(int i = 1; i <=5; i++)
		{
			r += n;
			System.out.println(r);
		}
	}
}
