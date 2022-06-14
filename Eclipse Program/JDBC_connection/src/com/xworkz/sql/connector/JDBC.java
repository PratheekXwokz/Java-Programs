package com.xworkz.sql.connector;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		String connect="com.mysql.cj.jdbc.Driver";
		
			try {
				System.out.println(Inet4Address.getLocalHost().getHostAddress());
			Class.forName(connect);
			System.out.println("Driver Class Name");
			String url="jdbc:mysql://localhost:3306";
			String userName="root";
			String password="13398";
			Connection connection=DriverManager.getConnection(url,userName,password);
			System.out.println(connection);
			} catch (UnknownHostException | ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
