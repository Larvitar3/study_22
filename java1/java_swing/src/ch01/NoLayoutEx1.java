package ch01;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx1 extends JFrame{

	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	public NoLayoutEx1() {
		initData();
		setInitLayout();
	}
	
	public void initData() {
		setTitle("좌표값으로 버튼 배치하기");
		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");
	}
	
	public void setInitLayout() {
		setVisible(true);
		// 배치관리자 ( 좌표값으로 배치하기 위해서는 반드시 null값을 넣어야 함)
		setLayout(null);
		
		//get, set
		
		// 버튼의 사이즈를 지정		
		button1.setSize(100,100);
		button2.setSize(100,100);
		button3.setSize(100,100);
		
		// 좌표값을 지정
		button1.setLocation(0, 0);
		button2.setLocation(100, 100);
		button3.setLocation(200, 200);
		
		add(button1);
		add(button2);
		add(button3);
	}
	
	// 버튼의 크기를 지정하는 기능
	private void setMyButtonSize(JButton button, int width, int height) {
		button.setSize(width, height);
		// button1 = w,h 50
		// button2 = w,h 100
		// button3 = w,h 150
		return;
	}
	
	private void setMyButtonPostion() {
		// 겹치지 않게 코드 완성
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new NoLayoutEx1();
	}

}
