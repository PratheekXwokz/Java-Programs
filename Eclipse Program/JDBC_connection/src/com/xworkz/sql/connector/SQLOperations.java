package com.xworkz.sql.connector;

import static com.xworkz.sql.constants.JDBCProperties.SECRET;
import static com.xworkz.sql.constants.JDBCProperties.URL;
import static com.xworkz.sql.constants.JDBCProperties.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLOperations {

	public static void main(String[] args) {
		String sql = "SELECT COUNT(*) FROM Actor";
		String sql1= "SELECT SUM(id) FROM Actor";
		try (Connection connect = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement prepare = connect.prepareStatement(sql);
			PreparedStatement prepare1 = connect.prepareStatement(sql1);
			ResultSet result = prepare.executeQuery();
			ResultSet result1=prepare1.executeQuery();
			result.next();
				int count=result.getInt(1);
				System.out.println("The Total Count is: "+count);
			result1.next();
			int sum=result1.getInt(1);
			System.out.println("The Sum is: "+sum);
			
			

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
