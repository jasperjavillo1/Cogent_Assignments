package cogent.education.day10practice;
import java.io.*;
public class TestReader {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("Input 10 characters.");
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		char c[] = new char[10];
		bis.read(c);
		System.out.println(new String(c));
	}

}
