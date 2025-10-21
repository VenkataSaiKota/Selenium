package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo {

	public static void main(String[] args) {
		
		String username="root";
		String password="mysql";
		String address="jdbc:mysql://localhost:3306/cognizant";
		String createTable="create table QEA (employee_id INT AUTO_INCREMENT PRIMARY KEY ,employee_name varchar(50),role varchar(20))";
        String insertData="insert into QEA(employee_name, role) values (?,?)";
        String getData="select * from QEA";
        try {
        	Connection connect=DriverManager.getConnection(address,username,password);
//        	PreparedStatement prepare=connect.prepareStatement(createTable);
         	PreparedStatement prepare=connect.prepareStatement(getData);
//        	prepare.setString(1,"sathwik");
//        	prepare.setString(2, "FrontEndDeveloper");
        	//prepare.executeUpdate();
        	ResultSet rs=prepare.executeQuery();
//        	System.out.println("VALUES inserted  is succesfully ");
        	while(rs.next()) {
        		System.out.println(rs.getInt("employee_id")+" "+ rs.getString("employee_name")+" "+rs.getString("role"));
        		
        	}
        	
        }
        catch(Exception e) {
        	System.out.println(e.getMessage());
        }
	}

}
