package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {

	// 배열로 만들어서 코드 수정 (for문 사용)
	// 정 가운데 배치

	private FlowLayout flowLayout;
	private JButton[] buttons = new JButton[5];
	
	public FlowLayoutEx3() {
		initData();
		setInitLauout();
		
	}

	// 초기화 과정(값을 넣거나 클래스를 메모리에 올리는 과정)
	private void initData() {
		setTitle("FlowLayout 연습");
		setSize(800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 205);
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + (i+1));
			System.out.println("실행1");
		}
	}

	// GUI 프로그래밍에서 레이아웃을 설정하는 코드
	private void setInitLauout() {
		setVisible(true);
		setLayout(flowLayout);
		
		for(int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
			System.out.println("실행2");
		}
		
	}

	public static void main(String[] args) {

		new FlowLayoutEx3();
	}

}
