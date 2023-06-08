package cogent.homework.date_6_7;

public class StringOps {
	public static String removeCharAt(String s, int i)
	{
		StringBuilder sb = new StringBuilder(s);
		sb.deleteCharAt(i);
		return sb.toString();
	}
	
	public static int charTypeCount(String s, char c)
	{
		char[] ca = s.toCharArray();
		int count = 0;
		for(char ct:ca)
		{
			if(ct==c)
			{
				count++;
			}
		}
		return count;
	}
	
	public static boolean isAnagram(String s1, String s2)
	{
		boolean result = true;
		if(s1.length() != s2.length())
		{
			result = false;
		}
		else
		{
			for(int i = 0; i<s1.length(); i++)
			{
				int charCount1 = charTypeCount(s1, s1.charAt(i));
				int charCount2 = charTypeCount(s2,s1.charAt(i));
				if(charCount1 != charCount2)
				{
					result = false;
					break;
				}
			}
		}
		return result;
	}
	
	public static boolean isPalandrome(String s)
	{
		String p = new StringBuilder(s).reverse().toString();
		return p.equals(s);
	}
	
	public static boolean vowelOrConsenant(char c)
	{
		return Character.isLetter(c);
	}
	public static boolean isDigit(char c)
	{
		return Character.isDigit(c);
	}
	
	public static String deleteVowels(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		for(int i = sb.length()-1; i >= 0; i--)
		{
			if(isVowel(sb.charAt(i)))
			{
				sb.deleteCharAt(i);
			}
		}
		return sb.toString();
	}
	
	public static int letterCount(String s)
	{
		int count = 0;
		char[] ca = s.toCharArray();
		for(char c:ca)
		{
			if(Character.isLetter(c))
			{
				count++;
			}
		}
		return count;
	}
	
	public static char mostFrequentChar(String s)
	{
		char[] ca = s.toCharArray();
		char r = ca[0];
		int hc = charTypeCount(s,r);
		for(char c:ca)
		{
			if(c != r)
			{
				int cc= charTypeCount(s,c);
				if(cc > hc)
				{
					hc = cc;
					r = c;
				}
			}
		}
		return r;
	}
	
	public static String replaceFirstVowel(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		for(int i = 0; i < s.length(); i++)
		{
			if(isVowel(s.charAt(i)))
			{
				sb.setCharAt(i, '-');
				break;
			}
		}
		return sb.toString();
	}
	
	public static int countNotBlank(String s)
	{
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(!Character.isWhitespace(s.charAt(i)))
			{
				count++;
			}
		}
		return count;
	}
	
	public static String deleteBlank(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		for(int i = sb.length()-1; i >= 0; i--)
		{
			if(Character.isWhitespace(sb.charAt(i)))
			{
				sb.deleteCharAt(i);
			}
		}
		return sb.toString();
	}
	
	public static String removeRepeatChar(String s)
	{
		String r = "";
		for(int i = 0; i < s.length(); i++)
		{
			String t = s.substring(i, i+1);
			if(!r.contains(t))
			{
				StringBuilder sb = new StringBuilder(r);
				sb.append(s.charAt(i));
				r = sb.toString();
			}
		}
		return r;
	}
	
	public static int sumOfStringNums(String s)
	{
		char[] ca = s.toCharArray();
		int r = 0;
		for(char c: ca)
		{
			if(isDigit(c))
			{
				r += Character.getNumericValue(c);
			}
		}
		return r;
	}
	
	public static void printNorRepeating(String s)
	{
		System.out.print("Nonrepeating characters in " + s + ": ");
		char[] ca = s.toCharArray();
		for(char c: ca)
		{
			if(charTypeCount(s,c) == 1)
			{
				System.out.print(c + " ");
			}
		}
		System.out.println();
	}
	
	public static String sortAscending(String s)
	{
		StringBuilder sc = new StringBuilder(s);
		for(int i = 0; i < sc.length(); i++)
		{
			for(int j = i; j< sc.length(); j++)
			{
				if(Character.compare(sc.charAt(i), sc.charAt(j)) > 0)
				{
					char temp = sc.charAt(i);
					sc.setCharAt(i, sc.charAt(j));
					sc.setCharAt(j, temp);
				}
			}
		}
		return sc.toString();
	}
	public static String sortDecending(String s)
	{
		StringBuilder sc = new StringBuilder(s);
		for(int i = 0; i < sc.length(); i++)
		{
			for(int j = i; j< sc.length(); j++)
			{
				if(Character.compare(sc.charAt(i), sc.charAt(j)) < 0)
				{
					char temp = sc.charAt(i);
					sc.setCharAt(i, sc.charAt(j));
					sc.setCharAt(j, temp);
				}
			}
		}
		return sc.toString();
	}
	
	public static boolean isVowel(char c)
	{
		boolean r = true;
		switch(c)
		{
		case 'a':
			break;
		case 'e':
			break;
		case 'i':
			break;
		case 'o':
			break;
		case 'u':
			break;
		default:
			r = false;
			break;
		}
		return r;
	}
}
