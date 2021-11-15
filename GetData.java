package com.greycampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData {

	public static void main(String[] args) {

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySchema", "root", "admin@123");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from new_tbl");
			while(rs.next()) {
				System.out.println(rs.getInt("eno"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getDouble("salary"));
			}
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}

}