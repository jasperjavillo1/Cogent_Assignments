package cogent.homework.assignment3;
import java.sql.*;
import java.util.Scanner;
public class JdbcAssignment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(c);
		String url = "jdbc:mysql://localhost/javademo";
		String user = "root";
		String password = "Cumberland10!";
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("Connection: " + con);
		Scanner sc = new Scanner(System.in);
		String query = "create table if not exists student(id int primary key, name varchar(30), city varchar(30))";
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.executeUpdate(query);
		query = "create table if not exists technology(student_id int , tech_id int, university varchar(30), tech varchar(30), constraint technology foreign key (student_id) references student(id))";
		stmt = con.prepareStatement(query);
		stmt.executeUpdate(query);
		query = "insert into student value(?,?,?)";
		stmt = con.prepareStatement(query);
		for(int i = 0; i<3; i++)
		{
			System.out.println("Enter ID:");
			int id = sc.nextInt();
			sc = new Scanner(System.in);
			System.out.println("Enter Name:");
			String name = sc.nextLine();
			System.out.println("Enter City:");
			String city = sc.nextLine();
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, city);
			stmt.executeUpdate();
		}
		query = "insert into technology value(?,?,?,?)";
		stmt = con.prepareStatement(query);
		for(int i = 0; i<3; i++)
		{
			System.out.println("Enter Student ID:");
			int s_id = sc.nextInt();
			System.out.println("Enter Tech ID:");
			int t_id = sc.nextInt();
			sc = new Scanner(System.in);
			System.out.println("Enter University:");
			String uni = sc.nextLine();
			System.out.println("Enter Tech:");
			String tech = sc.nextLine();
			stmt.setInt(1, s_id);
			stmt.setInt(2, t_id);
			stmt.setString(3, uni);
			stmt.setString(4, tech);
			stmt.executeUpdate();
		}
		sc.close();

	}

}
