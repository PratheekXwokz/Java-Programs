package com.xworkz.sql.connector;

import static com.xworkz.sql.constants.JDBCProperties.SECRET;
import static com.xworkz.sql.constants.JDBCProperties.URL;
import static com.xworkz.sql.constants.JDBCProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IPLTeams {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			System.out.println(connection);
			PreparedStatement prepare = connection.prepareStatement(
					"Insert Into IPLteam values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
			prepare.setInt(1, 10);
			prepare.setString(2, "Rajasthan Royals");
			prepare.setString(3, "Keith Mudroch");
			prepare.setString(4, "Sanju Samson");
			prepare.setString(5, "Jos Butler");
			prepare.setString(6, "Kumar Sangakkara");
			prepare.setString(7, "Sanju Samson");
			prepare.setInt(8, 26);
			prepare.setInt(9, 13);
			prepare.setInt(10, 9);
			prepare.setInt(11, 3);
			prepare.setInt(12, 3);
			prepare.setInt(13, 20);
			prepare.setString(14, "Rajasthan");
			prepare.setString(15, "Jaipur");
			prepare.setString(16, "Rajasthan Stadium");
			prepare.setInt(17, 25);
			prepare.setString(18, "Fox Entertainment");
			prepare.setInt(19, 8);
			prepare.setInt(20, 0);
			prepare.setString(21, "Sanju Samson");
			prepare.setString(22, "Ashwin");
			prepare.setInt(23, 3);
			prepare.setInt(24, 4);
			prepare.setInt(25, 75);
			prepare.setInt(26, 3);
			prepare.setInt(27, 0);
			prepare.setString(28, "Jos Butler");
			prepare.setString(29, "Jos Butler");
			prepare.setString(30, "Archer");
			prepare.setString(31, "Archer");
			prepare.setInt(32, 500);
			prepare.setInt(33, 4);
			int rowAffected = prepare.executeUpdate();
			System.out.println(rowAffected);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
