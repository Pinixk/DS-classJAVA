package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DaoSet {
	public Connection conn;		 	// DB������ ���� ��ü
	public PreparedStatement pstmt; // SQL�� ������ ����ϱ� ���� ��ü
	public Statement stmt;			// SQL�� �ܼ��� ����ϱ� ���� ��ü
	public ResultSet rs;			// ������� �޾ƿ��� ��ü
	
	public Connection connDB() throws SQLException{
		String driver = "jdbc:mariadb://localhost:3306/";
		String user = "db7";
		String pass = "1234";
		conn = DriverManager.getConnection(driver, user, pass);
		return conn;
	}
	
	public void closeDB() {
		try {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			if(stmt != null) stmt.close();
			if(rs != null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
