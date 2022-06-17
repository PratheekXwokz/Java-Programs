package com.xworkz.sql.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.xworkz.sql.constants.JDBCProperties.SECRET;
import static com.xworkz.sql.constants.JDBCProperties.URL;
import static com.xworkz.sql.constants.JDBCProperties.USERNAME;

public class ActorSelect {

	public static void main(String[] args) {

		String sql = "SELECT * FROM Actor";
		try (Connection connect = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement prepare = connect.prepareStatement(sql);
			ResultSet result = prepare.executeQuery();
			while (result.next()) {
				int i1 = result.getInt(1);
				String i2 = result.getString(2);
				String i3 = result.getString(3);
				int i4 = result.getInt(4);
				int i5 = result.getInt(5);
				int i6 = result.getInt(6);
				int i7 = result.getInt(7);
				String i8 = result.getString(8);
				boolean i9 = result.getBoolean(9);
				int i10 = result.getInt(10);
				int i11 = result.getInt(11);
				int i12 = result.getInt(12);
				String i13 = result.getString(13);
				String i14 = result.getString(14);
				int i15 = result.getInt(15);
				int i16 = result.getInt(16);
				int i17 = result.getInt(17);
				int i18 = result.getInt(18);
				boolean i19 = result.getBoolean(19);
				String i20 = result.getString(20);
				int i21 = result.getInt(21);
				int i22 = result.getInt(22);
				int i23 = result.getInt(23);
				boolean i24 = result.getBoolean(24);
				int i25 = result.getInt(25);
				int i26 = result.getInt(26);
				int i27 = result.getInt(27);
				int i28 = result.getInt(28);
				String i29 = result.getString(29);
				String i30 = result.getString(30);
				String i31 = result.getString(31);
				boolean i32 = result.getBoolean(32);
				String i33 = result.getString(33);
				System.out.println(i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5 + " " + i6 + " " + i7 + " " + i8 + ""
						+ " " + i9 + " " + i10 + " " + i11 + " " + i12 + " " + i13 + " " + i14 + " " + i15 + " " + i16
						+ " " + i17 + " " + i18 + " " + i19 + " " + i20 + " " + i21 + " " + i22 + " " + i23 + " " + i24
						+ " " + i25 + " " + i26 + " " + i27 + " " + i28 + " " + i29 + " " + i30 + " " + i31 + " " + i32
						+ " " + i33);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}