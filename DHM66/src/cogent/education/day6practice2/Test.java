package cogent.education.day6practice2;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		System.out.println("Is Armstrong: " + Armstrong.IsArmstrong(sc.nextInt()));
		sc.close();
	}

}
