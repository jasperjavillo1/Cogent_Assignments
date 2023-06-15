package cogent.education.day10practice;
import java.io.*;
public class TestBufferWriter {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("second.txt")));
		bw.write("Chandrakant");
		bw.flush();
		bw.close();
	}

}
