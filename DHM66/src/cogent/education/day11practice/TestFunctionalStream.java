package cogent.education.day11practice;
import java.util.Comparator;
//display list of integers//Collection
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestFunctionalStream
{
	public static void main(String[] args)
	{
		List<Integer> numbers = List.of(12,34,56,11,29,34);
		//getIntegers(numbers);
		//getEvenList(numbers);
		System.out.println(getSumEvenSquares(numbers));
		//List<String> names = List.of("Adeline","Ben","Carly","Dennis","Edward","Fred","George");
		//filterString(names);
		//List<Integer> numbers = List.of(1,2,3,4,5);
		//System.out.println(getFactorial(numbers));
		//getUnique(numbers);
		CustomFunc f1=()->System.out.println("f1 run");
		f1.run();
	}
	public static void put(int num)
	{
		System.out.println(num);
	}
	
	public static boolean isEven(int num)
	{
		if(num%2 == 0)
			return true;
		else
			return false;
	}
	
	public static void getIntegers(List<Integer> list)
	{
		Stream<Integer> s = list.stream();
		//s.forEach(TestFunctionalStream::put);//static method reference
		//s.forEach(x->System.out.println(x));//Method reference anonymously
		s.forEach(System.out::println);
		//forEach which is taking a parameter an the parameter is a consumer function
	}
	
	public static void getEvenList(List<Integer> list)
	{
		//Functional programming
		Stream<Integer>s = list.stream();
		//s.filter(TestFunctionalStream::isEven).forEach(System.out::println);
		Predicate<? super Integer> predicate = x->x%2==0;
		Consumer<? super Integer> c = System.out::println;
		s.filter(predicate).map(x->x*x).forEach(c);
	}
	
	public static Optional<Integer> getSumEvenSquares(List<Integer> list)
	{
		Stream<Integer> s = list.stream();
		return s.filter(x->x%2==0).map(x->x*x).reduce((x,y)->x+y);
	}
	
	public static void filterString(List<String> l)
	{
		l.stream().filter(x->x.length()>4).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
	public static Optional<Integer> getFactorial(List<Integer> n)
	{
		return n.stream().filter(x->x>0).reduce((x,y)->(x*y));
	}
	
	public static void getUnique(List<Integer>list)
	{
		list.stream().distinct().forEach(System.out::println);
	}
}
