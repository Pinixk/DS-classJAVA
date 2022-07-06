package ui;

import javax.swing.JFrame;

public abstract class BaseFrm extends JFrame{
  private int width, height;

  public BaseFrm(){this("MyFrame", 600, 400);}
  public BaseFrm(String title) { this(title,600,400);}
  public BaseFrm(String title, int width, int height){
	super(title);
    this.width=width; this.height=height;
    init(); arrange(); inflate();
  }
  
  public abstract void init();
  public abstract void arrange();
  
  public void inflate(){
    setSize(width, height);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(this);
    setVisible(true);
  }
}
