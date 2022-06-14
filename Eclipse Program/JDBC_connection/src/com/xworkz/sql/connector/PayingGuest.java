package com.xworkz.sql.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PayingGuest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Xworkz_BTM_March7th";
		String userName = "root";
		String password = "13398";
		try (Connection connection = DriverManager.getConnection(url, userName, password)) {
			System.out.println(connection);
			String guest = "INSERT INTO Paying_Guest VALUES(2,'Raghu',25,'Male','Developer','BTM',"
					+ "'Bengaluru','Karnataka',1,9876983210,'Accenture','Diary Circle',560089,25,5000,100,500);";

			String guest1 = "INSERT INTO Paying_Guest VALUES(3,'Nikhil',24,'Male','Sports','BTM',"
					+ "'Bengaluru','Karnataka',1,9876983210,'Accenture','Diary Circle',560089,25,5000,100,500);";

			String guest2 = "INSERT INTO Paying_Guest VALUES(4,'Ranjitha',22,'Female','Developer','BTM',"
					+ "'Bengaluru','Karnataka',1,9876983210,'IBM','Marthalli',560079,25,7500,100,500);";

			String guest3 = "INSERT INTO Paying_Guest VALUES(5,'Arpitha',22,'Female','Scientist','BTM',"
					+ "'Bengaluru','Karnataka',1,9876983210,'ISRO','Ashok Nagar',560098,25,7500,100,500);";

			Statement statement = connection.createStatement();
			int reg = statement.executeUpdate(guest3);
			System.out.println(reg);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
