package cogent.education.day11practice;
//display list of integers//Collection
import java.util.List;




public class TestStructureStream
{
	public static void main(String[] args)
	{
		List<Integer> numbers = List.of(12,34,56,11,29,34);
		getIntegers(numbers);
	}
	public static void getIntegers(List<Integer> list)
	{
		for(int a:list)
		{
			System.out.println(a);
		}
	}
}
