package _12_Swing;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;

public class _04_Input_Table extends BaseFrm {
  // public InputTable() {
  // }
  public _04_Input_Table() {
    super("λμΌλ");
  }

  private JTextField tfId;
  private JPasswordField pfPass;
  private JLabel lbId, lbPass;
  private JTable table;
  private DefaultTableModel tblModel;
  private JButton btnAdd, btnDel;
  private JScrollPane scp;

  public static void main(String[] args) {
    new _04_Input_Table();
  }

  @Override
  public void init() {
    getContentPane().setLayout(null);

    tfId = new JTextField();
    tfId.setFont(new Font("Dialog", Font.PLAIN, 20));
    tfId.setBounds(44, 18, 125, 37);
    tfId.setColumns(10);

    lbId = new JLabel("ID");
    lbId.setFont(new Font("Dialog", Font.PLAIN, 22));
    lbId.setBounds(12, 26, 59, 21);

    lbPass = new JLabel("Pass");
    lbPass.setFont(new Font("Dialog", Font.PLAIN, 22));
    lbPass.setBounds(181, 26, 79, 21);

    pfPass = new JPasswordField();
    pfPass.setFont(new Font("Dialog", Font.PLAIN, 20));
    pfPass.setBounds(238, 18, 149, 37);

    btnAdd = new JButton("Add");
    btnAdd.setFont(new Font("Nirmala UI", Font.BOLD, 18));
    btnAdd.setBounds(402, 19, 70, 37);
    
    btnAdd.addActionListener(e -> {
      if (tfId.getText().equals("") || (new String(pfPass.getPassword())).equals("")) {
        JOptionPane.showMessageDialog(btnAdd, "Check ID and Pass");
        return;
      }
      String[] row = new String[2];
      row[0] = tfId.getText();
      row[1] = new String(pfPass.getPassword());
      tblModel.addRow(row);
      tfId.setText("");
      pfPass.setText("");
      tfId.requestFocus();
    });

    btnDel = new JButton("Delete");
    btnDel.setFont(new Font("Nirmala UI", Font.BOLD, 18));
    btnDel.setBounds(477, 19, 95, 37);
    btnDel.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int row = table.getSelectedRow();
        if (row == -1)
          return;
        tblModel.removeRow(row);
      }
    });
    String[] tblTitle = { "Id", "Password" };
    tblModel = new DefaultTableModel(tblTitle, 0);
    table = new JTable(tblModel);
    scp = new JScrollPane(table);
    scp.setBounds(11, 80, 565, 270);

  }

  @Override
  public void arrange() {
    getContentPane().add(lbId);
    getContentPane().add(tfId);
    getContentPane().add(lbPass);
    getContentPane().add(pfPass);
    getContentPane().add(btnDel);
    getContentPane().add(btnAdd);
    getContentPane().add(scp);
  }
}