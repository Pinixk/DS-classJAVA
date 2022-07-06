package dao;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class DaoList extends DaoSet {
	public DefaultTableModel getList() {
		DefaultTableModel model = 
				new DefaultTableModel(new String[] { "ID", "NAME", "PASS" }, 0);
		try {
			conn = connDB();
			String sql = "select * from db7.users ";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
			  model.addRow(
				new String[]{rs.getString("id"),rs.getString("NAME"),rs.getString("pass")}
			  );
			}
		} catch (SQLException e) {e.printStackTrace();}
		return model;
	}
}
