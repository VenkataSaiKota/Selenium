package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TodoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="root";
		String pass="mysql";
		String url="jdbc:mysql://localhost:3306/cognizant?useSSL=false";
		try {
			Connection con=DriverManager.getConnection(url, username, pass);
			System.out.println("Connected succesfully");
//		    String createData="create table user(id INT PRIMARY KEY,name VARCHAR(20),email VARCHAR(50))";
		    String retrive="select * from user";
		    String update="update  user set name='sathwik' where id=2";
            String delete="delete from user where id=2";
		    PreparedStatement ps=con.prepareStatement(delete);
		    ps.executeUpdate();
//		    while( rs.next()) {
//			    System.out.println(rs.getInt("id") +":"+rs.getString("name")+" "+rs.getString("email"));	
//			    }
		  PreparedStatement s=con.prepareStatement(retrive);
		  
		   ResultSet rs1= s.executeQuery();
//		    while( rs.next()) {
//			    System.out.println(rs.getInt("id") +":"+rs.getString("name")+" "+rs.getString("email"));	
//			    }
		    while( rs1.next()) {
			    System.out.println(rs1.getInt("id") +":"+rs1.getString("name")+" "+rs1.getString("email"));	
			    }
		   
//		    ps.setInt(1, 1);
//		    ps.setString(2,"venkat");
//		    ps.setString(3, "venkat@gmail.com");
//		    ps.executeUpdate();
		    System.out.println("table created succesfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
