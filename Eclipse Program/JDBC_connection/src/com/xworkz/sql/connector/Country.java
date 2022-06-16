package com.xworkz.sql.connector;

import static com.xworkz.sql.constants.JDBCProperties.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Country {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			System.out.println(connection);
			PreparedStatement prepare = connection.prepareStatement(
					"Insert Into Country values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
			prepare.setInt(1, 10);
			prepare.setString(2, "Canada");
			prepare.setString(3, "English");
			prepare.setInt(4, 17525263);
			prepare.setString(5, "Ottawa");
			prepare.setInt(6, 45);
			prepare.setInt(7, 10);
			prepare.setInt(8, 5);
			prepare.setInt(9, 5);
			prepare.setString(10, "Justin Tradeu");
			prepare.setString(11, "Bear");
			prepare.setString(12, "Orchid");
			prepare.setString(13, "Peacock");
			prepare.setString(14, "Great Lakes");
			prepare.setInt(15, 230);
			prepare.setInt(16, 50);
			prepare.setInt(17, 300);
			prepare.setInt(18, 135);
			prepare.setInt(19, 70);
			prepare.setInt(20, 100);
			prepare.setInt(21, 80);
			prepare.setInt(22, 50);
			prepare.setString(23, "North America");
			prepare.setInt(24, 1000);
			prepare.setInt(25, 800);
			prepare.setInt(26, 150);
			prepare.setInt(27, 300);
			prepare.setInt(28, 2);
			prepare.setInt(29, 20);
			prepare.setInt(30, 80);
			prepare.setInt(31, 400000);
			prepare.setString(32, "Canadian Dollar");
			prepare.setInt(33, 9);

			int rowAffected = prepare.executeUpdate();
			System.out.println(rowAffected);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
