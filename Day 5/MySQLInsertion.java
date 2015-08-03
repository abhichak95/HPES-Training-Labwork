import java.sql.*;
import java.util.*;
import MySQLPackage.MySQLConnection;

public class MySQLInsertion {
	private static Scanner in = new Scanner(System.in);

	public void insertData() {
		Integer id = -1, status = 0;
		String username = null, password = null;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			System.out.print("\nEnter ID: ");
			id = Integer.parseInt(in.nextLine());
			if (id == null) {
				System.out.println("\nID cannot be empty!");
				return;
			}
			System.out.print("\nEnter Username: ");
			username = in.nextLine();
			if (id == null) {
				System.out.println("\nUsername cannot be empty!");
				return;
			}
			System.out.print("\nEnter Password: ");
			password = in.nextLine();
			System.out.print("\nEnter Status (0 / 1): ");
			status = Integer.parseInt(in.nextLine());
			if (id == null) {
				status = 0;
			}
		}
		catch(NumberFormatException e) {
			System.out.println("\nNumberFormatException: " + e.getMessage());
		}

		try {
			con = MySQLConnection.getMySQLConnection();
			con.setAutoCommit(false);
			Savepoint svp = con.setSavepoint("SVP1");
			String sql = "{call insertEntry (?, ?, ?, ?)}";
			ps = con.prepareCall(sql);
			ps.setInt(1, id);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.setInt(4, status);
			ps.execute();
			//con.rollback(svp);
			con.commit();
			System.out.println("\nInsertion Successful...");
		}
		catch(SQLException e) {
			System.out.println("\nSQLException: " + e.getMessage());
		}
		finally {
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
			}
			catch(SQLException e) {
				System.out.println("SQLException: " + e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		new MySQLInsertion().insertData();
		new MySQLConnection().displayData();
	}
}