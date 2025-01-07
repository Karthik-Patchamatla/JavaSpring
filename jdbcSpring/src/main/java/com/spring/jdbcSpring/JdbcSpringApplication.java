package com.spring.jdbcSpring;

// step 1: Import the Packages
import java.sql.*;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcSpringApplication {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/JdbcConnection";
		String username = "postgres";
		String password = "2003";
		String query = "select * from student";

		try {

			// Step 2: Load and Register the Driver
		    Class.forName("org.postgresql.Driver");

		    // Step 3: Establish the Connection
		    Connection con = DriverManager.getConnection(url, username, password);

		    // Step 4: Create a Statement
		    Statement st = con.createStatement();

		    // Step 5: Process the Results
		    ResultSet rs = st.executeQuery(query);
		    while (rs.next()) {
		        int studentId = rs.getInt("studentid");
				String studentName = rs.getString("studentname");
				int studentMarks = rs.getInt("studentmarks");

				System.out.println(studentId + " -> " + studentName + " -> " + studentMarks);

				// Step 6: Close the Connection
				con.close();
		    }
		} catch (Exception e) {
		    System.out.println(e);
		}
	}
}
