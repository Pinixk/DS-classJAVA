package UI;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import dao.DaoList;


import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class FrmList extends BaseFrm {
	JLabel lbTitle;
	JTable table;
	JScrollPane scp;
	
	public FrmList() {
		super("Main");
	}
	
	@Override
	public void init() {
		lbTitle = new JLabel("ȸ�� ���");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		table = new JTable();
		scp = new JScrollPane(table);
		
		table.setModel(new DaoList().getList());
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.fireTableDataChanged();
	}
	
	@Override
	public void arrange() {
		getContentPane().add(lbTitle,"North");
		getContentPane().add(scp, "Center");
	}

}
