package ch04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame3 extends JFrame {

	JButton button1;
	JButton button2;
	JButton button3;

	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				System.out.println("1");
			}else if (e.getSource() == button2){
				System.out.println("2");
			}else {
				System.out.println("3");
			}
			
		}
	};
	
	public ColorChangeFrame3() {
		initData();
		setInitLayout();
		addEventLayout();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
	}

	private void addEventLayout() {

		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		
	}
	
	

	// 추상클래스나 인터페이스도 구현클래스로 만들어서 new키워드를 사용할 수 있다.
	// 단, 추상메서드가 있으면 일반 메서드를 구현해야한다 (강제)

	public static void main(String[] args) {

		// 익명 클래스
		new ColorChangeFrame3();

//		ColorChangeFrame2  myColor = new ColorChangeFrame2();
//		ColorChangeFrame2  myColor2 = new ColorChangeFrame2();

	}

}
