package ch03_1;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;



class MyFrame2 extends JFrame {

	MyDrawPanel myDrawPanel;

	public MyFrame2() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("paint 연슴");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myDrawPanel = new MyDrawPanel();
	}

	public void setInitLayout() {
		setVisible(true);
		add(myDrawPanel);
	}

	// 내부클래스
	// 인스턴스 내부 클래스
	// 접근 제어 지시자를 설정할 수 있다.
	
	// static 을 추가하게 되면 정적 내부 클래스 가 된다
	class MyDrawPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawString("안녕하세요 2D Test", 50, 50);
			g.drawLine(50, 50, 100, 100);
			g.drawRect(200, 200, 150, 150);

		}

	}// end of MyDrawPanel Calss
	
}// end of MyFRame2 Calss

public class PaintMainTest1 {

	public static void main(String[] args) {
		
		MyFrame2 frame2 = new MyFrame2();
		
		// 인스턴스 내부 클래스를 사용하는 방법 -----
		
		// 1. 데이터 타입을 선언방법
		// 외부 클래스 이름으로 접근 . 연산자 후에 내부 클래스 데이터 타입을 선언하고 변수명을 지정
		
		// 2. 초기화 하는 방법
		// 외부 클래스가 생성되어있고 참조변수로 접근해서 new 내부믈래스(); 로 메모리에 올릴 수 있다.
		MyFrame2.MyDrawPanel myPanel = frame2.new MyDrawPanel();
		
		// --- 정적 내부 클래스를 사용하는 방법
		// MyFrame2.MyDrawPanel staticMyoanel = new MyFrame2.MyDrawPanel();
		
		
	}

}
