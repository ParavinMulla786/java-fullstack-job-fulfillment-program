import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {

        Connection con = dbconfig.getConnection();

        try {

            String sql = "SELECT * FROM students";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("-----------------------------");

                System.out.println("Student ID : " + rs.getInt("student_id"));
                System.out.println("First Name : " + rs.getString("first_name"));
                System.out.println("Last Name  : " + rs.getString("last_name"));
                System.out.println("Email      : " + rs.getString("email"));
                System.out.println("Phone      : " + rs.getString("phone"));
                System.out.println("Dept ID    : " + rs.getInt("dept_id"));
                System.out.println("Admission  : " + rs.getDate("admission_date"));
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}