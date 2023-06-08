package cogent.education.day8practice;

public class Runnable1 implements Runnable {

	Table t;
	public Runnable1(Table t)
	{
		this.t = t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printOut(5);
	}

}
