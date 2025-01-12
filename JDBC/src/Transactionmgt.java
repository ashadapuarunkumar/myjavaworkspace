import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transactionmgt {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver, url, user, password;
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb12634";
		user = "root";
		password = "root";

		String query1 = "update accounts set balance=balance+3000 where accno=1234567812";
		String query2 = "update accounts set balance=balance-3000 where accno=1231213;";
		// 1.Loading Driver
		Class.forName(driver);
		// 2.Establish connection
		Connection con = DriverManager.getConnection(url, user, password);

		// disable auto commit
		con.setAutoCommit(false);

		Statement st = con.createStatement();
		// Add batch
		st.addBatch(query1);
		st.addBatch(query2);

		// Execute batch
		int[] result = st.executeBatch();

		if (result[0] == 1 && result[1] == 1) {
			con.commit();
			System.out.println("Success...");
		} else {
			con.rollback();
			System.out.println("Failed...");

		}
		st.close();
		con.close();

	}
}
