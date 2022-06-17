package com.xworkz.sql.connector;

import static com.xworkz.sql.constants.JDBCProperties.SECRET;
import static com.xworkz.sql.constants.JDBCProperties.URL;
import static com.xworkz.sql.constants.JDBCProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Apartment {
	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			System.out.println(connection);

			String apt1 = "INSERT into apartment values(1,'Oracle Apartments','Bengaluru','BTM',100,15,123,2,7500,'99837373','9827383738',1,0);";
			String apt2 = "INSERT into apartment values(2,'Ramesh Apartments','Mangalore','KSRTC busstop',100,15,123,2,7500,'99837374','9827383737',1,0);";
			String apt3 = "INSERT into apartment values(3,'Suhas Apartments','Shivamogga','JNNCE college',100,15,123,2,7500,'99837375','9827383736',1,0);";
			String apt4 = "INSERT into apartment values(4,'Laxmi Apartments','Belgaum','VTU',100,15,123,2,7500,'99837376','9827383736',1,0);";
			String apt5 = "INSERT into apartment values(5,'Shwetha Apartments','Goa','Church',100,15,123,2,7500,'99837377','9827383734',1,0);";

			Statement statement = connection.createStatement();
			int ref1 = statement.executeUpdate(apt1);

			System.out.println(ref1);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
