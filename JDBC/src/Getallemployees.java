import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Getallemployees {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver,url,user,password;
		driver="com.mysql.cj.jdbc.Driver";
		url="jdbc:mysql://localhost:3306/edb12634";
		user="root";
		password="root";
		
		String selectQuery = "select * from employe";
		
		//1.Loading Driver
		Class.forName(driver);
		
		//2.Establish connection
		Connection con=DriverManager.getConnection(url,user,password);
		
		//3.Create Statement 
		Statement st=con.createStatement();
		
		//4.proccess thet quary( select)
		ResultSet rs=st.executeQuery(selectQuery);
		while (rs.next()) {
			System.out.println(rs.getInt("idemploye"));
			System.out.println(rs.getString("empname"));
			System.out.println(rs.getString("empemail"));
			System.out.println(rs.getLong("empmobile"));
			System.out.println(rs.getInt("salary"));
		
		}
		rs.close();
		st.close();
		con.close();
		
		
	}
}
