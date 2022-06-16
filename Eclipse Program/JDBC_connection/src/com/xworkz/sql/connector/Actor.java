package com.xworkz.sql.connector;

import static com.xworkz.sql.constants.JDBCProperties.SECRET;
import static com.xworkz.sql.constants.JDBCProperties.URL;
import static com.xworkz.sql.constants.JDBCProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Actor {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			System.out.println(connection);
			PreparedStatement prepare = connection.prepareStatement(
					"Insert Into Actor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
			prepare.setInt(1, 9);
			prepare.setString(2, "Ganesh");
			prepare.setString(3, "Male");
			prepare.setInt(4, 1958);
			prepare.setInt(5, 60);
			prepare.setInt(6, 6);
			prepare.setInt(7, 73);
			prepare.setString(8, "Kolar");
			prepare.setBoolean(9, true);
			prepare.setInt(10, 2);
			prepare.setInt(11, 25);
			prepare.setInt(12, 8);
			prepare.setString(13, "Golden Star");
			prepare.setString(14, "Mungaru Male");
			prepare.setInt(15, 2009);
			prepare.setInt(16, 6);
			prepare.setInt(17, 10000000);
			prepare.setInt(18, 100);
			prepare.setBoolean(19, true);
			prepare.setString(20, "Mungaru Male");
			prepare.setInt(21, 5);
			prepare.setInt(22, 10);
			prepare.setInt(23, 6);
			prepare.setBoolean(24, true);
			prepare.setInt(25, 5);
			prepare.setInt(26, 4);
			prepare.setInt(27, 100);
			prepare.setInt(28, 13);
			prepare.setString(29, "Yes");
			prepare.setString(30, "Hero");
			prepare.setString(31, "Rummy Circle");
			prepare.setBoolean(32, true);
			prepare.setString(33, "SSLC");

			int rowAffected = prepare.executeUpdate();
			System.out.println(rowAffected);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
