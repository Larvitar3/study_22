package ch04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame2 extends JFrame {

	JButton button1;
	JButton button2;
	JButton button3;

	public ColorChangeFrame2() {
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

//		temp - 구현클래스
//		ActionListener temp = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		};

		// 익명 구현 클래스
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1번 버튼 클릭");
			}

		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("2번 버튼 클릭");
			}
		});
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("3번 버튼 클릭");
				
			}
		});
		
	}
	
	

	// 추상클래스나 인터페이스도 구현클래스로 만들어서 new키워드를 사용할 수 있다.
	// 단, 추상메서드가 있으면 일반 메서드를 구현해야한다 (강제)

	public static void main(String[] args) {

		// 익명 클래스
		new ColorChangeFrame2();

//		ColorChangeFrame2  myColor = new ColorChangeFrame2();
//		ColorChangeFrame2  myColor2 = new ColorChangeFrame2();

	}

}
