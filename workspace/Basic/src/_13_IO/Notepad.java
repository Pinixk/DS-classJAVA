package _13_IO;

import javax.swing.*;
import java.awt.event.*;


import _12_Swing.BaseFrm;

public class Notepad extends BaseFrm{
  public static void main(String[] args) {
    new Notepad();
  }
  // 초기화
  private JMenuBar menuBar;
  private JMenu mnFile, mnInfo;
  private JMenuItem miOpen, miNew, miSave, miExit;
  private JTextArea ta;
  private JScrollPane scp;

  @Override
  public void init() {
    menuBar = new JMenuBar();
    mnFile = new JMenu("File(F)");
    mnInfo = new JMenu("Info(I)");

    miNew = new JMenuItem("New(N)");
    miOpen = new JMenuItem("Open(O)");
    miSave = new JMenuItem("Save(S)");
    miExit = new JMenuItem("Exit(E)");
    
    menuBar.add(mnFile);
    menuBar.add(mnInfo);
    mnFile.setMnemonic(KeyEvent.VK_F);
    mnInfo.setMnemonic(KeyEvent.VK_I);

    mnFile.add(miNew);
    mnFile.add(miOpen);
    mnFile.add(miSave);
    mnFile.add(miExit);

    setJMenuBar(menuBar);

    ta = new JTextArea();
    scp = new JScrollPane(ta);
  }
  @Override
  public void arrange() {
    add(scp);
    setTitle("My Memo");
  }
}
