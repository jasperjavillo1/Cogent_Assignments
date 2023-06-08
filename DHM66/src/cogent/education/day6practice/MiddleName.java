package cogent.education.day6practice;

public class MiddleName {
	public static void Middle (String s)
	{
		StringBuilder s1 = new StringBuilder(s);
		int[] spaces = new int[2];
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == ' ')
			{
				if(spaces[0] == 0)
				{
					spaces[0] = i;
				}
				else
				{
					spaces[1] = i;
				}
			}
		}
		if(spaces[1] != 0)
		{
			s1.delete(spaces[1], s1.length());
			s1.delete(0, spaces[0]+1);
			System.out.println(s1);
		}
		else
		{
			System.out.println("No middle name.");
		}
	}
}
