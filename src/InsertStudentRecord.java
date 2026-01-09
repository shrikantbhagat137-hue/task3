import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        Statement st = null;

        try {
            // load driver
            Class.forName("oracle.jdbc.OracleDriver");

            // connect to DB
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE",
                    "system",
                    "shri@2309");

            // take input
            System.out.print("Enter student id: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            // build query
            String sql = "INSERT INTO students (id, name, age) VALUES ("
                    + id + ", '" + name + "', " + age + ")";

            st = con.createStatement();
            int rows = st.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Record inserted successfully!");
            } else {
                System.out.println("Something went wrong, no record added.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                // ignore
            }
            sc.close();
        }
    }
}
