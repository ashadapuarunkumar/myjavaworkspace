import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Getallemployees4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver, url, user, password;
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb12634";
		user = "root";
		password = "root";
		
		 Class.forName(driver);
		 
		Connection con = DriverManager.getConnection(url, user, password);
		
 
//		String insertQuery = "select * from employe values(?,?,?,?,?)";
	//	String updateQuery = "UPDATE employe SET column?=value?";
	//	String deleteQuery = "DELETE from employe where idemploye=?";   
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("choose options :");
		System.out.println("1. for Update ");
		System.out.println( "2. for Delete");
		System.out.println( "3. for New employee");
		int choise=sc.nextInt();
	
		
//		
//		System.out.println("Enter idemploye: ");
//		int id = sc.nextInt();
//
//		System.out.println("Enter emp name: ");
//		String name = sc.next();
//
//		System.out.println("Enter emp email: ");
//		String email = sc.next();
//
//		System.out.println("Enter emp mobile: ");
//		Long mobile = sc.nextLong();
//
//		System.out.println("Enter emp Salary: ");
//		int salary = sc.nextInt();
//		
//
//		// 1.Loading Driver
//		 Class.forName(driver);
//
//		// 2.Establish connection
//		Connection con = DriverManager.getConnection(url, user, password);
//
//		// 3.Create prepation Statement
//		PreparedStatement st = con.prepareStatement(insertQuery);
//		st.setInt(1, id);
//		st.setString(2, name);
//		st.setString(3, email);
//		st.setLong(4, mobile);
//		st.setInt(5, salary);

		// 4.proccess thet quary( select)
		
		if (choise == 1) {

			System.out.println("Choose employe id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("enter new id: ");
			int id1=sc.nextInt();
			sc.nextLine();

			System.out.println("Enter emp name: ");
			String name = sc.nextLine();

			System.out.println("Enter emp email: ");
			String email = sc.nextLine();

			System.out.println("Enter emp mobile: ");
			Long mobile = sc.nextLong();

			System.out.println("Enter emp salary: ");
			int salary = sc.nextInt();

	
			String updateQuery = "UPDATE employe SET idemploye=?, empname=?,empemail=?, empmobile=?, salary=? where idemploye=?  ";

			//.Create prepation Statement
			PreparedStatement st = con.prepareStatement(updateQuery);
			st.setInt(1, id1);
			st.setString(2, name);
			st.setString(3, email);
			st.setLong(4,mobile);
			st.setInt(5, salary);
			st.setInt(6, id);
			
			int update=st.executeUpdate();
			System.out.println("success.... " +update);
			
			st.close();
			
		} else if(choise == 2) {
			System.out.println("Enter employee ID to delete: ");
			int deleteId=sc.nextInt();
			
			String deleteQuery = "DELETE from employe where idemploye=?"; 
			
			PreparedStatement st = con.prepareStatement(deleteQuery);
			st.setInt(1,deleteId);
			int deleted = st.executeUpdate();
			System.out.println(" delete......"+deleted);
			
			st.close();
		
		}else if(choise==3){
			   PreparedStatement st = null;
		        System.out.println("Enter employee id2: ");
		        int id = sc.nextInt();
		        sc.nextLine();  // Consume newline

		        System.out.println("Enter employee name: ");
		        String name = sc.nextLine();

		        System.out.println("Enter employee email: ");
		        String email = sc.nextLine();

		        System.out.println("Enter employee mobile: ");
		        Long mobile = sc.nextLong();

		        System.out.println("Enter employee salary: ");
		        int salary = sc.nextInt();

		        String insertQuery = "INSERT INTO employe(id, name, email, mobile, salary) VALUES(?,?,?,?,?)";
		        st = con.prepareStatement(insertQuery);
		        st.setInt(1, id);
		        st.setString(2, name);
		        st.setString(3, email);
		        st.setLong(4, mobile);
		        st.setInt(5, salary);

		        int Inserted = st.executeUpdate();
		        System.out.println("Insert successful, rows affected: " + Inserted);

		        st.close();
			
	}else if(choise==4) {
			System.out.println("invalid...");
		}
		// rs.close();
		sc.close();
		con.close();
	

	}
}