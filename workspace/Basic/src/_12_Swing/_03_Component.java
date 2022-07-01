package _12_Swing;

import javax.swing.*;
import java.awt.event.*;

public class _03_Component extends BaseFrm {

  private JPanel pnlNorth, pnlCenter;
  private String[] arr;
  private JRadioButton[] rbArr;
  private ButtonGroup btnGroup;

  @Override
  public void init() {

    pnlNorth = new JPanel();
    pnlCenter = new JPanel();
    arr = new String[]{"Coffee","Latte","Espresso","BlackTea","Ade"};
    rbArr = new JRadioButton[5];
    btnGroup = new ButtonGroup();
    for (int i = 0; i < arr.length; i++) {
      rbArr[i] = new JRadioButton(arr[i]);
      pnlNorth.add(rbArr[i]);
      btnGroup.add(rbArr[i]);
    }      
    
  }
  @Override
  public void arrange() {
    add(pnlNorth,"North");
  }

  public static void main(String[] args) {
    new _03_Component();
  }

}
