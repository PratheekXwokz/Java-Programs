package com.xworkz.sql.connector;

import static com.xworkz.sql.constants.JDBCProperties.SECRET;
import static com.xworkz.sql.constants.JDBCProperties.URL;
import static com.xworkz.sql.constants.JDBCProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Waterfalls {
	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			System.out.println(connection);

			String falls1 = "INSERT into waterfalls values(1,'Jog',200,'Bhatkal','Karnataka','8.30','6.00','259',9,4.5,30000);";
			String falls2 = "INSERT into waterfalls values(2,'TK',100,'Bengaloru','Karnataka','8.30','6.00','259',9,3,25000);";
			String falls3 = "INSERT into waterfalls values(3,'Ggana_Chuki',200,'Bhatkal','Karnataka','8.30','6.00','259',9,4.7,10000);";
			String falls4 = "INSERT into waterfalls values(4,'Megha',200,'Birur','Karnataka','8.30','6.00','259',9,3.5,22000);";
			String falls5 = "INSERT into waterfalls values(5,'Jog',200,'Bhatkal','Karnataka','8.30','6.00','259',9,5,35000);";

			Statement statement = connection.createStatement();
			int ref = statement.executeUpdate(falls1);
			int ref1 = statement.executeUpdate(falls2);
			int ref2 = statement.executeUpdate(falls3);
			int ref3 = statement.executeUpdate(falls4);
			int ref4 = statement.executeUpdate(falls5);

			System.out.println(ref);
			System.out.println(ref1);
			System.out.println(ref2);
			System.out.println(ref3);
			System.out.println(ref4);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
