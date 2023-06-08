package cogent.education.corejava;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating string in Java
		//1. string literal
		String s1 = "Chandra";//creating string object by literal - an object of class string is created
		String s2 = "Chandra";
		//1 string object in string pool created
		//2.  by new operator
		String s3 = new String("Chandra");//"Chandra" is created in constant pool
		//new operator - is instructing in runtime to create String object in memory heap.
		//Methods of String class
		System.out.println("Hashcode: " + s1.hashCode());
		System.out.println("Hashcode: " + s3.hashCode());
		//checking equality
		if(s1 == s3)//address checking
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		//equals() is case sensative
		if(s1.equals(s3))//character checking
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		/*
		hashcode - is important in Java to identify the unique objects in memory and relavance of this
		method is in Hashtable.class where we store data uniquely
		*/
	}

}
