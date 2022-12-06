package ch03;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 배경이미지를 사용하는 2번째 방법
public class MyBufferedImage2 extends JFrame {

	private BufferedImage backgroundImage;
	private BufferedImage player;
	private MyImageDrawPanel2 drawPanel;
	private final int PLAYER_WIDTH = 100;
	private final int PLAYER_HEIGHT = 130;
	
	private JLabel player1;
	private JLabel background;
	final int LABEL_WIDTH = 100;
	final int LABEL_HEIGHT = 100;

	MouseListener mouseListener = new MouseListener() {

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			player1.setLocation(player1.getX() + 10, 200);
			System.out.println("실행 중");

		}
	};

	public MyBufferedImage2() {
		initData();
		setInitData();
		addEventListener();
	}

	private void initData() {
		setTitle("이미지 배경 그리기 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		player1 = new JLabel(new ImageIcon("player1.png"));
		background = new JLabel(new ImageIcon("backgroundImage.jpg"));
		drawPanel = new MyImageDrawPanel2();

	}

	private void setInitData() {
		setVisible(true);
		setLayout(null);

		
		player1.setSize(100, 130);
		player1.setLocation(50, 200);
		add(player1);
		
		background.setSize(500, 500);
		background.setLocation(0, 0);
		add(background);

		drawPanel.setLocation(0, 0);
		drawPanel.setSize(500, 500);
		add(drawPanel);

	}

	private void addEventListener() {

		this.addMouseListener(mouseListener);

	}

	private class MyImageDrawPanel2 extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(player, 200, 200, PLAYER_WIDTH, PLAYER_HEIGHT, null);
			System.out.println("사용중");
		}

	} // end of inner class

	public static void main(String[] args) {
		new MyBufferedImage2();
	}

} // end of class
