package _13_IO;

import javax.swing.*;
import _12_Swing.BaseFrm;

public class Notepad extends BaseFrm{
  public static void main(String[] args) {
    new Notepad();
  }
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
    miOpen = new JMenuItem("Open(O)");
    miNew = new JMenuItem("New(N)");
    miSave = new JMenuItem("Save(S)");
    miExit = new JMenuItem("Exit(E)");

    mnFile.add(miNew);
    mnFile.add(miOpen);
    mnFile.add(miSave);
    mnFile.add(miExit);

    menuBar.add(mnFile);
    menuBar.add(mnInfo);

    setJMenuBar(menuBar);

    ta = new JTextArea();
    scp = new JScrollPane();
  }
  @Override
  public void arrange() {
    add(scp);
  }
}
