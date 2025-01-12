import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Getallemployees3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver, url, user, password;
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb12634";
		user = "root";
		password = "root";

		String insertQuery = "select * from employe values(?,?,?,?,?)";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter idemploye: ");
		int id = sc.nextInt();

		System.out.println("Enter emp name: ");
		String name = sc.next();

		System.out.println("Enter emp email: ");
		String email = sc.next();

		System.out.println("Enter emp mobile: ");
		Long mobile = sc.nextLong();

		System.out.println("Enter emp Salary: ");
		int salary = sc.nextInt();
		

		// 1.Loading Driver
		 Class.forName(driver);

		// 2.Establish connection
		Connection con = DriverManager.getConnection(url, user, password);

		// 3.Create prepation Statement
		PreparedStatement st = con.prepareStatement(insertQuery);
		st.setInt(1, id);
		st.setString(2, name);
		st.setString(3, email);
		st.setLong(4, mobile);
		st.setInt(5, salary);

		// 4.proccess thet quary( select)
		int status = st.executeUpdate();
		if (status >= 1) {
			System.out.println("Success..........");
		} else {
			System.out.println("Failed......");
		}
		// rs.close();
		st.close();
		con.close();

	}
}
