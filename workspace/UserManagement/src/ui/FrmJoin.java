package ui;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import dao.DaoJoin;
import vo.UserVo;

public class FrmJoin extends BaseFrm {
	private JTextField tfId;
	private JTextField tfName;
	private JPasswordField pfPass;
	private JPasswordField pfRePass;
	private JLabel joinId, joinName, joinPass, joinRePass;
	private JButton btnJoinRegist, joinCancel;
	

	public FrmJoin() {
		super("Join", 400, 400);
	}

	@Override
	public void init() {
		getContentPane().setLayout(null);
		
		tfId = new JTextField();
		tfId.setBounds(157, 44, 152, 26);
		tfId.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(157, 91, 152, 26);
		tfName.setColumns(10);
		
		joinId = new JLabel("아이디");
		joinId.setFont(new Font("굴림", Font.BOLD, 15));
		joinId.setBounds(48, 38, 97, 36);
		
		joinName = new JLabel("이름");
		joinName.setFont(new Font("굴림", Font.BOLD, 15));
		joinName.setBounds(48, 85, 97, 36);
		
		joinPass = new JLabel("비밀번호");
		joinPass.setFont(new Font("굴림", Font.BOLD, 15));
		joinPass.setBounds(48, 131, 97, 37);
		
		
		joinRePass = new JLabel("비밀번호확인");
		joinRePass.setFont(new Font("굴림", Font.BOLD, 15));
		joinRePass.setBounds(48, 175, 97, 37);
		
		btnJoinRegist = new JButton("가입");
		btnJoinRegist.setFont(new Font("굴림", Font.BOLD, 18));
		btnJoinRegist.setBounds(48, 247, 97, 37);
		btnJoinRegist.addActionListener(e->{
			String id = tfId.getText();
			String name = tfName.getText();
			String pass = new String(pfPass.getPassword());
			String RePass = new String(pfRePass.getPassword());
			
			if(id.length()==0 || id.trim().length()==0){JOptionPane.showMessageDialog(btnJoinRegist,"아이디를 입력하세요"); tfId.setText(""); tfId.requestFocus(); return;}
			if(name.length()==0 || name.trim().length()==0){JOptionPane.showMessageDialog(btnJoinRegist,"이름을 입력하세요"); tfName.setText(""); tfName.requestFocus(); return;}
			if(pass.length()==0 || pass.trim().length()==0){JOptionPane.showMessageDialog(btnJoinRegist,"비밀번호를 입력하세요"); pfPass.setText(""); pfPass.requestFocus(); return;}
			if(!pass.equals(RePass)){JOptionPane.showMessageDialog(btnJoinRegist,"비밀번호를 일치하게 쓰세요"); pfRePass.setText(""); pfRePass.requestFocus(); return;}
			int ret = new DaoJoin().addUser(new UserVo(id, name, pass));
			if(ret>0) JOptionPane.showMessageDialog(btnJoinRegist, "가입되었습니다.");
			else JOptionPane.showMessageDialog(btnJoinRegist, "가입에 실패하였습니다.");
			dispose();
			new FrmLogin();
		});
		
		joinCancel = new JButton("취소");
		joinCancel.setFont(new Font("굴림", Font.BOLD, 18));
		joinCancel.setBounds(212, 247, 97, 37);
		joinCancel.addActionListener(e->{
			dispose();
			new FrmLogin();
		});
		
		pfPass = new JPasswordField();
		pfPass.setBounds(157, 137, 152, 26);
		
		pfRePass = new JPasswordField();
		pfRePass.setBounds(157, 181, 152, 26);

		
	}

	@Override
	public void arrange() {
		getContentPane().add(pfRePass);
		getContentPane().add(pfPass);
		getContentPane().add(joinCancel);
		getContentPane().add(btnJoinRegist);
		getContentPane().add(joinRePass);
		getContentPane().add(joinPass);
		getContentPane().add(tfId);
		getContentPane().add(tfName);
		getContentPane().add(joinId);
		getContentPane().add(joinName);
		
	}

}
