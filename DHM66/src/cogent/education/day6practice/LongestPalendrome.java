package cogent.education.day6practice;

public class LongestPalendrome {
	public static void LongestPal(String s)
	{
		int spaceCount = 0;
		StringBuilder s1 = new StringBuilder(s);
		for(int i = 0; i < s1.length(); i++) //count spaces
		{
			if(s1.charAt(i) == ' ')
			{
				spaceCount++;
			}
		}
		int[] spaceLocations = new int[spaceCount];//array of space indexes
		StringBuilder[] sS = new StringBuilder[spaceCount+1];
		int currentIndex = 0;
		for(int i = 0; i < s1.length(); i++) //count spaces
		{
			if(s1.charAt(i) == ' ')
			{
				spaceLocations[currentIndex] = i;
				currentIndex++;
			}
		}
		for(int i = 0; i < sS.length; i++)//seperate words
		{
			if(i == 0)
			{
				sS[i] = s1.delete(spaceLocations[i], s1.length());
			}
			else if(i == sS.length - 1)
			{
				sS[i] = s1.delete(0,spaceLocations[i-1]+1);
			}
			else
			{
				s1.delete(spaceLocations[i],s1.length());
				sS[i] = s1.delete(0,spaceLocations[i-1]);
			}
			s1 = new StringBuilder(s);
		}
		StringBuilder longest = null;
		for(int i = 0; i < sS.length; i++)
		{
			if(ReverseString.Palendrome(sS[i].toString()))//checks if palendrome
			{
				if(longest == null)
				{
					longest = sS[i];
				}
				else
				{
					if(sS[i].length() > longest.length())
					{
						longest = sS[i];
					}
				}
			}
		}
		System.out.println(longest);
	}
}
