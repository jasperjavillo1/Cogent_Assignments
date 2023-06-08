package cogent.education.corejava;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("Chandra");
		StringBuilder sb2 = new StringBuilder("Chandra");
		System.out.println(sb1);
		System.out.println(sb2);
		//adding string in buffer/builder
		sb1.append("kant");
		sb2.append("kant");
		System.out.println(sb1);
		System.out.println(sb2);
		//inserting string in middle of buffer/builder
		sb1.insert(10, "Trainer");
		sb2.insert(10, "Trainer");
		System.out.println(sb1);
		System.out.println(sb2);
		//Delete String in middle of buffer/builder
		sb1.delete(5, 10);
		sb2.delete(5, 10);
		System.out.println(sb1);
		System.out.println(sb2);
		//Reverse String
		sb1.reverse();
		sb2.reverse();
		System.out.println(sb1);
		System.out.println(sb2);
	}

}
