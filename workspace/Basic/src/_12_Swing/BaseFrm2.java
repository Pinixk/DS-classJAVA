package _12_Swing;

import javax.swing.JFrame;


public abstract class BaseFrm2 extends JFrame{
private int width, height;

public BaseFrm2(){
this("MyFrame",600, 500);

}
public BaseFrm2(String title) {this(title, 600, 400);}

public BaseFrm2(String title, int width, int height){
super(title);
this.width = width;
this.height=height;
init();
arange();
inflate();
}

public abstract void init();
public abstract void arange();
public void inflate(){
setSize(width, height);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(this); // 창 가운데
setVisible(true);
}

}