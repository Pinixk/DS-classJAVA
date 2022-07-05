package dao;

import java.sql.SQLException;

import vo.UserVo;


public class DaoLogin extends DaoSet {
	public UserVo loginCheck(String id, String pass) {
		UserVo result = null;
		try {
			conn = connDB();
			String sql = "select * from db7.users where id=? and pass=? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			rs = pstmt.executeQuery(); // select´Â executeQuery
			if(rs.next()) {
				result = new UserVo(
						rs.getString("id"), 
						rs.getString("name"), 
						rs.getString("pass")
						);
				System.out.println(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
