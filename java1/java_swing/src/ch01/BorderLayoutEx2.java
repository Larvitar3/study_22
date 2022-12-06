package ch01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx2 extends JFrame {

	String[] strArr = { "동", "서", "남", "북", "센터" };
	String[] strArr2 = { BorderLayout.EAST, BorderLayout.WEST, BorderLayout.SOUTH, 
			BorderLayout.NORTH, BorderLayout.CENTER};
	ArrayList<JButton> buttons = new ArrayList<>();
	
	private final int BUTTON_SIZE = 5;
	private BorderLayout borderLayout;

	public BorderLayoutEx2() {
		initData();
		setInitData();
	}

	private void initData() {
		setTitle("BorderLayout 연습");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// JButton 초기화 완료 ( 멤버 변수로 처리 )
		borderLayout = new BorderLayout();
		
		for (int i = 0; i < strArr.length; i++) {
			buttons.add(new JButton(strArr[i]));
		}
	}

	private void setInitData() {
		setVisible(true);
		setLayout(borderLayout);
		
		for (int i = 0; i < BUTTON_SIZE; i++) {
			add(buttons.get(i),strArr2[i] );
		}

		
		
//		add(button1, borderLayout.EAST);
//		add(button2, borderLayout.WEST);
//		add(button3, borderLayout.SOUTH);
//		add(button4, borderLayout.NORTH);
//		add(button5, borderLayout.CENTER);
	}

	public static void main(String[] args) {
		new BorderLayoutEx2();
	}

}
