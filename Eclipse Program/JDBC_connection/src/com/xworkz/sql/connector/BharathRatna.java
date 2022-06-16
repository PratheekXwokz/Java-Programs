package com.xworkz.sql.connector;

import static com.xworkz.sql.constants.JDBCProperties.SECRET;
import static com.xworkz.sql.constants.JDBCProperties.URL;
import static com.xworkz.sql.constants.JDBCProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BharathRatna {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			System.out.println(connection);
			PreparedStatement prepare = connection.prepareStatement(
					"Insert Into BharathRatna values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
			prepare.setInt(1, 10);
			prepare.setString(2, "C V Raman");
			prepare.setString(3, "Government of India");
			prepare.setString(4, "Rastrapathi Bhavan");
			prepare.setString(5, "New Delhi");
			prepare.setString(6, "Sarvapalli Radhakridhnan");
			prepare.setString(7, "Jawaharlal Nehru");
			prepare.setString(8, "Scientist");
			prepare.setString(9, "Raman Scattering");
			prepare.setString(10, "Prime Minister");
			prepare.setString(11, "Alipur Mints");
			prepare.setInt(12, 5);
			prepare.setInt(13, 90);
			prepare.setString(14, "Female");
			prepare.setInt(15, 1880);
			prepare.setInt(16, 11);
			prepare.setInt(17, 7);
			prepare.setString(18, "married");
			prepare.setString(19, "Lokasundari Ammal");
			prepare.setInt(20, 0);
			prepare.setString(21, "Indian");
			prepare.setString(22, "Madras Province");
			prepare.setString(23, "Tirchy");
			prepare.setString(24, "Tirchy");
			prepare.setString(25, "CR Iyer");
			prepare.setString(26, "Parvathi");
			prepare.setInt(27, 1);
			prepare.setString(28, "Tirchy");
			prepare.setInt(29, 1950);
			prepare.setInt(30, 8);
			prepare.setInt(31, 15);
			prepare.setString(32, "No");
			prepare.setString(33, "No");
			int rowAffected = prepare.executeUpdate();
			System.out.println(rowAffected);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
