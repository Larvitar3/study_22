package ch05;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;

public class MouesEventListenerEx1 extends JFrame implements MouseInputListener {

	JLabel label;
	final int LABEL_WIDTH = 100;
	final int LABEL_HEIGHT = 100;

	int xPosition = 100;
	int yPosition = 100;

	public MouesEventListenerEx1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Hello, Java");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);

//		// 사이즈 좌표값 위치
//  	label.setSize(100, 100);
//		label.setLocation(100, 100);
		label.setBounds(xPosition, yPosition, LABEL_WIDTH, LABEL_HEIGHT);

		add(label);

	}

	private void addEventListener() {
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// 클릭
		System.out.println("마우스가 클릭되었습니다.");
		System.out.println(e.toString());
		
		Rectangle r = label.getBounds();
		
//		e.getX();
//		e.getY();
//		System.out.println(e.getX());
//		System.out.println(e.getY());
		
		label.setLocation(e.getX() -LABEL_WIDTH , e.getY() -LABEL_HEIGHT);
		System.out.println("bounds : " + label.getBounds());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 눌러졌을때

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 마우스가 떨어졌을때

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 호버

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 지정 나가기

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// 마우스를 드래그 할 때

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// 마우스가 움직일 때

	}

}
