package cogent.education.day10practice;
import java.io.*;
public class TestBufferedOutputStream {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("thrid.text"));
		String s = "Double Spinning Edge";
		byte b[] = s.getBytes();
		bos.write(b);
		bos.close();
	}

}
