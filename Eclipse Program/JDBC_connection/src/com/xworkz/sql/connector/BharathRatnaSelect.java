package com.xworkz.sql.connector;

import static com.xworkz.sql.constants.JDBCProperties.SECRET;
import static com.xworkz.sql.constants.JDBCProperties.URL;
import static com.xworkz.sql.constants.JDBCProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BharathRatnaSelect {

	public static void main(String[] args) {
		String sql = "SELECT * FROM BharathRatna";
		try (Connection connect = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement prepare = connect.prepareStatement(sql);
			ResultSet result = prepare.executeQuery();
			while (result.next()) {
				int i1 = result.getInt(1);
				String i2 = result.getString(2);
				String i3 = result.getString(3);
				String i4 = result.getString(4);
				String i5 = result.getString(5);
				String i6 = result.getString(6);
				String i7 = result.getString(7);
				String i8 = result.getString(8);
				String i9 = result.getString(9);
				String i10 = result.getString(10);
				String i11 = result.getString(11);
				int i12 = result.getInt(12);
				int i13 = result.getInt(13);
				String i14 = result.getString(14);
				int i15 = result.getInt(15);
				int i16 = result.getInt(16);
				int i17 = result.getInt(17);
				String i18 = result.getString(18);
				String i19 = result.getString(19);
				int i20 = result.getInt(20);
				String i21 = result.getString(21);
				String i22 = result.getString(22);
				String i23 = result.getString(23);
				String i24 = result.getString(24);
				String i25 = result.getString(25);
				String i26 = result.getString(26);
				int i27 = result.getInt(27);
				String i28 = result.getString(28);
				int i29 = result.getInt(29);
				int i30 = result.getInt(30);
				int i31 = result.getInt(31);
				String i32 = result.getString(32);
				String i33 = result.getString(33);

				System.out.println(i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5 + " " + i6 + " " + i7 + " " + i8 + " "
						+ i9 + " " + i10 + " " + i11 + " " + i12 + " " + i13 + " " + i14 + " " + i15 + " " + i16 + " "
						+ i17 + " " + i18 + " " + i19 + " " + i20 + " " + i21 + " " + i22 + " " + i23 + " " + i24 + " "
						+ i25 + " " + i26 + " " + i27 + " " + i28 + " " + i29 + " " + i30 + " " + i31 + " " + i32 + " "
						+ i33);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
