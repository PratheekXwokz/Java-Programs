package com.xworkz.sql.connector;

import static com.xworkz.sql.constants.JDBCProperties.SECRET;
import static com.xworkz.sql.constants.JDBCProperties.URL;
import static com.xworkz.sql.constants.JDBCProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryFiveColumns {

	public static void main(String[] args) {
		String sql = "SELECT id,name,presentPM,nationalGDP,TypeOf_Currency FROM Country";
		try (Connection connect = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement prepare = connect.prepareStatement(sql);
			ResultSet result = prepare.executeQuery();
			while (result.next()) {
				int i1 = result.getInt(1);
				String i2 = result.getString("name");
				String i3 = result.getString("presentPM");
				int i4 = result.getInt("nationalGDP");
				String i5 = result.getString("TypeOf_Currency");
				System.out.println(i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}