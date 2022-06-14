package com.xworkz.sql.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Anaganwadi {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Xworkz_BTM_March7th";
		String userName = "root";
		String password = "13398";
		try (Connection connection = DriverManager.getConnection(url, userName, password)) {
			System.out.println(connection);

			String ang = "INSERT INTO Anganwadi VALUES(2,'Jayanagar',22,0,'Lakshmi');";
			String ang1 = "INSERT INTO Anganwadi VALUES(3,'Suntikoppa',40,0,'Ramesh');";
			String ang2 = "INSERT INTO Anganwadi VALUES(4,'Madikeri',54,1,'Sanjay');";
			String ang3 = "INSERT INTO Anganwadi VALUES(5,'Virajpet',32,1,'Swetha');";

			Statement statement = connection.createStatement();
			int reg = statement.executeUpdate(ang3);
			System.out.println(reg);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
