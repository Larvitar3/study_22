package ch06;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import ch06.MyImageFrame2.MyImagePanel;

public class Game extends JFrame {

	// 1. 객체 생성

	JLabel playerLabel;
	JLabel backgroundLabel;

	BufferedImage bufferedImage;
	MyImagePanel myImagePanel;

	class MyImagePanel extends JLabel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(bufferedImage, 0, 0, 500, 500, null);
		}
	}

	public Game() {
		initData();
		setInitData();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setTitle("키보드 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		playerLabel = new JLabel(new ImageIcon("player1.png"));
		backgroundLabel = new JLabel(new ImageIcon("background1.jpg"));

		try {
			bufferedImage = ImageIO.read(new File("background1.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		myImagePanel = new MyImagePanel();

	}

	private void setInitData() {
		setVisible(true);
		setLayout(null);

		myImagePanel.setSize(500, 500);
		myImagePanel.setLocation(0, 0);
		this.add(myImagePanel);

		myImagePanel.add(playerLabel);
		myImagePanel.setLayout(null);
		playerLabel.setSize(100, 130);
		playerLabel.setLocation(180, 260);
		
	}

	private void addEventListener() {

		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				displayKeyInfo(e);
				System.out.println("실행");
			}

		});
	}
	

	private void displayKeyInfo(KeyEvent e) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		System.out.println("c  :  " + c + "\t" + "keyCode : " + keyCode);
		if (keyCode == 37) {
			playerLabel.setLocation(playerLabel.getX() - 10, playerLabel.getY());
		} else if (keyCode == 39) {
			playerLabel.setLocation(playerLabel.getX() + 10, playerLabel.getY());
		} else if (keyCode == 38) {
			playerLabel.setLocation(playerLabel.getX(), playerLabel.getY() - 10);
		} else if (keyCode == 40) {
			playerLabel.setLocation(playerLabel.getX(), playerLabel.getY() + 10);
		}
		// 만약 playerLabel 의 x와 y값이 좌표 0, 0을 넘어가면 더이상 갈 수 없게 제한
		// 만약 playerLabel 의 x와 y값이 좌표 0, 500을 넘어가면 더이상 갈 수 없게 제한
		// 만약 playerLabel 의 x와 y값이 좌표 500, 0을 넘어가면 더이상 갈 수 없게 제한
		// 만약 playerLabel 의 x와 y값이 좌표 500, 500을 넘어가면 더이상 갈 수 없게 제한

		int playerLabelX = playerLabel.getX();
		int playerLabelY = playerLabel.getY();
		
//		int limit1 = playerLabel.setLocation(0, 0);
		if (playerLabelX < 0) {
			playerLabel.setLocation(180, 260);
		}else if(playerLabelX > 390) {
			playerLabel.setLocation(180, 260);
		}else if(playerLabelY < 0) {
			playerLabel.setLocation(180, 260);
		}else if (playerLabelY > 330) {
			playerLabel.setLocation(180, 260);
		}
		
		if (keyCode == 65) {
			for (int i = 0; i < 10; i++) {
				playerLabel.setLocation(playerLabel.getX() - (1 * i), playerLabel.getY());
			}
		}
	}

}
