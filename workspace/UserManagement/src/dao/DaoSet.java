package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DaoSet {
	public Connection conn;		 	// DB연결을 위한 객체
	public PreparedStatement pstmt; // SQL을 복수개 사용하기 위한 객체
	public Statement stmt;			// SQL을 단수개 사용하기 위한 객체
	public ResultSet rs;			// 결과값을 받아오는 객체
	
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
