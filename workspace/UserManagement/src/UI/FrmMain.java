package UI;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class FrmMain extends BaseFrm{
	private JTable User;
	private JScrollPane scp;
	
	public FrmMain() {
		super("List", 400, 400);
	}
	
	@Override
	public void init() {
		getContentPane().setLayout(null);
		scp = new JScrollPane();
		scp.setBounds(12, 10, 360, 341);
		
		User = new JTable();
		User.setForeground(Color.DARK_GRAY);
		User.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"유저명", "나이"
			}
		));
	}
	
	@Override
	public void arrange() {
		getContentPane().add(scp);
		scp.setViewportView(User);
	}
}
