package com.xworkz.sql.connector;

import static com.xworkz.sql.constants.JDBCProperties.SECRET;
import static com.xworkz.sql.constants.JDBCProperties.URL;
import static com.xworkz.sql.constants.JDBCProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Movie {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			System.out.println(connection);
			PreparedStatement prepare = connection.prepareStatement(
					"Insert Into Movie values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
			prepare.setInt(1, 10);
			prepare.setString(2, "Vedalam");
			prepare.setString(3, "Ajith");
			prepare.setString(4, "Nayantara");
			prepare.setString(5, "Jack Manju");
			prepare.setString(6, "Tamil");
			prepare.setString(7, "Top Productions");
			prepare.setInt(8, 50);
			prepare.setInt(9, 1200);
			prepare.setString(10, "Dhanush");
			prepare.setString(11, "Ravi");
			prepare.setString(12, "Charan");
			prepare.setInt(13, 2022);
			prepare.setInt(14, 200);
			prepare.setString(15, "India");
			prepare.setString(16, "Vivek");
			prepare.setString(17, "Police");
			prepare.setInt(18, 3);
			prepare.setInt(19, 9);
			prepare.setString(20, "Prjwal");
			prepare.setString(21, "Stuart");
			prepare.setString(22, "Praveen");
			prepare.setInt(23, 20);
			prepare.setInt(24, 75);
			prepare.setInt(25, 10);
			prepare.setInt(26, 800);
			prepare.setInt(27, 900);
			prepare.setInt(28, 0);
			prepare.setInt(29, 65);
			prepare.setInt(30, 15);
			prepare.setString(31, "richa");
			prepare.setString(32, "Disney Studio");
			prepare.setString(33, "Chennai");

			int rowAffected = prepare.executeUpdate();
			System.out.println(rowAffected);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
