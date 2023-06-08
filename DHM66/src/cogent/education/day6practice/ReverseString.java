package cogent.education.day6practice;

public class ReverseString {
	public static String Reverse(String s1) {
		int length = s1.length();
		char temp[] = new char[length];
		for(int i = length; i > 0 ; i--)
		{
			temp[length-i] = s1.charAt(i-1);
		}
		String s2 = String.copyValueOf(temp);
		System.out.println(s2);
		return s2;
	}
	public static boolean Palendrome(String s1)
	{
		String reverse = Reverse(s1);
		if(s1.equals(reverse))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
