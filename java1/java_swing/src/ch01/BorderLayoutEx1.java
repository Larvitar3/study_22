package ch01;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx1 extends JFrame {

	JButton button1 = new JButton("동");
	JButton button2 = new JButton("서");
	JButton button3 = new JButton("남");
	JButton button4 = new JButton("북");
	JButton button5 = new JButton("센터");

	private BorderLayout borderLayout;

	public BorderLayoutEx1() {
		initData();
		setInitData();
	}

	private void initData() {
		setTitle("BorderLayout 연습");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// JButton 초기화 완료 ( 멤버 변수로 처리 )
		borderLayout = new BorderLayout();
	}

	private void setInitData() {
		setVisible(true);
		setLayout(borderLayout);
		
		add(button1, borderLayout.EAST);
		add(button2, borderLayout.WEST);
		add(button3, borderLayout.SOUTH);
		add(button4, borderLayout.NORTH);
		add(button5, borderLayout.CENTER);
	}

	public static void main(String[] args) {
		new BorderLayoutEx1();
	}

}
