package cogent.education.day10practice;
import java.io.*;
public class TestFile {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		RandomAccessFile ra = new RandomAccessFile("First.text", "rw");
		System.out.println(ra.read());
		ra.seek(5);
		ra.write(68);
		ra.close();
	}

}
