package ch02;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyComponents extends JFrame {

	private JButton button1;
	private JLabel label; // 글자를 넣어 화면에 띄울 수 있다
	private JTextField textField; // 사용자의 입력값을 받을 수 있는 컴포넌트
	private JPasswordField passwordField; // 사용자의 비번을 받는 컴포넌트
	private JCheckBox checkBox; //

	public MyComponents() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("컴포넌트 확인");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("JButton");
		label = new JLabel("로그인하기");
		textField = new JTextField("아이디 입력", 20);
		passwordField = new JPasswordField("비밀번호 입력", 20);
		checkBox = new JCheckBox("동의");
	}
	
	public void inputScannerData(String text) {
		this.textField.setText(text);
	}


	private void setInitLayout() {
		setVisible(true);
		setLayout(null);

		button1.setSize(100, 70);
		button1.setLocation(460, 120);

		label.setSize(150, 30);
		label.setLocation(300, 80);

		textField.setSize(150, 30);
		textField.setLocation(300, 120);

		passwordField.setSize(150, 30);
		passwordField.setLocation(300, 160);

		checkBox.setSize(150, 30);
		checkBox.setLocation(400, 190);

		add(button1);
		add(label);
		add(textField);
		add(passwordField);
		add(checkBox);

	}
}
	
