package ch04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame3 extends JFrame implements ActionListener{
	
	JButton button1;
	JButton button2;
	JButton button3;

	JPanel jPanel;
	
	public MyFrame3() {
		
		initData();
		setInitLayout();
		addEventListener();
		
	}
	
	private void initData() {
		setTitle("EventListener 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");
		jPanel = new JPanel();

	}
	
	private void setInitLayout() {
		setVisible(true);
		add(jPanel);
		jPanel.add(button1);
		jPanel.add(button2);
		jPanel.add(button3);

	}
	
	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		// 다운 캐스팅
		JButton tagetButton = (JButton)e.getSource();
		tagetButton.getText();
		
		// 만약 e라는 녀석에 주체가 넘어온다면 현재 객체와 같은지 확인.
		if(tagetButton.getText().equals(button1.getText())) {
			System.out.println("버튼 1이 눌러졌습니다.");
			jPanel.setBackground(Color.MAGENTA);
		}else if(tagetButton.getText().equals(button2.getText())){
			System.out.println("버튼 2가 눌러졌습니다.");
			jPanel.setBackground(Color.CYAN);
		}else if(tagetButton.getText().equals(button3.getText())) {
			System.out.println("버튼 3가 눌러졌습니다.");
			jPanel.setBackground(Color.ORANGE);
		}
		
	}
}

public class MyEventListener1 {
	public static void main(String[] args) {
		
		new MyFrame3();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
