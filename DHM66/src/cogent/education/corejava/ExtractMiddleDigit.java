package cogent.education.corejava;
import java.util.Scanner;

public class ExtractMiddleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ExtractMiddleDigit emd = new ExtractMiddleDigit();
		System.out.println("Enter an integer:");
		int a = sc.nextInt();
		System.out.println(emd.MidDigit(a));
		sc.close();
	}
	
	public int MidDigit(int a)
	{
		int b = a;
		int digits = 0;
		while(b > 0)
		{
			b /= 10;
			digits++;
		}
		int md = 0;
		if(a%2 == 0)
		{
			md = digits/2;
		}
		else
		{
			md = (digits+1)/2;
		}
		b = a;
		for(int i = 0; i < md; i++)
		{
			b /= 10;
		}
		int result = b%10;
		return result;
	}

}
