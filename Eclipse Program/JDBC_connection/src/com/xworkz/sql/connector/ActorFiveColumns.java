package com.xworkz.sql.connector;

import static com.xworkz.sql.constants.JDBCProperties.SECRET;
import static com.xworkz.sql.constants.JDBCProperties.URL;
import static com.xworkz.sql.constants.JDBCProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ActorFiveColumns {

	public static void main(String[] args) {
		String sql = "SELECT id,name,place,success_rate,debut_movie FROM Actor";
		try (Connection connect = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement prepare = connect.prepareStatement(sql);
			ResultSet result = prepare.executeQuery();
			while (result.next()) {
				int i1 = result.getInt("id");
				String i2 = result.getString("name");
				String i3 = result.getString("place");
				int i4 = result.getInt("success_rate");
				String i5 = result.getString("debut_movie");
				System.out.println(i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}