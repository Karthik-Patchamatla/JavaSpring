import java.sql.*;

public class JdbcConnection {

    // Step 1: Import the packages
    // Step 2: Load and register the Driver (Optional)
    // Step 3: Create a Connection
    // Step 4: Execute a Statement
    // Step 5: Process the Results
    // Step 6: Close the connection

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/JdbcConnection";
        String username = "postgres";
        String password = "2003";
        String query = "select * from student";

        try {
            // Load and register the driver (optional in modern versions)
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connection Established");

            // Exceute a Statement
            Statement st = con.createStatement();

            ResultSet result = st.executeQuery(query);

            // Process the Results
            // result.next(): Gives the boolean as output
            while (result.next()) {
                int studentId = result.getInt("studentid");
                String studentName = result.getString("studentname");
                int studentMarks = result.getInt("studentmarks");

                System.out.println(studentId + " -> " + studentName + " -> " + studentMarks);
            }

            // Always close the connection when done
            con.close();
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e);
        }
    }
}
