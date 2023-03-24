package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Shiveen@1705");

		Statement st = con.createStatement();

		ResultSet result = st.executeQuery("Select * from eproduct");

		while (result.next()) {

			System.out.println("Product ID " + result.getInt("ID"));

			System.out.println("Product Name " + result.getString("name"));
		}
		con.close();

	}

}
