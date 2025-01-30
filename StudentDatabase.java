import java.sql.*;

public class StudentDatabase {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/student"; // Change DB name if needed
        String user = "root";  // Replace with your MySQL username
        String password = "";  // Replace with your MySQL password

        // SQL Query to join tables and fetch student data with marks
        String query = "SELECT b.stu_id, b.stu_name, b.stu_address, " + "m.chemistry, m.physics, m.maths " + "FROM basicdata b JOIN marks m ON b.stu_id = m.stu_id";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully!");

            // Create Statement
            Statement stmt = conn.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery(query);

            // Print Column Headers
            System.out.println("----------------------------------------------------------------");
            System.out.printf("%-10s %-10s %-15s %-10s %-10s %-10s\n",
                    "Stu_ID", "Name", "Address", "Chemistry", "Physics", "Maths");
            System.out.println("----------------------------------------------------------------");

            // Process and Display Results
            while (rs.next()) {
                System.out.printf("%-10s %-10s %-15s %-10d %-10d %-10d\n",
                        rs.getString("stu_id"),
                        rs.getString("stu_name"),
                        rs.getString("stu_address"),
                        rs.getInt("chemistry"),
                        rs.getInt("physics"),
                        rs.getInt("maths"));
            }

            // Close Connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
