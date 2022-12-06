package ch05;

import java.awt.Graphics;
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

public class MyImageFrame extends JFrame {

	// 재료를 선정 
	//1. JLABEL 사용해서 이미지 그리기 
	//2. 이벤트 리스너 등록 및 구현 
	JLabel playerLabel; 
	JLabel backgroundLabel; 
	BufferedImage bufferedImage;
	MyImagePanel myImagePanel;
	
	// 내부 클래스 
	class MyImagePanel extends JPanel {
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(bufferedImage, 0, 0, 500, 500, null);
		}
	}
	
	
	MouseListener listener = new MouseListener() {
		
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
			int x = e.getX() - (playerLabel.getBounds().width / 2);
			int y = e.getY() - (playerLabel.getBounds().height / 2);
			playerLabel.setLocation(x, y);
		}
	};
	
	public MyImageFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		playerLabel = new JLabel(new ImageIcon("player1.png"));
		backgroundLabel = new JLabel(new ImageIcon("backgroundImage.jpg"));
		
		try {
			bufferedImage = ImageIO.read(new File("backgroundImage.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		myImagePanel = new MyImagePanel(); 
		
	}
	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(null);
		
		myImagePanel.setSize(500, 500);
		myImagePanel.setLocation(0, 0);
		this.add(myImagePanel);
		
		// 좌표 기반 배치관리자 
		// 사이즈, 위치
//		playerLabel.setSize(100, 140);
//		playerLabel.setLocation(100, 100);
		
		//this.add(playerLabel);
		myImagePanel.add(playerLabel);
		
//		backgroundLabel.setSize(500, 500);
//		backgroundLabel.setLocation(0, 0);
//		this.add(backgroundLabel);
		
	}
	private void addEventListener() {
		this.addMouseListener(listener);
	}
	
	
	public static void main(String[] args) {
		new MyImageFrame();
	}
}
