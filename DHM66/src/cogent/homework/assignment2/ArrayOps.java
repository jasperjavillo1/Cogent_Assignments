package cogent.homework.assignment2;

public class ArrayOps {
	public static String[] sortNames(String [] sa)
	{
		for(int i = 0; i < sa.length; i++)
		{
			for(int j =i; j<sa.length; j++)
			{
				if(sa[i].compareToIgnoreCase(sa[j])>0)
				{
					String t = sa[i];
					sa[i] = sa[j];
					sa[j] = t;
				}
			}
		}
		return sa;
	}
	
	public static int sequencialSearch(int[] ar, int t)
	{
		for(int i = 0; i < ar.length; i++)
		{
			if(ar[i] == t)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void print(String[] a)
	{
		for(String s:a)
		{
			System.out.println(s);
		}
	}
	public static void print(int[] a)
	{
		for(int i:a)
		{
			System.out.println(i);
		}
	}
}
