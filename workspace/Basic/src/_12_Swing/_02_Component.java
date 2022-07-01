package _12_Swing;

import javax.swing.*;

public class _02_Component extends BaseFrm {
  public static void main(String[] args) {
    new _02_Component();
  }

  JPanel pnlNorth, pnlCenter;
  JLabel lbMenu1, lbMenu2;
  JLabel icon1, icon2;
  JCheckBox cbMenu1, cbMenu2;

  @Override
  public void init() {
    pnlNorth = new JPanel();
    lbMenu1 = new JLabel("Choice 1");
    lbMenu2 = new JLabel("Choice 2");
    cbMenu1 = new JCheckBox();
    cbMenu2 = new JCheckBox();

    pnlCenter = new JPanel();
    icon1 = new JLabel();
    icon2 = new JLabel();
  }

  @Override
  public void arrange() {
    pnlNorth.add(lbMenu1); pnlNorth.add(cbMenu1);
    pnlNorth.add(lbMenu2); pnlNorth.add(cbMenu2);
    add(pnlNorth,"North");
  }
}
