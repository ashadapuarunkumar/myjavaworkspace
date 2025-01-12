import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Getallemployees2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver,url,user,password;
		driver="com.mysql.cj.jdbc.Driver";
		url="jdbc:mysql://localhost:3306/edb12634";
		user="root";
		password="root";
		
		String selectQuery = "select * from employe where empemail=?";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp Name: ");
		String name=sc.next();
		sc.close();
		
		//1.Loading Driver
		//amarClass.forName(driver);
		
		//2.Establish connection
		Connection con=DriverManager.getConnection(url,user,password);
		
		//3.Create  prepation Statement 
		PreparedStatement st=con.prepareStatement(selectQuery);
		st.setString(1,name);
		//4.proccess thet quary( select)
		ResultSet rs=st.executeQuery();
		if(rs.next()) {
			System.out.println(rs.getInt("idemploye"));
			System.out.println(rs.getString("empname"));
			System.out.println(rs.getString("empemail"));
			System.out.println(rs.getLong("empmobile"));
			System.out.println(rs.getInt("salary"));
			System.out.println("..............................");
		}else {
			System.out.println("Employee not found......");
		}
		rs.close();
		st.close();
		con.close();
		
		
	}
}
