import java.sql.*;
import java.util.*;

public class MySQLFunction {
	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static String DB_URL = "jdbc:mysql://localhost:3306/sh";
	private static String USER = "root";
	private static String PASS = "password";
	private static Scanner in = new Scanner(System.in);

	private static Connection getConn() {
		Connection con = null;
		try {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB_URL, USER, PASS);
		}
		catch(SQLException e) {
			System.out.println("SQLException1: " + e.getMessage());
		}
		catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException1: " + e.getMessage());
		}
		return con;
	}

	public void display() {
		Connection con = null;
		Integer id = null;
		CallableStatement cs = null;
		String user = null;
		try {
			con = getConn();
			System.out.print("\nEnter ID: ");
			id = Integer.parseInt(in.nextLine());
			String sql = "{? = call getU(?)}";
			//System.out.println("3");
			cs = con.prepareCall(sql);
			//System.out.println("4");
			cs.registerOutParameter(1, Types.VARCHAR);
			//System.out.println("5");
			cs.setInt(2, id);
			//System.out.println("1");
			cs.execute();
			//System.out.println("2");
			user = cs.getString(1);
			if (user != null) System.out.println("\nUsername: " + user);
			else System.out.println("\nID Not Found!");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException1: " + e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("SQLException2: " + e.getMessage());
		}
		finally {
			try {
				if (cs != null) cs.close();
				if (con != null) con.close();
			}
			catch(SQLException e) {
				System.out.println("SQLException3: " + e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		new MySQLProcedure().display();
	}
}