package ch05;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame {

	private JTextArea area;

	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("키보드 이벤트 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		area = new JTextArea();
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(area);
	}

	private void addEventListener() {
		
		area.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
//				System.out.println(e.getKeyCode());
//				// 콘솔창에 뜨는거 ▲
//				area.append("key code : " + e.getKeyCode() + "\n");
//				// 창에 뜨는거 ▲
				displayKeyInfo(e);
			}		
		});
	}
	
	private void displayKeyInfo(KeyEvent e) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String info = "c  :  " + c + "\t" + "keyCode : " + keyCode;
		area.append(info + "\n");
	}

//		area.addKeyListener(new KeyListener() {
//
//			@Override
//			public void keyTyped(KeyEvent e) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void keyReleased(KeyEvent e) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void keyPressed(KeyEvent e) {
//				// TODO Auto-generated method stub
//
//			}
//		});


//	@Override
//	public void keyTyped(KeyEvent e) {
//		// 문자를 눌렀을 때 호출.
//		System.out.println("KeyCode : " + e.getKeyCode());
//	}
//
//	@Override
//	public void keyPressed(KeyEvent e) {
//		// 키가 눌러졌을 때
//		System.out.println("KeyPressed : " + e.getKeyCode());
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//		// 키가 떨어졌을 때
//		
//	}

}
