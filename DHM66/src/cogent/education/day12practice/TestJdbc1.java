package cogent.education.day12practice;
import java.sql.*;
import java.util.Scanner;
public class TestJdbc1 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(c);
		String url = "jdbc:mysql://localhost/javademo";
		String user = "root";
		String password = "Cumberland10!";
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("Connection: " + con);
		//Statement stmt = con.createStatement();
		//String query = "create table if not exists employee(id int primary key, name varchar(26), email varchar(50))";
		//stmt.executeUpdate(query);
		//table is created
		Scanner sc = new Scanner(System.in);
		String query = "insert into employee value(?,?,?)";
		PreparedStatement stmt = con.prepareStatement(query);
		int count = 0;
		while(true)
		{
			if(count == 5)
				break;
			System.out.println("Enter ID:");
			int id = sc.nextInt();
			sc = new Scanner(System.in);
			System.out.println("Enter Name:");
			String name = sc.nextLine();
			System.out.println("Enter Email:");
			String email = sc.nextLine();
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.executeUpdate();
			count++;
		}
	}

}
