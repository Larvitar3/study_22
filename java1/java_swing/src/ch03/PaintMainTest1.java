package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyDrawPanel extends JPanel {

	@Override
	public void paint(Graphics g) {
		super.paint(g);
//		g.drawString("안녕하세요 2D Test", 50, 50);
//		g.drawLine(50, 50, 100, 100);
//		g.drawRect(200, 200, 150, 150);
		g.drawRect(300, 250, 400, 300);
		g.drawLine(300, 250, 500, 120);
		g.drawLine(500, 120, 700, 250);
		// 집모양 ▲

		g.drawRect(330, 320, 150, 150);
		g.drawRect(340, 330, 130, 130);
		g.drawLine(380, 330, 340, 440);
		g.drawLine(430, 330, 470, 440);
		// 창문 ▲

		g.drawRect(550, 350, 100, 200);
		g.drawString("◎", 565, 460);
		// 문 ▲

		g.drawLine(300, 260, 700, 260);
		g.drawString("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈", 300, 260);
		// 집 꾸미기

		g.drawLine(0, 500, 300, 500);
		g.drawLine(700, 500, 800, 500);

		g.drawString("○", 100, 30);
		g.drawString("○", 180, 70);
		g.drawString("○", 40, 60);
		g.drawString("○", 250, 100);
		g.drawString("○", 300, 180);
		g.drawString("○", 500, 100);
		g.drawString("○", 600, 20);
		g.drawString("○", 400, 50);
		g.drawString("○", 700, 180);
		g.drawString("○", 650, 100);
		g.drawString("○", 90, 300);
		g.drawString("○", 170, 350);
		g.drawString("○", 50, 450);
		g.drawString("○", 80, 400);
		g.drawString("○", 70, 250);
		g.drawString("○", 35, 150);
		g.drawString("○", 200, 200);
		g.drawString("○", 150, 150);

		// 뒷 배경

	}

}// end of MyDrawPanel Calss

class MyFrame2 extends JFrame {

	MyDrawPanel myDrawPanel;

	public MyFrame2() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("paint 연슴");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myDrawPanel = new MyDrawPanel();
	}

	public void setInitLayout() {
		setVisible(true);
		add(myDrawPanel);
	}

}// end of MyFRame2 Calss

public class PaintMainTest1 {

	public static void main(String[] args) {

		new MyFrame2();

	}

}
