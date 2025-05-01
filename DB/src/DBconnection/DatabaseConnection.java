package DBconnection;

import java.net.InetAddress;
import java.sql.*;

public class DatabaseConnection {

    public static void main(String[] args) {
        try {
            // Get the IP address of the current device
            String hostIP = InetAddress.getLocalHost().getHostAddress();

            // Build the connection URL
            String url = "jdbc:mysql://" + hostIP + ":3306/EventSphere";
            String username = "Archita";
            String password = "5{Qy7766";

            // Connect
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully!");

            // Query the admin table
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM admin");

            // Print the results
            System.out.println("Admin Table:");
            while (rs.next()) {
                int id = rs.getInt("admin_id");
                String name = rs.getString("name");
                String dept = rs.getString("department");
                String email = rs.getString("email");

                System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + dept + ", Email: " + email);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
