package UI;

import javax.swing.JFrame;

// final �긽�냽 遺덇�
public abstract class BaseFrm extends JFrame { // abstract �씤�뒪�꽩�뒪 �긽�냽 遺덇�
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
    setSize(width, height);   // 李� �겕湲� �꽕�젙
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x �늻瑜대㈃ �봽濡쒓렇�옩�룄 醫낅즺
    setLocationRelativeTo(this); // 李� �젙媛��슫�뜲 �젙�젹
    setVisible(true); // 媛��떆�꽦
  }
}
