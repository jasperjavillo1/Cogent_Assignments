package cogent.education.day6practice2;

public class Armstrong {
	public static boolean IsArmstrong(int a)
	{
		/*
		 input 153
		 1^(digits) + 5^(digits) + 3^(digits) = 153
		 */
		int digitCount = 0;
		int hold = a;
		while(hold > 0)
		{
			hold /=10;
			digitCount++;
		}
		int[] digits = new int[digitCount];
		for(int i = 0; i < digits.length; i++)
		{
			hold = a;
			for(int j = 0; j < i; j++)
			{
				hold /=10;
			}
			digits[i] = hold % 10;
		}
		int result = 0;
		for(int value: digits)
		{
			int part = 1;
			for(int i = 0; i < digitCount; i++)
			{
				part *= value;
			}
			result += part;
		}
		return result == a;
	}
}
