package _12_Swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class _03_Component extends BaseFrm {

  private JPanel pnlNorth, pnlCenter;
  private String[] arr;
  private String[] size;
  private JRadioButton[] rbArr;
  private ButtonGroup btnGroup;
  private JComboBox cbSize;
  private JLabel lbMenu, lbSize;

  @Override
  public void init() {

    pnlNorth = new JPanel();
    pnlCenter = new JPanel();
    arr = new String[] { "Coffee", "Latte", "Espresso", "BlackTea", "Ade" };
    size = new String[] { "Small", "Medium", "Large" };
    rbArr = new JRadioButton[5];
    btnGroup = new ButtonGroup();
    cbSize = new JComboBox<>(size);
    lbSize = new JLabel(size[1]);

    for (int i = 0; i < arr.length; i++) {
      rbArr[i] = new JRadioButton(arr[i]);
      pnlNorth.add(rbArr[i]);
      btnGroup.add(rbArr[i]);

      final int tmp = i;
      // rbArr[i].addActionListener(e->{lbMenu.setText(rbArr[tmp].getText());});
      rbArr[i].addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          lbMenu.setText(rbArr[tmp].getText());
          // 지역변수가 익명객체로 들어갈 때는 상수로 변환해야함
        }
      });
      cbSize.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          lbSize.setText(size[cbSize.getSelectedIndex()]);
        }
      });

    }

    rbArr[0].setSelected(true);
    cbSize.setSelectedIndex(0);

    lbMenu = new JLabel(rbArr[0].getText());
    lbSize = new JLabel(size[cbSize.getSelectedIndex()]);
    lbMenu.setFont(new Font("Consolas", Font.ITALIC, 80));
    lbSize.setFont(new Font("Consolas", Font.BOLD, 50));
    lbMenu.setForeground(Color.darkGray);
    lbSize.setForeground(Color.ORANGE);
  }

  @Override
  public void arrange() {

    pnlNorth.add(cbSize);
    pnlCenter.add(lbMenu);
    pnlCenter.add(lbSize);
    add(pnlNorth, "North");
    add(pnlCenter, "Center");

  }

  public static void main(String[] args) {

    new _03_Component();

  }

}