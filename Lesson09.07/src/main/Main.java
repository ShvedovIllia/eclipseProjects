package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static Connection conn;

	public static void main(String[] args) throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/university?useSSL=false";
		String username = "root";
		String password = "1234";
		
		conn = DriverManager.getConnection(dbUrl, username, password);
		System.out.println("Connected? " + !conn.isClosed());
		
		createTable();
		for (int i = 0; i < 60; i++) {
			addStudents(i);
		}
		
//		selectStudents();
		selectStud(10);
		conn.close();
		
	}
	
	public static void createTable() throws SQLException {
		String drop = "drop table if exists student;";
		String query = "Create table student("
				+ "id int primary key auto_increment,"
				+ "fullName varchar(255) not null,"
				+ "city varchar(255) not null,"
				+ "age int not null"
				+ ");";
		
		Statement stat = conn.createStatement();
		stat.execute(drop);
		stat.execute(query);
		System.out.println("Table 'student' created");
		stat.close();
	}
	
	public static void addStudents(int i) throws SQLException {
		String query = "insert into student(fullname, city, age) values (?,?,?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString (1, "john doe" + i);
		ps.setString(2, "Lviv");
		ps.setInt(3, 15);
		
		ps.executeUpdate();
		ps.close();
	}
	
	public static void selectStudents() throws SQLException {
		String query = "select * from student;";
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		List<String> students = new ArrayList<>(); 
		
		while(rs.next()) {
//			System.out.println(rs.getString("fullName"));
			students.add("id:" + rs.getInt("id")+ "\t" + 
						"fullName: " + rs.getString ("fullName") + "\t" + 
						"City: " + rs.getString("city")+ "\t" + 
						"Age: " + rs.getInt("age"));
		}
		students.forEach(System.out::println);
		
		rs.close();
		ps.close();
	}
	
	public static void selectStud(int i) throws SQLException{
		String query = "select * from student where id = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setInt(1, i);
		ResultSet rs = ps.executeQuery();
		

		
		while(rs.next()) {
			System.out.println("id:" + rs.getInt("id")+ "\t" + 
					"fullName: " + rs.getString ("fullName") + "\t" + 
					"City: " + rs.getString("city")+ "\t" + 
					"Age: " + rs.getInt("age"));
		}
		rs.close();
		ps.close();
	}

}
