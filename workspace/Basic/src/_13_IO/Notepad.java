package _13_IO;

import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import _12_Swing.BaseFrm;

public class Notepad extends BaseFrm implements ActionListener {
  public static void main(String[] args) {
    new Notepad();
  }

  // 초기화
  private JMenuBar menuBar;
  private JMenu mnFile, mnInfo;
  private JMenuItem miOpen, miNew, miSave, miExit;
  private JTextArea ta;
  private JScrollPane scp;
  private JFileChooser fc;

  @Override
  public void init() {
    menuBar = new JMenuBar();
    mnFile = new JMenu("File(F)");
    mnInfo = new JMenu("Info(I)");

    miNew = new JMenuItem("새 파일(N)");
    miOpen = new JMenuItem("열기(O)");
    miSave = new JMenuItem("저장(S)");
    miExit = new JMenuItem("종료(E)");

    menuBar.add(mnFile);
    menuBar.add(mnInfo);
    mnFile.setMnemonic(KeyEvent.VK_F);
    mnInfo.setMnemonic(KeyEvent.VK_I);

    mnFile.add(miNew);
    mnFile.add(miOpen);
    mnFile.add(miSave);
    mnFile.add(miExit);

    // 단축키 설정
    miNew.setMnemonic(KeyEvent.VK_N); // 중복
    miNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
    miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
    miSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
    miExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));

    // 기능 넣기
    miNew.addActionListener(this);
    miOpen.addActionListener(this);
    miSave.addActionListener(this);
    miExit.addActionListener(this);

    setJMenuBar(menuBar);

    ta = new JTextArea();
    scp = new JScrollPane(ta);

    fc = new JFileChooser();

  }

  // item의 기능
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == miNew) {
      ta.setText("");
    } else if (e.getSource() == miOpen) {
      fileOpen();
    } else if (e.getSource() == miSave) {
      fileSave();
    } else if (e.getSource() == miExit) {

    }
  }

  private void fileOpen() {
    try {
      int ret = fc.showOpenDialog(miOpen);
      if (ret == 0) { // 파일을 열었다
        String selectedFile = fc.getSelectedFile().toString(); // 파일명을 받는다
        FileReader fr = new FileReader(selectedFile);
        int data = 0;
        ta.setText("");
        while ((data = fr.read()) != -1) {
          ta.append(String.valueOf((char) data));
        }
        fr.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void fileSave() {
    try {
      int ret = fc.showSaveDialog(miSave);
      if (ret == 0) { // 파일을 열었따
        String saveFile = fc.getSelectedFile().toString();
        FileWriter fw = new FileWriter(saveFile);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(ta.getText());
        bw.close();
        fw.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void arrange() {
    add(scp);
    setTitle("My Memo");
  }

}
