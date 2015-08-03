/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hp.j2sh.mysql;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */

public class MYSQLConnection {
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/sh";
	private static final String USER = "root";
	private static final String PASS = "password";
	private static final Scanner in = new Scanner(System.in);

	private static ArrayList<Integer> IDList = null;

	private static void initIDList() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		IDList = new ArrayList<Integer>();
		try {
			con = getMySQLConnection();
			st = (Statement) con.createStatement();
			rs = st.executeQuery("Select * from user;");
			while(rs.next()) IDList.add(rs.getInt(1));
		}
		catch(SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException: " + e.getMessage());
		}
	}

	public static Connection getMySQLConnection() {
		Connection con = null;
		try {
			Class.forName(JDBC_DRIVER);
			con = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
		}
		catch(SQLException e) {
			System.out.println("SQLException1: " + e.getMessage());
		}
		catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException1: " + e.getMessage());
		}
		return con;
	}
        
        public static Connection getMySQLConnection(String JDBC_DRIVER, String DB_URL, String USER, String PASS) {
		Connection con = null;
		try {
			Class.forName(JDBC_DRIVER);
			con = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
		}
		catch(SQLException e) {
			System.out.println("SQLException1: " + e.getMessage());
		}
		catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException1: " + e.getMessage());
		}
		return con;
	}

	private static void drawBoundary() {
		System.out.printf("|");
		for (int i = 0; i < 75; i++) System.out.printf("-");
		System.out.printf("|");
	}

	public void displayData() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = getMySQLConnection();
			st = (Statement) con.createStatement();
			rs = st.executeQuery("Select * from user order by id;");
			System.out.println();
			drawBoundary();
			System.out.printf("\n| %-17s| %-17s| %-17s| %-17s|\n", "ID", "USERNAME", "PASSWORD", "STATUS");
			drawBoundary();
			System.out.println();
			while(rs.next()) {
				drawBoundary();
				System.out.printf("\n| %-17d| %-17s| %-17s| %-17s|\n", rs.getInt(1), rs.getString(2), rs.getString(3), (rs.getInt(4) == 0 ? "Offline" : "Online"));
			}
			drawBoundary();
			System.out.println();
		}
		catch(SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}

	public void inputData() {
		Integer id = -1, status = -1, fg = 0;
		String username = null, password = null;
		while(fg == 0) {
			try {
				System.out.print("\nEnter ID: ");
				id = Integer.parseInt(in.nextLine());
				if (IDList.contains(id)) {
					System.out.println("\nID already EXISTS!\n");
					return;
				}
				System.out.print("Enter Username: ");
				username = in.nextLine();
				System.out.print("Enter Password: ");
				password = in.nextLine();
				System.out.print("Enter Status (0: Offline / 1: Online): ");
				status = Integer.parseInt(in.nextLine());
				if (status == 0 || status == 1) fg = 1;
				else System.out.println("\nInvalid Status! Try Again!\n");
			}
			catch(NumberFormatException e) {
				System.out.println("NumberFormatException: " + e.getMessage());
			}
			catch(InputMismatchException e) {
				System.out.println("InputMismatchException: " + e.getMessage());
			}
			catch(NullPointerException e) {
				System.out.println("NullPointerException: " + e.getMessage());
			}
		}
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = getMySQLConnection();
			st = (Statement) con.createStatement();
			int rows = st.executeUpdate("insert into user values(" + id + ", \'" + username + "\', \'" + password + "\', " + status + " );");
			IDList.add(id);
			System.out.println("\nData Inserted Successfully...\n");
		}
		catch(SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}

	public void deleteData() {
		Integer id = -1, fg = 0;
		while(fg == 0) {
			try {
				System.out.print("\nEnter ID: ");
				id = Integer.parseInt(in.nextLine());
				if (!IDList.contains(id)) {
					System.out.println("\nID does NOT exist!\n");
					return;
				}
				fg = 1;
			}
			catch(NumberFormatException e) {
				System.out.println("NumberFormatException: " + e.getMessage());
			}
			catch(InputMismatchException e) {
				System.out.println("InputMismatchException: " + e.getMessage());
			}
			catch(NullPointerException e) {
				System.out.println("NullPointerException: " + e.getMessage());
			}
		}
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = getMySQLConnection();
			st = (Statement) con.createStatement();
			int rows = st.executeUpdate("delete from user where id=" + id + ";");
			IDList.remove(id);
			System.out.println("\nData Deleted Successfully...\n");
		}
		catch(SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		initIDList();
		MYSQLConnection msq = new MYSQLConnection();
		Integer ops = -1;
		do {
			System.out.print("\n\nOPTIONS:\n--------\n\n1. Show data\n2. Insert data\n3. Delete data\n4. Exit\n\nEnter your choice: ");
			try {
				ops = Integer.parseInt(in.nextLine());
				if (ops != 1 && ops != 2 && ops != 3 && ops != 4) {
					System.out.println("Invalid Input!");
					continue;
				}
				switch(ops) {
					case 1:	msq.displayData();
							break;	

					case 2:	msq.inputData();
							break;	

					case 3:	msq.deleteData();
							break;

					case 4: break;
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid Input!");
			}
		} while(ops != 4);
	}
}