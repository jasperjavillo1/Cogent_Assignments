package cogent.homework.assignment1;

public class NumberOps {
	public static boolean isPrime(int n)
	{
		boolean result = true;//assumes prime
		for(int i = 2; i <= n/2 ; i++)//loop iterates through all possible divisors greater than 1
		{
			if(n%i == 0)//if there is a non-1 divisor, the number is not prime
			{
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static boolean isPalendrome(int n)
	{
		int [] d = getDigits(n);
		d = reverseArray(d);
		int p = digitsToNum(d);
		return n == p;
	}
	
	public static int swapDigits(int n,int d1, int d2)
	{
		int[] d = getDigits(n);
		d= swapArrayEntries(d,d1,d2);
		return digitsToNum(d);
	}
	
	public static void getPrimeFactor(int n)
	{
		System.out.print("Prime Factors of " + n + ": ");
		for(int i = 2; i< n; i++)
		{
			while(n%i == 0) {
				System.out.print(i+", ");
	            n = n/i;
			}
	    }
		if(n >2)
		{
			System.out.print(n);
	    }
		System.out.println();
	}
	
	public static int reverseInt(int n)
	{
		int[] d = getDigits(n);
		d= reverseArray(d);
		return digitsToNum(d);
	}

	public static int[] getDigits(int n)//returns digits as array
	{
		int digC = getDigitCount(n);
		int d[] = new int[digC];
		for(int i = 0; i < digC; i++)
		{
			int temp = n / expo(10,(digC-i)-1);
			temp %= 10;
			d[i] = temp;
		}
		return d;
	}
	
	public static int getDigitCount(int n)//return number of digits
	{
		int temp = n;
		int count = 0;
		while(temp > 0)
		{
			temp /=10;
			count++;
		}
		return count;
	}
	
	public static int expo(int n, int p)//exponents
	{
		int r = 1;
		for(int i = 0; i < p; i++)
		{
			r *=n;
		}
		return r;
	}
	public static int digitsToNum(int[] d)//takes an array of digits and makes an int
	{
		int r = 0;
		for(int i = 0; i < d.length; i++)
		{
			r += d[i] * expo(10, (d.length - 1)-i);
		}
		return r;
	}
	public static int[] reverseArray(int[] a)//reverses order of array
	{
		for(int i = 0; i < a.length/2; i++)
		{
			a = swapArrayEntries(a,i,a.length-i-1 );
		}
		return a;
	}
	
	public static int[] swapArrayEntries(int[] a, int i1, int i2)//swaps two entries in an array
	{
		int temp = a[i1];
		a[i1] = a[i2];
		a[i2] = temp;
		return a;
	}
}
