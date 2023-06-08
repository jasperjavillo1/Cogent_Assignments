package cogent.education.corejava;
import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//take input from standard device
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		if(num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		}
		else if(num1 < num2){
			System.out.println(num1 + " is less than " + num2);
		}
		else {
			System.out.println(num1 + " equals " + num2);
		}
		sc.close();
	}

}
