package UI;

import javax.swing.JFrame;

public abstract class BaseFrm extends JFrame { // abstract 인스턴스 생성 불가
  private int width, height;

  public BaseFrm() {
    this(600, 400);
  }

  public BaseFrm(int width, int height) {
    this.width = width;
    this.height = height;
    init();
    arrange();
    inflate();
  }

  public BaseFrm(String title) {
    this();
    setTitle(title);
  }

  public BaseFrm(String title, int width, int height) {
    this(width, height);
    setTitle(title);
  }

  public abstract void init();

  public abstract void arrange();

  public void inflate() {
    setSize(width, height);   
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    setLocationRelativeTo(this); 
    setVisible(true); 
  }
}
