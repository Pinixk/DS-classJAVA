package ui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import dao.DaoList;

public class FrmList extends BaseFrm {
	private JLabel lbTitle;
	private JTable table;
	private JScrollPane scp;

	public FrmList() {super("Main");}

	@Override
	public void init() {
		lbTitle = new JLabel("회원 목록");
		lbTitle.setFont(new Font("맑은 고딕", Font.BOLD, 28));
		table = new JTable();
		scp = new JScrollPane(table);
		
		table.setModel(new DaoList().getList());
//		DefaultTableModel model = (DefaultTableModel) table.getModel();
//		model.fireTableDataChanged();
	}

	@Override
	public void arrange() {
		add(lbTitle, "North"); add(scp, "Center");
	}
}
