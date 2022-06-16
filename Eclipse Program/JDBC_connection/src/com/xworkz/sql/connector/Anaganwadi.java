package com.xworkz.sql.connector;

import static com.xworkz.sql.constants.JDBCProperties.SECRET;
import static com.xworkz.sql.constants.JDBCProperties.URL;
import static com.xworkz.sql.constants.JDBCProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Anaganwadi {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
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
