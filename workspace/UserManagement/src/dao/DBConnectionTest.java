package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String driver = "jdbc:mariadb://localhost:3306/";
			String user = "db7";
			String pass = "1234";
			conn = DriverManager.getConnection(driver, user, pass);
			System.out.println("Maria DB Connection 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("Maria DB is Closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
