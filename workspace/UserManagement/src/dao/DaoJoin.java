package dao;

import java.sql.SQLException;
import vo.UserVo;

public class DaoJoin extends DaoSet {
	public int addUser(UserVo user)  {
		int result = 0;
		try {
			conn = connDB();
			String sql = "insert into db7.users values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getPass());
			result = pstmt.executeUpdate();	// insert ¿œ ∂ß 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
