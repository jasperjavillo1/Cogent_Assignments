package cogent.education.day8practice;

public class Runnable2 implements Runnable {

	Table t;
	public Runnable2(Table t)
	{
		this.t = t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printOut(9);
	}

}
