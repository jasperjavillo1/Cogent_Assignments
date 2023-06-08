package cogent.education.corejava;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer: ");
		int num = sc.nextInt();
		System.out.println(Reverse(num));
		sc.close();

	}
	public static int Reverse(int num) {
		int result = 0;
		int temp = num;
		int len = 0;
		while(temp > 0)
		{
			temp /= 10;
			len++;
		}
		temp = num;
		do
		{
			int factor = 1;
			for(int j = 1; j < len; j++) {
				factor *= 10;
			}
			result += (temp%10) * factor;
			temp /= 10;
			len--;
		}while(len > 0);
		return result;
	}

}
