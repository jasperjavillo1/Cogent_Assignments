package cogent.education.corejava;

public class TestString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Pie is tasty.";
		String s2 = "Pie is easy.";
		String s3 = s1.concat(s2);	//concatonate in a seperate memory location.
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		String s4 = s1.substring(0,3);	//creates new String from substring
		System.out.println(s4);
		System.out.println(s1.charAt(5));
		System.out.println(s1.contains(s4));
	}

}
