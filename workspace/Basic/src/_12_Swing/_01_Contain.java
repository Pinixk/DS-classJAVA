package _12_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _01_Contain {
  public static void main(String[] args) {
    new MyFrame();

  }
}

class MyFrame extends BaseFrm {
  private JButton btnNorth, btnSouth, btnEast, btnWest, btnCenter;

  @Override
  public void init() {
    btnNorth = new JButton("북");
    btnSouth = new JButton("남");
    btnWest = new JButton("서");
    btnEast = new JButton("동");
    btnCenter = new JButton("중");
    btnCenter.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showInternalMessageDialog(getParent(), "Hello Swing");
      }
    });
  }

  @Override
  public void arrange() {
    add(btnNorth, "North");
    add(btnSouth, "South");
    add(btnWest, "West");
    add(btnEast, "East");
    add(btnCenter, "Center");
  }
}