package com.xworkz.sql.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Xworkz_BTM_March7th";
		String userName = "root";
		String password = "13398";
		try(Connection connection=DriverManager.getConnection(url, userName, password)){
			System.out.println(connection);
			
			String customer="INSERT INTO Customer VALUES(2,'Ramesh',28,'Male','Engineer','Jaydeva',"
					+ "'Bengaluru','Karnataka',0,9646275656,'D MArt','Gottigere',250002,20,10000,10,9000);";

			String customer1="INSERT INTO Customer VALUES(3,'Suhas',25,'Male','Scientist','Mico Layout',"
					+ "'Bengaluru','Karnataka',1,9646275098,'D MArt','Gottigere',250003,15,5000,10,4500);";
			

			String customer2="INSERT INTO Customer VALUES(4,'Swetha',24,'Female','Developer','BTM',"
					+ "'Bengaluru','Karnataka',1,9006275656,'D MArt','Gottigere',250004,30,15000,10,14000);";
			

			String customer3="INSERT INTO Customer VALUES(5,'Lakshmi',23,'Female','Engineer','Jaydeva',"
					+ "'Bengaluru','Karnataka',0,9640075656,'D MArt','Gottigere',250005,35,25000,10,24000);";
			Statement statement=connection.createStatement();
			int reg=statement.executeUpdate(customer3);
			System.out.println(reg);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
