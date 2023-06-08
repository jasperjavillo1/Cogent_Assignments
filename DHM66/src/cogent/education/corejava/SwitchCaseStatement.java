package cogent.education.corejava;
import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: 1 / 2 / 3 / 4 / exit");
		int a = sc.nextInt();
		switch(a)	//can use String, integer, char, and enum
		{
		case 1: System.out.println("Addition");
				break;//branching statement
		case 2: System.out.println("Subtraction");
				break;
		case 3: System.out.println("Multiplition");
				break;
		case 4: System.out.println("Division");
				break;
		default: System.out.println("Invalid Option");
				break;
		}
		sc.close();
	}

}
