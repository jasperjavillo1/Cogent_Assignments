package cogent.education.corejava;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortNames();

	}
	public static void SortNames() {
		Scanner sc = new Scanner(System.in);
		String names[] = new String[5];
		for(int i = 0; i < names.length; i++)
		{
			System.out.println("Enter Name:");
			names[i] = sc.nextLine();
		}
		for(int i = 0; i < names.length; i++)
		{
			for(int j = i+1; j < names.length; j++)
			{
				if(i != j)
				{
					int comp = names[i].compareTo(names[j]);
					if(comp > 0)
					{
						String temp = names[i];
						names[i] = names[j];
						names[j] = temp;
					}
				}
			}
		}
		for(String name:names)
			System.out.println(name);
		sc.close();
	}
}
