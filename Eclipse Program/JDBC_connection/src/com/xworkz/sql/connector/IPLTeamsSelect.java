package com.xworkz.sql.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.xworkz.sql.constants.JDBCProperties.*;

public class IPLTeamsSelect {

	public static void main(String[] args) {
		String sql = "SELECT * FROM IPLTeam";
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
				int i8 = result.getInt(8);
				int i9 = result.getInt(9);
				int i10 = result.getInt(10);
				int i11 = result.getInt(11);
				int i12 = result.getInt(12);
				int i13 = result.getInt(13);
				String i14 = result.getString(14);
				String i15 = result.getString(15);
				String i16 = result.getString(16);
				int i17 = result.getInt(17);
				String i18 = result.getString(18);
				int i19 = result.getInt(19);
				int i20 = result.getInt(20);
				String i21 = result.getString(21);
				String i22 = result.getString(22);
				int i23 = result.getInt(23);
				int i24 = result.getInt(24);
				int i25 = result.getInt(25);
				int i26 = result.getInt(26);
				int i27 = result.getInt(27);
				String i28 = result.getString(28);
				String i29 = result.getString(29);
				String i30 = result.getString(30);
				String i31 = result.getString(31);
				String i32 = result.getString(32);
				int i33 = result.getInt(33);
				System.out.println(i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5 + " " + i6 + " " + i7 + " " + i8 + ""
						+ " " + i9 + " " + i10 + " " + i11 + " " + i12 + " " + i13 + " " + i14 + " " + i15 + " " + i16
						+ " " + i17 + " " + i18 + " " + i19 + " " + i20 + " " + i21 + " " + i22 + " " + i23 + " " + i24
						+ " " + i25 + " " + i26 + " " + i27 + " " + i28 + " " + i29 + " " + i30 + " " + i31 + " " + i32
						+ " " + i33);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
