import java.sql.*;
import java.util.*;
import SQL.*;

public class MySQLProcedure {
	private static Scanner in = new Scanner(System.in);

	public void displayUser() {
		Connection con = null;
		Integer id = null;
		CallableStatement cs = null;
		String user = null;
		try {
			con = SQL.MySQLConnection.getMySQLConnection();
			System.out.print("\nEnter ID: ");
			id = Integer.parseInt(in.nextLine());
			String sql = "{call getUser(?, ?)}";
			cs = con.prepareCall(sql);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.setInt(1, id);
			cs.execute();
			user = cs.getString(2);
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
		new MySQLProcedure().displayUser();
	}
}