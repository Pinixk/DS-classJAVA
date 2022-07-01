package _12_Swing;

import javax.swing.*;
import java.awt.event.*;

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
    icon1 = new JLabel(new ImageIcon("image/1.png"));
    icon2 = new JLabel(new ImageIcon("image/2.png"));
    icon1.setVisible(false);
    icon2.setVisible(false);
    cbMenu1.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        icon1.setVisible(!icon1.isVisible());
      }
    });
    cbMenu2.addActionListener(e->icon2.setVisible(!icon2.isVisible()));
  }

  @Override
  public void arrange() {
    pnlNorth.add(lbMenu1); pnlNorth.add(cbMenu1);
    pnlNorth.add(lbMenu2); pnlNorth.add(cbMenu2);
    pnlCenter.add(icon1); pnlCenter.add(icon2);
    add(pnlNorth,"North");
    add(pnlCenter,"Center");
  }
}
