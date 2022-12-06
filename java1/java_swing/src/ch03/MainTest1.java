package ch03;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame {

	ImagePanel imagePanel;

	public MyFrame() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("JPanel에 이미지 넣기");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	public void setInitLayout() {
		setVisible(true);
		add(imagePanel);
	}

	// inner class
	class ImagePanel extends JPanel {

		private Image image;

		public ImagePanel() {
			image = new ImageIcon("image2.jpg").getImage(); // getImage는 형변환
		}

		// 그림을 그려주는 기능
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 0, 0, 400, 400, null);
		}
	} // end of inner class

}

public class MainTest1 {

	public static void main(String[] args) {

		new MyFrame();

	}

}
