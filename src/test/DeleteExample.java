package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Shiveen@1705");

		Statement st = con.createStatement();

		st.executeUpdate("Delete from eproduct where name = 'Television'");

		System.out.println("product is deleted");

		ResultSet result = st.executeQuery("Select * from eproduct");

		while (result.next()) {

			System.out.println("Product ID " + result.getInt("ID"));

			System.out.println("Product Name " + result.getString("name"));

			System.out.println("Price " + result.getDouble("price"));
		}
		con.close();

	}

}
