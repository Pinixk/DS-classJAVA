package UI;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import vo.UserVo;
import dao.DaoJoin;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class FrmJoin extends BaseFrm{
	private JTextField tfId;
	private JTextField tfName;
	private JLabel joinId, joinName, joinPass, joinRepass;
	private JButton btnJoinRegist, btnCancel2;
	private JPasswordField pfPass;
	private JPasswordField pfRePass;
	
	public static void main(String[] args) {
		
	}
	
	public FrmJoin() {	
		super("Join", 400, 400);
	}
	
	@Override
	public void init() {
		getContentPane().setLayout(null);
		joinId = new JLabel("ID");
		joinId.setBounds(67, 32, 63, 24);
		
		joinName = new JLabel("\uC774\uB984");
		joinName.setBounds(67, 66, 63, 24);
		
		joinPass = new JLabel("\uBE44\uBC88");
		joinPass.setBounds(67, 100, 63, 24);
		
		pfPass = new JPasswordField();
		pfPass.setBounds(142, 102, 170, 21);
		
		pfRePass = new JPasswordField();
		pfRePass.setBounds(142, 136, 170, 21);
		
		joinRepass = new JLabel("\uBE44\uBC88 \uD655\uC778");
		joinRepass.setBounds(67, 134, 63, 24);
		
		tfId = new JTextField();
		tfId.setBounds(142, 34, 170, 21);
		tfId.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(142, 68, 170, 21);
		tfName.setColumns(10);
		
		btnJoinRegist = new JButton("\uAC00\uC785");
		btnJoinRegist.setBounds(67, 186, 113, 23);
		btnJoinRegist.addActionListener(e->{
			String id = tfId.getText();
			String name = tfName.getText();
			String pass = new String(pfPass.getPassword());
			// messageDialog�� ���鼭 ��ȿ�� �˻�
			int ret = new DaoJoin().addUser(new UserVo(id, name, pass));
			if(ret>0) JOptionPane.showMessageDialog(btnJoinRegist, "���ԵǾ����ϴ�.");
			else JOptionPane.showMessageDialog(btnJoinRegist, "���Կ� �����Ͽ����ϴ�.");
			dispose();
			new FrmLogin();
		});
		
		btnCancel2 = new JButton("\uCDE8\uC18C");
		btnCancel2.setBounds(192, 185, 120, 24);
		
	}
	
	@Override
	public void arrange() {
		
		getContentPane().add(tfId);
		getContentPane().add(joinId);
		getContentPane().add(joinName);
		getContentPane().add(joinPass);
		getContentPane().add(joinRepass);
		getContentPane().add(tfName);
		getContentPane().add(btnJoinRegist);
		getContentPane().add(btnCancel2);
		getContentPane().add(pfPass);
		getContentPane().add(pfRePass);
		
	}
}
