package turpin.udemy.java12.java7.trycatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryCatch {

	public static void tryCatch() {
		String url = "jdbc:mysql://localhost/employee";
		String user = "root";
		String password = "root";
		String query = "SELECT id, name FROM employee";
		String jdbcDriver = "com.mysql.jdbc.Driver";

		// Resources that may cause an exception. Automatically closed without memory leak
		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {

			Class.forName(jdbcDriver);
			while (rs.next()) {
				System.out.print("Employee ID: " + rs.getInt("id"));
				System.out.println(", Name: " + rs.getString("name"));
			}
			System.out.print("End TryWithResourceFromJava7 !");

		} catch (SQLException | ClassNotFoundException se) {
			se.printStackTrace();

		// Finally is optional
		} finally {
//			con.close();
//			stmt.close();
//			rs.close();
		}
	}

}
