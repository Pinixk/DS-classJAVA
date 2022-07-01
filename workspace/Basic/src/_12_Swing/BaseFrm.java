package _12_Swing;

import javax.swing.*;

// final 상속 불가
public abstract class BaseFrm extends JFrame { // abstract 인스턴스 상속 불가
  private int width, height;

  public BaseFrm() {
    this(600, 400);
  }
  public BaseFrm(int width, int height) {
    this.width = width;
    this.height = height;
    init(); arrange(); inflate();
  }

  public abstract void init();
  public abstract void arrange();
  public void inflate() {
    setSize(width, height); // 창 크기 설정
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 누르면 프로그램도 종료
    setLocationRelativeTo(this); // 창 정가운데 정렬
    // setLocation(300,300); // 창 위치 선택 지정
    setVisible(true); // 가시성
  };
}
