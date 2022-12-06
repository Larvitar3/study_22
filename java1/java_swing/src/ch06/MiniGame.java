package ch06;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiniGame extends JFrame implements KeyListener {

	final int FRAME_WIDTH = 500;
	final int FRAME_HEIGTH = 500;

	int palyerX = 200;
	int palyerY = 270;
	
	boolean flag = true;

	BufferedImage backgroundImg;
	BufferedImage playerImage;
	MyDrawPenel myDrawPenel;

	public MiniGame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {
		setTitle("미니게임");
		setSize(FRAME_WIDTH, FRAME_HEIGTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImg = ImageIO.read(new File("Images/background1.jpg"));
			playerImage = ImageIO.read(new File("Images/player1.png"));
		} catch (IOException e) {
			System.out.println("파일명 및 경로 확장자 확인하기");
			System.exit(0); // 프로그램 자동 종료
		}
		myDrawPenel = new MyDrawPenel();

	}

	public void setInitLayout() {
		setVisible(true);
		this.add(myDrawPenel);
	}

	public void addEventListener() {
		this.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_LEFT) {
			try {
				playerImage = ImageIO.read(new File("Images/player1.png"));
			} catch (IOException e1) {
			}
			palyerX = (palyerX < 0) ? 0 : palyerX - 10;
			palyerX -= 10;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			palyerX = (palyerX > 380) ? 380 : palyerX + 10;
			try {
				playerImage = ImageIO.read(new File("Images/player1reverse.png"));
			} catch (IOException e1) {
			}
			palyerX += 10;
		} else if (keyCode == KeyEvent.VK_UP) {
			palyerY = (palyerY < 10) ? 10 : palyerY - 10;
			palyerY -= 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			palyerY = (palyerY > 320) ? 320 : palyerY + 10;
			palyerY += 10;
		}else if(keyCode == KeyEvent.VK_SPACE ) {
			if(flag == true) {
				try {
					backgroundImg = ImageIO.read(new File("Images/background2.jpg"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				flag = false;
			}else if(flag == false) {
				try {
					backgroundImg = ImageIO.read(new File("Images/background1.jpg"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				flag = true;
			}
			
		}

		// 다시 그림 그리기 (draw의 값을 새로 변경하고 싶을때 사용 *값을 변경하여 재실행 )
		repaint();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	// inner class
	private class MyDrawPenel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			// 불러들이는 객체가 2개 이상이면 사용
			super.paintComponent(g);
			g.drawImage(backgroundImg, 0, 0, FRAME_WIDTH, FRAME_HEIGTH, null);
			g.drawImage(playerImage, palyerX, palyerY, 100, 130, null);
			// 사이즈 조절 / 위치 좌표값을 정할 수 있음 ▲
		}

	}

}
