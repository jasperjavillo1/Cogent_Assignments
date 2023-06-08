package cogent.education.day8practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t = new Table();
		Runnable1 r1 = new Runnable1(t);
		Runnable r2 = new Runnable2(t);
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);
		th1.start();
		th2.start();
	}

}
