package ch01;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx1 extends JFrame {
	String[] strArr = { "가", "나", "다", "라", "마", "바" };
	private GridLayout gridLayout;
	private final int BUTTON_SIZE = 6;
	ArrayList<JButton> buttons = new ArrayList<>();

	public GridLayoutEx1() {
		initData();
		setInitData();
	}

	private void initData() {
		setTitle("GridLayout 연습");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		for (int i = 0; i < strArr.length; i++) {
			buttons.add(new JButton(strArr[i]));
		}

		// gridLayout = new GridLayout(3, 2);

	}

	private void setInitData() {
		setVisible(true);
		// setLayout : JFrame 의 배치 관리자
		setLayout(new GridLayout(2, 3));

		for(int i = 0; i < BUTTON_SIZE; i++) {
			add(buttons.get(i));
		}

	}

	public static void main(String[] args) {
		new GridLayoutEx1();
	}

}
