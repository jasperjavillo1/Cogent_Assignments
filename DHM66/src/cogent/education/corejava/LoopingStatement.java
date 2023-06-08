package cogent.education.corejava;

public class LoopingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//looping statement
		//repetition of job
		for(int i = 1; i <= 1000; i++)
		{
			if(i%2 == 0)
				System.out.println(i);
		}
		
		//for each loop
		int a[] = {12, 23, 45};
		for(int value:a)
			System.out.println(value);
		
		//while loop
		int i = 1;
		while(i <= 1000)
		{
			System.out.println(i);
			i++;
		}
		
		//do while loop
		int j = 1;
		do
		{
			System.out.println(j);
			j++;
		}while(j <10000);
	}

}
