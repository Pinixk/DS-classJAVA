package UI;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import dao.DaoLogin;
import vo.UserVo;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmLogin extends BaseFrm {
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnLogin, btnJoin;
	private JButton btnCancel;
	private JLabel loginId;
	private JLabel loginPass;
	
	public static void main(String[] args) {

	}
	
	public FrmLogin() {
		super("Login", 400, 400);
	}
	
	
	@Override
	public void init() {
		
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(128, 89, 206, 34);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(128, 133, 206, 34);
		
		btnLogin = new JButton("\uB85C\uADF8\uC778");
		btnLogin.setBounds(30, 219, 89, 23);
		btnLogin.addActionListener(e->{
			String id = textField.getText();
			String pass = new String(passwordField.getPassword());
			UserVo user = new DaoLogin().loginCheck(id, pass);
			if(user==null) { 
				JOptionPane.showMessageDialog(btnLogin, "로그인에 실패했습니다");
				textField.setText("");
				passwordField.setText("");
				return;
			}
			dispose();
			new FrmList();
		});
		
		btnJoin = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnJoin.setBounds(248, 219, 89, 23);
		btnJoin.addActionListener(e->{
			// 유효성 검사
			dispose();
			new FrmJoin();
		});
		
		btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(139, 219, 89, 23);
		
		loginPass = new JLabel("\uBE44\uBC00\uBC88\uD638");
		loginPass.setBounds(30, 132, 97, 34);
		
		loginId = new JLabel("\uC544\uC774\uB514");
		loginId.setBounds(30, 88, 97, 34);
		
	}

	@Override
	public void arrange() {
		
		getContentPane().add(textField);
		getContentPane().add(passwordField);
		getContentPane().add(btnLogin);
		getContentPane().add(btnJoin);
		getContentPane().add(btnCancel);
		getContentPane().add(loginId);
		getContentPane().add(loginPass);
		
	}
}
