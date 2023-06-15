package cogent.education.day10practice;
import java.io.*;
public class TestBuffer {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("Input 10 bytes of characters.");
		BufferedInputStream bis = new BufferedInputStream(System.in);
		byte b[] = new byte[10];
		bis.read(b);
		System.out.println(new String(b));
	}

}
