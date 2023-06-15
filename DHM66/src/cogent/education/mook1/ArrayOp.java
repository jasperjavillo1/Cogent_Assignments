package cogent.education.mook1;

public class ArrayOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {12,3,3,45,3,45,11};
		int r[] = removeDup(ar);
		for(int v:r)
		{
			System.out.println(v);
		}
	}
	
	public static int[] removeDup(int[] ar)
	{
		int [] r = new int[1];
		r[0] = ar[0];
		for(int i = 1; i<ar.length; i++)
		{
			if(!contains(r,ar[i]))
			{
				r = add(r,ar[i]);
			}
		}
		return r;
		
	}
	
	public static boolean contains(int[] ar, int t)
	{
		boolean r = false;
		for(int v:ar)
		{
			if(v == t)
				r = true;
		}
		return r;
	}
	
	public static int[] add(int[]ar, int a)
	{
		int[] r = new int[ar.length+1];
		for(int i = 0; i<ar.length; i++)
		{
			r[i]= ar[i];
		}
		r[r.length -1] = a;
		return r;
	}

}
