package cogent.education.day6practice;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String enter = sc.nextLine();
		LongestPalendrome.LongestPal(enter);
		sc.close();
	}

}
