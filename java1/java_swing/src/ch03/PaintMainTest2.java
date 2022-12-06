package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyDrawPanel3 extends JPanel {

	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		g.drawString("안녕하세요 2D Test", 50, 50);
		
		g.drawLine(50, 50, 100, 100);
		
		g.drawRect(200, 200, 150, 150);
		
	}

}// end of MyDrawPanel Calss

class MyFrame3 extends JFrame {

	MyDrawPanel3 myDrawPanel;

	public MyFrame3() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("paint 연슴");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myDrawPanel = new MyDrawPanel3();
	}

	public void setInitLayout() {
		setVisible(true);
		add(myDrawPanel);
	}

}// end of MyFRame2 Calss

public class PaintMainTest2 {

	public static void main(String[] args) {

		new MyFrame3();

	}

}
