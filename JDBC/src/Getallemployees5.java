import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Getallemployees5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver,url,user,password;
		driver="com.mysql.cj.jdbc.Driver";
		url="jdbc:mysql://localhost:3306/edb12634";
		user="root";
		password="root";
		
		String proce = "{call getAllemployee1()}";
		
		//1.Loading Driver
		Class.forName(driver);
		
		//2.Establish connection
		Connection con=DriverManager.getConnection(url,user,password);
		
		//create callable statement object
		CallableStatement st=con.prepareCall(proce);
		//3.Create Statement 
		
		//4.proccess thet quary( select)
		ResultSet rs=st.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("salary"));
			System.out.println(rs.getString("gender"));
			System.out.println(rs.getString("city"));
		
		}
		
		st.close();
		con.close();
		
		
	}
}
