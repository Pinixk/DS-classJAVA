package ui;
import javax.swing.JTextField;

import dao.DaoLogin;
import vo.UserVo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmLogin extends BaseFrm {
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnLogin, btnCancel, btnJoin;
	private JLabel loginId, loginPass;

	public FrmLogin() {
		super("Login", 400, 200);
	}

	@Override
	public void init() {
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(155, 32, 204, 25);
		textField.setColumns(10);
		
		loginId = new JLabel("아이디");
		loginId.setFont(new Font("굴림", Font.BOLD, 15));
		loginId.setBounds(53, 32, 71, 25);
		
		loginPass = new JLabel("비밀번호");
		loginPass.setFont(new Font("굴림", Font.BOLD, 15));
		loginPass.setBounds(53, 67, 71, 25);
		
		btnLogin = new JButton("로그인");
		btnLogin.setBounds(53, 115, 97, 28);
		btnLogin.addActionListener(e->{
			String id = textField.getText();
			String pass = new String(passwordField.getPassword());
			if(id.length()==0 || id.trim().length()==0) {JOptionPane.showMessageDialog(btnLogin,"아이디를 입력하세요"); textField.requestFocus(); return;}
			if(pass.length()==0 || pass.trim().length()==0) {JOptionPane.showMessageDialog(btnLogin,"비밀번호를 입력하세요"); passwordField.requestFocus(); return;}
			
			UserVo user = new DaoLogin().loginCheck(id, pass);
			if(user == null) {
				JOptionPane.showMessageDialog(btnLogin, "등록된 아이디나 비밀번호가 아닙니다.");
				textField.setText("");
				passwordField.setText("");
				return;
			}
			
			dispose();
			new FrmList();
		});
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(e->{
			dispose();
		});
		btnCancel.setBounds(162, 115, 97, 28);
		
		btnJoin = new JButton("가입");
		btnJoin.setBounds(264, 115, 97, 28);
		getContentPane().add(textField);
		btnJoin.addActionListener(e->{
			dispose();
			new FrmJoin();
		});
		
		passwordField = new JPasswordField();
		passwordField.setBounds(153, 67, 206, 25);
	}

	@Override
	public void arrange() {
		getContentPane().add(btnJoin);
		getContentPane().add(btnCancel);
		getContentPane().add(btnLogin);
		getContentPane().add(loginPass);
		getContentPane().add(loginId);
		getContentPane().add(passwordField);
	}
}
		