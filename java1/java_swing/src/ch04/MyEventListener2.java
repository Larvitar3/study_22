package ch04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame4 extends JFrame implements ActionListener{
	private BorderLayout borderLayout;
	
	ArrayList<JButton> buttons = new ArrayList<>();
	private final int BUTTON_SIZE = 3;
	
	
	ArrayList<JPanel> panels = new ArrayList<>();
    private final int PANEL_SIZE = 2;

	
	public MyFrame4() {
		
		initData();
		setInitLayout();
		addEventListener();
		
	}
	
	private void initData() {
		setTitle("EventListener 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		borderLayout = new BorderLayout();
		
		for (int i = 0; i < PANEL_SIZE; i++) {
			panels.add(new JPanel());
		}
		
		
		for (int i = 0; i < BUTTON_SIZE; i++) {
			buttons.add(new JButton("버튼" + ( i + 1 )));
		}

	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(borderLayout);


	}
	
	private void addEventListener() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
	}
}

public class MyEventListener2 {
	public static void main(String[] args) {
		
		new MyFrame4();

		
		
	}
}
